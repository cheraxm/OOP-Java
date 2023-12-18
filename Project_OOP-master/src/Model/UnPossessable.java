/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.GameController;

/**
 *
 * @author yptr2
 */
public abstract class UnPossessable {
    protected int number;
    protected String name;
    
    public UnPossessable(int number, String name){
        this.name = name;
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
    
    
    public abstract void action(PlayerModel player, GameController mainController);
}
