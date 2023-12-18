package Model;

import Controller.GameController;
import Model.PlayerModel;
import Model.UnPossessable;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author yptr2
 */
public class AllUnPossessable extends UnPossessable {

    public AllUnPossessable(int number, String name) {
        super(number, name);
    }

    @Override
    public void action(PlayerModel player, GameController mainController) {
        Graphics gMap = mainController.getMap().getGraphics();
        Font font = new Font("Cordia New", Font.BOLD, 20);
        gMap.setFont(font);
        String text = "";
        if ((number == 2) || (number == 17) || (number == 33)) {
            TreasureCardModel t = new TreasureCardModel();
            text = "Pick Treasure Card ID :" + t.getID();
            gMap.drawString(text, 100, 200);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
            }
            mainController.getMap().repaint();
            t.action(player, mainController);
        } else if ((number == 7) || (number == 22) || (number == 36)) {
            LuckyCardModel l = new LuckyCardModel();
            text = "Pick Lucky Card ID : " + l.getID();
            gMap.drawString(text, 100, 200);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
            }
            mainController.getMap().repaint();
            l.action(player, mainController);
        } else if ((number == 10) || (number == 20)) {
            text = "หยุดเล่น 1 เทิร์น";
            gMap.drawString(text, 100, 200);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
            }
            mainController.getMap().repaint();
            player.setIsStop(true);
        } else if (number == 30) {
            text = "ไปเข้าคุก!";
            gMap.drawString(text, 100, 200);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
            }
            mainController.getMap().repaint();
            player.setX_pos(470);
            player.setY_pos(470);
            player.setPosition(10);
            player.setIsStop(true);
            mainController.getMap().repaint();
        } else if (number == 38) {
            text = "เสียภาษีให้ประเทศ 2000 บาท";
            gMap.drawString(text, 100, 200);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
            }
            mainController.getMap().repaint();
            player.setMoney(player.getMoney() - 2000);
        }
    }
}
