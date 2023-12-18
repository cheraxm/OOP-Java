package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nilobon
 */
public abstract class Possessable {
    private int number;
    private int landPrice;
    private String name;
    private PlayerModel owner;
    private int property = 0;
    
    public Possessable(int number, String name, int price){
        this.number = number;
        this.name = name;
        this.landPrice = price;
        
    }
    
    public int getNumber(){
        return number;
    }
    
    public int getLandPrice(){
        return landPrice;
    }
    
    public String getName(){
        return name;
    }
    
    public PlayerModel getOwner(){
        return owner;
    }
    
    public void setLandPrice(int price){
        this.landPrice = price;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setOwner(PlayerModel owner){
        this.owner = owner;
    }

    public int getProperty() {
        return property;
    }

    public void setProperty(int property) {
        this.property = property;
    }

    public abstract int getPrice();
    public abstract void reset();
}
