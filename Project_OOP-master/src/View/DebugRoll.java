/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author armmy
 */

import java.awt.*;
import javax.swing.*;

public class DebugRoll {
    private JFrame fr;
    private JTextField point1, point2;
    private JButton go;

    public DebugRoll() {
        fr = new JFrame();
        point1 = new JTextField();
        point2 = new JTextField();
        go = new JButton("Go");
        
        fr.setLayout(new GridLayout(3, 1));
        fr.add(point1); fr.add(point2); fr.add(go);
        fr.pack();
        fr.setVisible(true);
    }

    public int getPoint1() {
        return Integer.valueOf(point1.getText());
    }
    
    public int getPoint12() {
        return Integer.valueOf(point2.getText());
    }

    public JButton getGo() {
        return go;
    }
    
    
}
