/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.GameController;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author armmy
 */
public class MainGameView extends JPanel{
    private MapView map;
    private DisplayView display;

    public MainGameView() {   
        setLayout(null);
        setSize(1024, 640);
        
        display = new DisplayView();
        map = new MapView();
        
        add(map); add(display);
    }

    public MapView getMap() {
        return map;
    }

    public DisplayView getDisplay() {
        return display;
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
//        paint map
        

//        paint player

    }
    
    
}
