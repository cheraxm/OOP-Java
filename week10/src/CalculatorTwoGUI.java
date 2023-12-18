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
public class CalculatorTwoGUI {
    private JFrame fr;
    private JTextField tf;
    private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16;
    private JPanel p;
    public CalculatorTwoGUI(){
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
        
        fr.add(tf,BorderLayout.NORTH);
        fr.add(p);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}
