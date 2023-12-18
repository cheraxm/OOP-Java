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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class ChatDemo implements ActionListener, WindowListener{
    private JFrame fr;
    private JTextArea ta;
    private JTextField tf;
    private JButton b1, b2;
    private JPanel p;
    private String txt;
    
    public ChatDemo(){
        fr = new JFrame("ChatDemo");
        fr.addWindowListener(this);
        txt = "";
        
        ta = new JTextArea(20,45);
        ta.setEditable(false);
        
        tf = new JTextField(45);
        
        b1 = new JButton("Submit");
        b2 = new JButton("Reset");
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        p = new JPanel();
        p.setLayout(new FlowLayout());
        p.add(b1);
        p.add(b2);
        
        fr.add(ta, BorderLayout.NORTH);
        fr.add(tf, BorderLayout.CENTER);
        fr.add(p, BorderLayout.SOUTH);
        
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    public static void main(String[] args) {
        new ChatDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(b1)){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            ta.setText(ta.getText() + dtf.format(LocalDateTime.now())+" "+tf.getText()+ "\n");
            tf.setText("");
        }
        else if(e.getSource().equals(b2)){
            ta.setText("");
        }
        
    }
    public String loadfile(){
        txt = "";
        try{
            int ch;
            FileReader fr = new FileReader("Chat.dat");
            while ((ch=fr.read()) != -1){
                System.out.print((char)ch);
                txt += (char) ch;
            }
            ta.setText(txt);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return txt;
    }
    public void savefile(){
        try{
            FileWriter fw = new FileWriter("Chat.dat");
//            for (int ch = 0 ; ch<txt.length(); ch++){
//                fw.write(txt.charAt(ch));
//            }
//            txt = ta.getText();
             fw.write(ta.getText());
        }
        
        
        catch(IOException e){
            e.printStackTrace();
        }
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        loadfile();
    }

    @Override
    public void windowClosing(WindowEvent e){
        savefile();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e){
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
