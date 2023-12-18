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

public class BookView implements ActionListener{
    private JFrame frame;
    private JPanel p1, p2, p3, p4, p5;
    private JLabel name, price, type;
    private JTextField tf1, tf2, tf3;
    private JButton add, update, delete, left, right;
    private JComboBox cb;
    
    public BookView(){
        frame = new JFrame("BookView");
        
        name = new JLabel(" Name ");
        tf1 = new JTextField();

        price = new JLabel(" Price ");
        tf2 = new JTextField();

        type = new JLabel(" Type ");
        cb = new JComboBox();
        cb.addItem("General");
        cb.addItem("Computer");
        cb.addItem("Math&Sci");
        cb.addItem("Photo");
        
        left = new JButton("<<<");
        tf3 = new JTextField("0");
        right = new JButton(">>>");
        
        add = new JButton("Add");
        update = new JButton("Update");
        delete = new JButton("Delete");
        
        //set Layout
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
        p4.add(left);
        p4.add(tf3);
        p4.add(right);
        
        p5 = new JPanel();
        p5.setLayout(new FlowLayout());
        p5.add(add);
        p5.add(update);
        p5.add(delete);
        
        ///addactionlistener
        add.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);
        
        frame.setLayout(new GridLayout(5, 1));
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);
        frame.add(p5);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        
    }
    public static void main(String[] args){
            new BookView();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(add)){
            BookAdd ba = new BookAdd();
        }
    }
    
}
