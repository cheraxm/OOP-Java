/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.GameController;
import Model.MapModel;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author armmy
 */
public class MapView extends JPanel{
    private JButton roll;
    public MapView() {
        setBounds(40, 40, 520, 521);
        this.setBackground(Color.yellow);
        setLayout(new GridBagLayout());
        
        roll = new JButton("Roll!");
        add(roll);
    }

    public JButton getRoll() {
        return roll;
    }
    
    
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.black);
        int position; //debug
        int x = 0,  y = 0, amount = 40;
        int corner = amount/4;
        for (int i = 0; i < amount; i++) {
//            debug
            position = i+30;
            if (position > 39){
                position-=40;
            }
            g2.drawString(""+position, x, y+40);
            
            if (i == 0){
                g2.drawRect(x, y, 80, 80);
                y+=80;
            }else if (i < corner){
                g2.drawRect(x, y, 80, 40);
                y+=40;
            }else if (i == corner){
                g2.drawRect(x, y, 80, 80);
                x+=80;
            }else if(i < corner*2){
                g2.drawRect(x, y, 40, 80);
                x+=40;
            }else if (i == corner*2){
                g2.drawRect(x, y, 80, 80);
                y-=40;
            }else if(i < corner*3){
                g2.drawRect(x, y, 80, 40);
                y-=40;
            }else if (i == corner*3){
                y-=40;
                g2.drawRect(x, y, 80, 80);
                x-=40;
            }else if(i < corner*4){
                g2.drawRect(x, y, 40, 80);
                x-=40;
            }
        }
        
        for (int i = 0; i < GameController.getAllPlayer().length; i++) {
            switch (i) {
                case 0:
                    g2.setColor(Color.red);
                    g2.fillRect(GameController.getPlayer(i).getX_pos(), GameController.getPlayer(i).getY_pos(), GameController.getPlayer(i).getWidth(), GameController.getPlayer(i).getHeight());
                    break;
                case 1:
                    g2.setColor(Color.BLUE);
                    g2.fillRect(GameController.getPlayer(i).getX_pos(), GameController.getPlayer(i).getY_pos(), GameController.getPlayer(i).getWidth(), GameController.getPlayer(i).getHeight());
                    break;
                case 2:
                    g2.setColor(Color.GREEN);
                    g2.fillRect(GameController.getPlayer(i).getX_pos(), GameController.getPlayer(i).getY_pos(), GameController.getPlayer(i).getWidth(), GameController.getPlayer(i).getHeight());
                    break;
                case 3:
                    g2.setColor(Color.BLACK);
                    g2.fillRect(GameController.getPlayer(i).getX_pos(), GameController.getPlayer(i).getY_pos(), GameController.getPlayer(i).getWidth(), GameController.getPlayer(i).getHeight());
                    break;
                default:
                    break;
            }
        }
    }
}
