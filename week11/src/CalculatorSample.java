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

public class CalculatorSample implements ActionListener {
    private JFrame fr;
    private JTextField tf;
    private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16;
    private JPanel p;
    private String opera;
    private Double num2;
    private Double num3;
    private Double ans;
    
    public CalculatorSample(){
        fr = new JFrame("My Calculator");
        tf = new JTextField();
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");
        bt6 = new JButton("6");
        bt7 = new JButton("7");
        bt8 = new JButton("8");
        bt9 = new JButton("9");
        bt10 = new JButton("0");
        
        bt11 = new JButton("c");
        bt12 = new JButton("=");
        
        bt13 = new JButton("+");
        bt14 = new JButton("-");
        bt15 = new JButton("*");
        bt16 = new JButton("/");
        
        p = new JPanel();
        p.setLayout(new GridLayout(4,4));
        p.add(bt7);
        p.add(bt8);
        p.add(bt9);
        p.add(bt13);
        p.add(bt4);
        p.add(bt5);
        p.add(bt6);
        p.add(bt14);
        p.add(bt1);
        p.add(bt2);
        p.add(bt3);
        p.add(bt15);
        p.add(bt10);
        p.add(bt11);
        p.add(bt12);
        p.add(bt16);
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        bt10.addActionListener(this);
        bt11.addActionListener(this);
        bt12.addActionListener(this);
        bt13.addActionListener(this);
        bt14.addActionListener(this);
        bt15.addActionListener(this);
        bt16.addActionListener(this);
        
        
        fr.add(tf,BorderLayout.NORTH);
        fr.add(p);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorSample();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(bt13)){
            num2 = Double.parseDouble(tf.getText());
            tf.setText("");
            opera = "+";
        }
        else if(ae.getSource().equals(bt14)){
            num2 = Double.parseDouble(tf.getText());
            tf.setText("");
            opera = "-";
        }
        else if(ae.getSource().equals(bt15)){
            num2 = Double.parseDouble(tf.getText());
            tf.setText("");
            opera = "*";
        }
        else if(ae.getSource().equals(bt16)){
            num2 = Double.parseDouble(tf.getText());
            tf.setText("");
            opera = "/";
        }
        else if(ae.getSource().equals(bt1)){
            tf.setText(tf.getText() + "1");
        }
        else if(ae.getSource().equals(bt2)){
            tf.setText(tf.getText() + "2");
        }
        else if(ae.getSource().equals(bt3)){
            tf.setText(tf.getText() + "3");
        }
        else if(ae.getSource().equals(bt4)){
            tf.setText(tf.getText() + "4");
        }
        else if(ae.getSource().equals(bt5)){
            tf.setText(tf.getText() + "5");
        }
        else if(ae.getSource().equals(bt6)){
            tf.setText(tf.getText() + "6");
        }
        else if(ae.getSource().equals(bt7)){
            tf.setText(tf.getText() + "7");
        }
        else if(ae.getSource().equals(bt8)){
            tf.setText(tf.getText() + "8");
        }
        else if(ae.getSource().equals(bt9)){
            tf.setText(tf.getText() + "9");
        }
        else if(ae.getSource().equals(bt10)){
            tf.setText(tf.getText() + "0");
        }
        else if(ae.getSource().equals(bt11)){
            opera = "c";
            tf.setText("");
        }
        else if(ae.getSource().equals(bt12)){
            num3 = Double.parseDouble(tf.getText());
            if(opera.equals("+")){
                ans = num2 + num3;
            }
            else if(opera.equals("-")){
                ans = num2 - num3;
            }
            else if(opera.equals("*")){
                ans = num2 * num3;
            }
            else if(opera.equals("/")){
                ans = num2 / num3;
            }
            opera = "=";
            tf.setText(Double.toString(ans));
        }
    }
}