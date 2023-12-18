/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chuti
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class calculator implements ActionListener {
    private JFrame fr;
    private JPanel p1,p2;
    private JTextField txt1, txt2, txt3;
    private JButton btn1, btn2, btn3, btn4;
    private Double num;
    
    public calculator(){
        fr = new JFrame("calculator");
        p1 = new JPanel();
        p2 = new JPanel();
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        btn1 = new JButton("+");
        btn2 = new JButton("-");
        btn3 = new JButton("*");
        btn4 = new JButton("/");
        
        // Add Listener
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
 
        // Set Layout
        p1.setLayout(new GridLayout(4,1));
        p1.add(txt1);
        p1.add(txt2);
        p1.add(p2);
        p1.add(txt3);
        
        p2.setLayout(new FlowLayout());
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);
        p2.add(btn4);
        fr. getContentPane().add(p1);
 
        // Set JFrame Property
        fr.setFont(new Font("TimesRoman",Font.BOLD,60));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new calculator();
    }
    
    @Override
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(btn1)){
            num = Double.parseDouble(txt1.getText()) + Double.parseDouble(txt2.getText());
        }else if(ae.getSource().equals(btn2)){
            num = Double.parseDouble(txt1.getText()) - Double.parseDouble(txt2.getText());
        }else if(ae.getSource().equals(btn3)){
            num = Double.parseDouble(txt1.getText()) * Double.parseDouble(txt2.getText());
        }else if(ae.getSource().equals(btn4)){
            num = Double.parseDouble(txt1.getText()) / Double.parseDouble(txt2.getText());
        }
        txt3.setText(Double.toString(num));
    }
    
}
