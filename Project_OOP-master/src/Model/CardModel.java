/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.Random;
import Controller.*;
/**
 *
 * @author Cream
 */
public abstract class CardModel {

    private String text;
    private int id;

    public CardModel(){
        System.out.println("a");
        int min = 1;
        int max = 15;
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        this.id = randomNumber;
    }

    public int getID() {
        return id;
    }

    public String getText() {
        return text;
    }
    public abstract boolean action(PlayerModel player, GameController mainController);
}
