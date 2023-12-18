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
import java.util.Random;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Poring implements MouseListener, Runnable{
    private JFrame frame;
    private JLabel label, numlabel;
    private static int num;
    private Thread t;
    public Poring(){
        num++;
        frame = new JFrame();
        label = new JLabel(new ImageIcon("C:\\Users\\chuti\\Downloads\\pngegg.png"));
        numlabel = new JLabel(num+"");
        
        frame.add(label);
        frame.add(numlabel);
        frame.setLayout(new FlowLayout());
        
        
        frame.pack();
        frame.addMouseListener(this);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        t = new Thread(this);
        t.start();
        
    }  
    public static void main(String[] args) {
        new Poring();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        frame.dispose();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private void dispose(){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public void run(){
        try{
            System.out.println("test");
            //frame.setLocation(new Ramdom().nextInt(11800),new Random().nextInt(11800));
            while(true){
                frame.setLocation(new Ramdom().nextInt(11800),new Random().nextInt(11800));
                System.out.println("estestset");
                t.sleep(220);
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
