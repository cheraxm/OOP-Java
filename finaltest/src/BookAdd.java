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

public class BookAdd{
    private JFrame frame;
    private JLabel name, price, type;
    private JTextField tf1, tf2;
    private JComboBox cb;
    private JButton insert;
    private JPanel p1, p2, p3, p4;
    
    public BookAdd(){
        frame = new JFrame("BookAdd");
        
        name = new JLabel(" Name");
        tf1 = new JTextField();
        
        price = new JLabel(" Price");
        tf2 = new JTextField();
        
        type = new JLabel(" Type");
        cb = new JComboBox();
        cb.addItem("Genetal");
        cb.addItem("Computer");
        cb.addItem("Math&Sci");
        cb.addItem("Photo");
        
        insert = new JButton("Insert");
        
        p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 2));
        p1.add(name);
        p1.add(tf1);
        
        p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 2));
        p2.add(price);
        p2.add(tf2);
        
        p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 2));
        p3.add(type);
        p3.add(cb);
        
        p4 = new JPanel();
        p4.setLayout(new FlowLayout());
        p4.add(insert);
        
        frame.setLayout(new GridLayout(4, 1));
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);
        
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        
    }
    public static void main(String[] args) {
        new BookAdd();
    }
    
    
}
