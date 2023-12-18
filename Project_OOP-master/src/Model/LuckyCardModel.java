/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.GameController;

/**
 *
 * @author Cream
 */
public class LuckyCardModel extends CardModel {

    public LuckyCardModel() {
        super();
    }

    @Override
    public boolean action(PlayerModel player, GameController mainController) {
        if (getID() == 1) {
            player.setMoney(player.getMoney() + 2000);
            return true;
        } else if (getID() == 2) {
            if (player.getMoney() >= 400) {
                player.setMoney(player.getMoney() - 400);
                return true;
            } else {
                return false;
            }
        } else if (getID() == 3) {
            if (player.getMoney() >= 3000) {
                player.setMoney(player.getMoney() - 3000);
                player.setX_pos(470);
                player.setY_pos(470);
                player.setPosition(10);
                player.setIsStop(true);
                mainController.getMap().repaint();
                return true;
            } else {
                return false;
            }
        } else if (getID() == 4) {
            player.setMoney(player.getMoney() + 500);
            return true;
        } else if (getID() == 5) {
            if (player.getMoney() >= 1500) {
                player.setMoney(player.getMoney() - 1500);
                return true;
            } else {
                return false;
            }
        } else if (getID() == 6) {
            if (player.getMoney() >= 1000) {
                player.setMoney(player.getMoney() - 1000);
                return true;
            } else {
                return false;
            }
        } else if (getID() == 7) {
            if (player.getMoney() >= 250) {
                player.setMoney(player.getMoney() - 250);
                return true;
            } else {
                return false;
            }
        } else if (getID() == 8) {
            if (player.getMoney() >= 500) {
                player.setMoney(player.getMoney() - 500);
                return true;
            } else {
                return false;
            }
        } else if (getID() == 9) {
            if (player.getMoney() >= 500) {
                player.setMoney(player.getMoney() - 500);
                return true;
            } else {
                return false;
            }
        } else if (getID() == 10) {
            player.setX_pos(30);
            player.setY_pos(470);
            player.setPosition(0);
            mainController.getMap().repaint();
            return true;
        } else if (getID() == 11) {
            player.setX_pos(470);
            player.setY_pos(470);
            player.setPosition(10);
            player.setIsStop(true);
            mainController.getMap().repaint();
            return true;
        } else if (getID() == 12) {
            if (player.getMoney() >= 800) {
                player.setMoney(player.getMoney() - 800);
                return true;
            } else {
                return false;
            }
        } else if (getID() == 13) {
            player.setMoney(player.getMoney() + 1000);
            return true;
        } else if (getID() == 14) {
            player.setMoney(player.getMoney() + 500);
            return true;
        } else if (getID() == 15) {
            mainController.bankrupt(player);
            return true;
        } else {
            return false;
        }
    }
}
