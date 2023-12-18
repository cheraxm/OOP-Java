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
    private JFrame fr;
    private JButton add;
    
    public PoringConstructor(){
        fr = new JFrame();
        add = new JButton("Add");
        
        add.addActionListener(this);
        fr.add(add, BorderLayout.CENTER);
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new PoringConstructor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(add)){
            Poring f = new Poring();
            Thread t = new Thread(f);
            t.start();
        }
        
    }
}
