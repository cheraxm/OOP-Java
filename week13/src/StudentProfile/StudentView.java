/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentProfile;

/**
 *
 * @author chuti
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class StudentView implements ActionListener, WindowListener{
    private JFrame f;
    private JLabel l1, l2, l3;
    private JTextField tf1, tf2, tf3;
    private JButton b1, b2;
    private JPanel p1, p2, p3, p4;
    
    private File files;
    private Student s;
    
    public StudentView(){
        f = new JFrame();
        s = new Student();
        p1 = new JPanel();
        l1 = new JLabel(" ID :");
        tf1 = new JTextField();
        p1.setLayout(new GridLayout(1, 2));
        p1.add(l1);
        p1.add(tf1);
        
        p2 = new JPanel();
        l2 = new JLabel(" Name :");
        tf2 = new JTextField();
        p2.setLayout(new GridLayout(1, 2));
        p2.add(l2);
        p2.add(tf2);
        
        p3 = new JPanel();
        l3 = new JLabel(" Money :");
        tf3 = new JTextField("0");
        p3.setLayout(new GridLayout(1, 2));
        p3.add(l3);
        p3.add(tf3);
        
        p4 = new JPanel();
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        p4.setLayout(new FlowLayout());
        p4.add(b1);
        p4.add(b2);
        
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.setLayout(new GridLayout(4, 1));
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.addWindowListener(this);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
            
        @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource().equals(b1)){
                s.setMoney(s.getMoney()+100);
                tf3.setText(Integer.toString(s.getMoney()));
            }
            else if(ae.getSource().equals(b2)){
                if(s.getMoney() <= 0){
                    s.setMoney(0);
                }
                else{
                    s.setMoney(s.getMoney() - 100);
                }
                tf3.setText(Integer.toString(s.getMoney()));
            }
            
        }
        public void saveText(){
        try {
            FileOutputStream fOut = new FileOutputStream("StudentM.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);
            oout.writeObject(s);
            oout.close();
            fOut.close();
            System.out.printf("Serialized data is saved");
            } catch (IOException i) {
            i.printStackTrace();
            }
    }
    public Student loadText(){
        try {FileInputStream fin = new FileInputStream("StudentM.dat");
            ObjectInputStream in = new ObjectInputStream(fin);
            s = (Student) in.readObject();
            if(s == null){
                s = new Student();
            }
            in.close();
            fin.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c){
            c.printStackTrace();
        }
        return s;
    }
     @Override
    public void windowClosing(WindowEvent we){
        s.setID(Integer.valueOf(tf1.getText()));
        s.setName(tf2.getText());
        s.setMoney(Integer.valueOf(tf3.getText()));
        saveText();
    }
    @Override
    public void windowOpened(WindowEvent we){
        Student data = loadText();
        tf1.setText(String.valueOf(s.getID()));
        tf2.setText(s.getName());
        tf3.setText(String.valueOf(s.getMoney()));
    }
    @Override
    public void windowActivated(WindowEvent we){}
    @Override
    public void windowIconified(WindowEvent we){}
    @Override
    public void windowClosed(WindowEvent we){}
    @Override
    public void windowDeactivated(WindowEvent we){}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    public static void main(String[] args) {
         new StudentView();
//         // System.out.println("Name: " + s.name);
//         // System.out.println("ID: " + s.id);
     }

}
