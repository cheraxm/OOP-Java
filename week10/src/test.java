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
public class test {
    private JFrame fr;
    private JPanel pn;
    private JButton bn1;
    public test(){
        fr = new JFrame();
        pn = new JPanel();
        bn1 = new JButton("test");
        pn.add(bn1);
        fr.add(pn);
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new test();
    }
}
