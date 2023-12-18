/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author armmy
 */

import com.sun.jdi.connect.Connector;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OptionView{
    public static final int FIRST_OPTION = 1;
    public static final int SECOND_OPTION = 2;
    public static final int THIRD_OPTION = 3;
    private static  int option_selected = 0;
    public static int showOption(JFrame parent, String qusetion, String option1, String option2) {
        JDialog fr = new JDialog(parent, "", true);
        JPanel panel = new JPanel(new BorderLayout());
        JLabel question_display = new JLabel(qusetion);
        question_display.setFont(new Font("Cordia New", Font.BOLD, 16));
        JPanel btn = new JPanel();
        JButton btn1 = new JButton(option1);
        JButton btn2 = new JButton(option2);
        
        panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        panel.add(question_display, BorderLayout.CENTER);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                option_selected = 1;
                fr.dispose();
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                option_selected = 2;
                fr.dispose();
            }
        });
        
        btn.add(btn1); btn.add(btn2);
        panel.add(btn, BorderLayout.SOUTH);
        fr.setContentPane(panel);
        fr.pack();
        fr.setLocationRelativeTo(parent);
        fr.setVisible(true);
        
        if (fr.isActive()) {
            fr.dispose();
        }
        
       return option_selected;
    }
    
    public static int showOption(JFrame parent, String qusetion, String option1, String option2, String option3) {
        JDialog fr = new JDialog(parent, "", true);
        JPanel panel = new JPanel(new BorderLayout());
        JLabel question_display = new JLabel(qusetion);
        question_display.setFont(new Font("Cordia New", Font.BOLD, 16));
        JPanel btn = new JPanel();
        JButton btn1 = new JButton(option1);
        JButton btn2 = new JButton(option2);
        JButton btn3 = new JButton(option3);
        
        panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        panel.add(question_display, BorderLayout.CENTER);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                option_selected = 1;
                fr.dispose();
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                option_selected = 2;
                fr.dispose();
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                option_selected = 3;
                fr.dispose();
            }
        });
        
        btn.add(btn1); btn.add(btn2); btn.add(btn3);
        panel.add(btn, BorderLayout.SOUTH);
        fr.setContentPane(panel);
        fr.pack();
        fr.setLocationRelativeTo(parent);
        fr.setVisible(true);
        
        if (fr.isActive()) {
            fr.dispose();
        }
        
       return option_selected;
    }
    
    public static void alertMessage(JFrame parent, String text) {
        JDialog fr = new JDialog(parent, "", true);
        JPanel panel = new JPanel(new BorderLayout());
        JLabel question_display = new JLabel(text);
        question_display.setFont(new Font("Cordia New", Font.BOLD, 16));
        JPanel btn = new JPanel();
        JButton btn1 = new JButton("OK");
        
        panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        panel.add(question_display, BorderLayout.CENTER);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.dispose();
            }
        });
        
        btn.add(btn1);
        panel.add(btn, BorderLayout.SOUTH);
        fr.setContentPane(panel);
        fr.pack();
        fr.setLocationRelativeTo(parent);
        fr.setVisible(true);
        
        if (fr.isActive()) {
            fr.dispose();
        }
    }
}
