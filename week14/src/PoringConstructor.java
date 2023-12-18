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

public class PoringConstructor implements ActionListener{
    private JFrame frame;
    private JButton addbutton;
    private Thread th;
    private Poring poring;
    
    public PoringConstructor(){
        frame = new JFrame();
        addbutton = new JButton("add");
        
        frame.add(addbutton);
        addbutton.addActionListener(this);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        new Poring();
    }
    public static void main(String[] args) {
        new PoringConstructor();
    }
}
