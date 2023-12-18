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

public class TellerGUI implements ActionListener {
    private JFrame fr;
    private JButton bt1, bt2, bt3;
    private JLabel label1, label2;
    private JTextField tf1, tf2;
    private JPanel p1, p2;
    private Double balance,amount;
    private Account ac;
    
    public TellerGUI(){
        ac = new Account(6000, "Chaaim");
        fr = new JFrame("Teller GUI");
        label1 = new JLabel("Balance ");
        label2 = new JLabel("Amount ");
        tf1 = new JTextField(ac.getBalance() + "");
        tf2 = new JTextField();
        bt1 = new JButton("Deposit");
        bt2 = new JButton("Withdraw");
        bt3 = new JButton("Exit");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        
        
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
    @Override
    public void actionPerformed(ActionEvent ae){
//        Account ac = new Account(0, "Chaaim");
        if (ae.getSource().equals(bt1)){
            ac.deposit(Double.valueOf(tf2.getText()));
//            System.out.println("hi");
            tf1.setText(ac.getBalance()+"");
        }
        else if(ae.getSource().equals(bt2)){
            ac.withdraw(Double.valueOf(tf2.getText()));
            tf1.setText(ac.getBalance()+"");
        }
        else if(ae.getSource().equals(bt3)){
            fr.dispose();
        }
    }
}
