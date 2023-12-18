/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chuti
 */
import javax.swing.*;
import java.awt.*;
public class CalculaterOneGUI {
    private JFrame fr;
    private JTextField tf1, tf2, tf3;
    private JButton bt1, bt2, bt3, bt4;
    private JPanel p;
    public CalculaterOneGUI(){
        fr = new JFrame("Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf1 = new JTextField();
        tf2 = new JTextField();
        fr.add(tf1);
        fr.add(tf2);
        p = new JPanel();
        p.setLayout(new FlowLayout());
        bt1 = new JButton("+");
        bt2 = new JButton("-");
        bt3 = new JButton("*");
        bt4 = new JButton("/");
        p.add(bt1);
        p.add(bt2);
        p.add(bt3);
        p.add(bt4);
        fr.add(p);
        tf3 = new JTextField();
        fr.add(tf3);
        fr.setLayout(new GridLayout(4,1));
        fr.pack();
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculaterOneGUI();
    }
    
}
