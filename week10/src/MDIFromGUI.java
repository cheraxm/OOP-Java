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
public class MDIFromGUI {
    private JFrame fr;
    private JDesktopPane dp;
    private JMenuBar mb;
    private JMenu m1, m2, m3, mi1;
    private JMenuItem mi2, mi3, mi4, mi5, mi6;
    private JInternalFrame frame1, frame2, frame3;
    
    public MDIFromGUI(){
        fr = new JFrame("SubMenuItem Demo");
        
        dp = new JDesktopPane();
        dp.setBackground(Color.BLACK);
        
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        fr.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        mi1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        m1.add(mi1);
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        
        mi5 = new JMenuItem("Window");
        mi6 = new JMenuItem("Message");
        mi1.add(mi5);
        mi1.addSeparator();
        mi1.add(mi6);
        
        frame1 = new JInternalFrame("Application01",true, true, true, true);
        frame2 = new JInternalFrame("Application02",true, true, true, true);
        frame3 = new JInternalFrame("Application03,true, true, true, true");
        frame1.setBounds(250,100,200,200);
        frame1.setVisible(true);
        frame2.setBounds(500,320,200,200);
        frame2.setVisible(true);
        frame3.setBounds(1000,100,200,200);
        frame3.setVisible(true);
        
        dp.add(frame1);
        dp.add(frame2);
        dp.add(frame3);
        
        fr.add(dp, BorderLayout.CENTER);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(200,200);
        fr.setVisible(true);
        
    }
    public static void main(String[] args) {
        new MDIFromGUI();
    }
    
}
