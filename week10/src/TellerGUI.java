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
public class TellerGUI {
    private JFrame fr;
    private JButton bt1, bt2, bt3;
    private JLabel label1, label2;
    private JTextField tf1, tf2;
    private JPanel p1, p2;
    
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        label1 = new JLabel("Balance ");
        label2 = new JLabel("Amount ");
        tf1 = new JTextField("6000");
        tf2 = new JTextField();
        bt1 = new JButton("Deposit");
        bt2 = new JButton("Withdraw");
        bt3 = new JButton("Exit");
        
        p1 = new JPanel();
        p1.setLayout(new GridLayout(2,2));
        tf1.setEditable(false);
        p1.add(label1);
        p1.add(tf1);
        p1.add(label2);
        p1.add(tf2);
        
        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(bt1);
        p2.add(bt2);
        p2.add(bt3);
        
        fr.setLayout(new GridLayout(2,1));
        fr.add(p1);
        fr.add(p2);
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        new TellerGUI();
    }
    
}
