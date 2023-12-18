/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mocktestbyajbank;

/**
 *
 * @author chuti
 */
public class Pigeous extends Bird{
    public Pigeous(){
        super("", 0);
        setPower(150);
    }
    public Pigeous(String name, int age){
        super(name, age);
        setPower(150);
    }
    public void eat(Food f){
        setPower(getPower()+(2*f.getPower()));
    }
    public void fly(){
        System.out.println(getName() + " fly fly ....");
    }
    public void wingAttack(Animal a){
        a.setPower(a.getPower() - 5);
    }
    public void wingAttack(Animal a, int times){
        a.setPower(a.getPower() - 5*times);
    }

}
