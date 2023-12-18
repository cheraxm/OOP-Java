/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.HomePageController;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author armmy
 */
public class HomePageView extends JFrame{
    private JPanel p1, p2, p3, p4, comboBox, btn;
    private JComboBox numberPlayer;
    private JLabel lab_p1, lab_p2, lab_p3, lab_p4, lab_number;
    private JTextField name_p1, name_p2, name_p3, name_p4;
    private JButton start;
    
    public HomePageView() {
        setLayout(new GridLayout(6, 1));
        
        p1 = new JPanel(new GridLayout(1, 2));
        p2 = new JPanel(new GridLayout(1, 2));
        p3 = new JPanel(new GridLayout(1, 2));
        p4 = new JPanel(new GridLayout(1, 2));
        comboBox = new JPanel();
        btn = new JPanel();
        
        numberPlayer = new JComboBox();
        numberPlayer.addItem("2Player");
        numberPlayer.addItem("3Player");
        numberPlayer.addItem("4Player");
        numberPlayer.setSelectedItem("2Player");
        
        lab_p1 = new JLabel("Player1 Name :");
        lab_p2 = new JLabel("Player2 Name :");
        lab_p3 = new JLabel("Player3 Name :");
        lab_p4 = new JLabel("Player4 Name :");
        lab_number = new JLabel("Number of player :");
        
        name_p1 = new JTextField();
        name_p2 = new JTextField();
        name_p3 = new JTextField();
        name_p4 = new JTextField();
        
        start = new JButton("Start!");
        
        p1.add(lab_p1); p1.add(name_p1);
        p2.add(lab_p2); p2.add(name_p2);
        p3.add(lab_p3); p3.add(name_p3);
        p4.add(lab_p4); p4.add(name_p4);
        comboBox.add(lab_number); comboBox.add(numberPlayer);
        btn.add(start);
        
        add(p1); add(p2); add(p3); add(p4);
        add(comboBox); add(btn);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public JComboBox getNumberPlayer() {
        return numberPlayer;
    }

    public JTextField getName_p1() {
        return name_p1;
    }

    public JTextField getName_p2() {
        return name_p2;
    }

    public JTextField getName_p3() {
        return name_p3;
    }

    public JTextField getName_p4() {
        return name_p4;
    }

    public JButton getStart() {
        return start;
    }
    
    
}
