/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chuti
 */
public class Ship extends Vehicle implements Floatable{
    public Ship(){
        super(0.0);
    }
    public Ship(double fuel){
        super.fuel = fuel;
    }
    public void move(){
        fl0at();
    }
    public void move(int distance){
        for(int i=1;i<=distance;i++){
            if(fuel<50){
                System.out.println("Fuel is not enough.");
                break;
            }
            else{
                fl0at();
            }
        }
    }
    public void fl0at(){
        if(getFuel()>=50){
            setFuel(getFuel()-50);
            System.out.println("Ship moves");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void startEngine(){
        if(getFuel()>=10){
            setFuel(getFuel()-10);
            System.out.println("Engine starts");
        }
        else{
            System.out.println("Fuel is not enough.");
        }    
    }
    public void stopEngine(){
        System.out.println("Engine stops");
    }
    public void honk(){
        System.out.println("Shhhhh");
    }
}
