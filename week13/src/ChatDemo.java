/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chuti
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatDemo implements ActionListener, WindowListener{
    private JFrame f;
    private JTextArea ta;
    private JTextField tf;
    private JButton b1, b2;
    private JPanel p;
    private String str;
    private File files;
    
    public ChatDemo(){
        f = new JFrame();
        
        files = new File("Chatdemo.dat");
        try {
            files.createNewFile();
        } catch(IOException ex){
            ex.printStackTrace();
        }
        ta = new JTextArea(20, 45);
        ta.setEditable(false);
        f.add(ta, BorderLayout.NORTH);
        
        tf = new JTextField(45);
        f.add(tf, BorderLayout.CENTER);
        
        b1 = new JButton("Submit");
        b2 = new JButton("Reset");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.addWindowListener(this);
        
        p = new JPanel();
        p.setLayout(new FlowLayout());
        p.add(b1);
        p.add(b2);
        f.add(p, BorderLayout.SOUTH);
        
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String[] args){
            new ChatDemo();
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(b1)){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//            dtf.format(LocalDateTime.now());
            ta.setText(ta.getText() + dtf.format(LocalDateTime.now())+" "+tf.getText()+ "\n");
            tf.setText("");
        }
        else if(ae.getSource().equals(b2)){
            ta.setText("");
        }
    }
    public void savefile(String str){
        try(FileWriter fout = new FileWriter(files)){
            for(int i = 0; i < str.length(); i++)
                fout.write(str.charAt(i));
        }
        catch(IOException e){
             e.printStackTrace();
        }
    }
    public String loadfile(){
        try(FileReader fin = new FileReader(files)){
            int ch;
            while((ch = fin.read()) != -1){
                str += (char) ch;
            }
        }
        catch(IOException e){
             e.printStackTrace();
        }
        return str;
    }
    @Override
    public void windowOpened(WindowEvent we){
        loadfile();
        ta.setText(str);
    }
    @Override
    public void windowClosing(WindowEvent we){
        str = ta.getText();
        savefile(str);
    }
    @Override
    public void windowClosed(WindowEvent we){
    }
    @Override
    public void windowIconified(WindowEvent we){
    }
    @Override
    public void windowDeiconified(WindowEvent we){
    }
    @Override
    public void windowDeactivated(WindowEvent we){
    }
    @Override
    public void windowActivated(WindowEvent we){
    }
    
    
}
