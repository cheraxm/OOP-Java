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

public class Poring implements Runnable, MouseListener{
    private JFrame fr;
    private JLabel lb, show;
    private static int num = 0;
    
    public Poring(){
        fr = new JFrame();
        lb = new JLabel(new ImageIcon("poring/poring1.png"));
        show = new JLabel(num+"");
        num++;
        
        fr.addMouseListener(this);
        
        fr.add(show, BorderLayout.WEST);
        fr.add(lb, BorderLayout.CENTER);
        fr.pack();
        fr.setVisible(true);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
//    public static void main(String[] args) {
//        new Poring();
//    }
    public void run(){
        while(true){
            fr.setLocation(new Random().nextInt(1000),new Random().nextInt(1000));
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
            }
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource().equals(fr)){
            fr.dispose();
        }
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
    
}
