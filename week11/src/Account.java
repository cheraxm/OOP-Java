/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chuti
 */
public class Account {
    protected double balance;
    protected String name;
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
        // setBalance(balance);
        // setName(name);
    }
    public void deposit(double a){
        if (a > 0){
            // setBalance(getBalance() + a);
            this.balance += a;
            System.out.println("now : " + this.balance);
            System.out.println(a + " baht is deposited to " + name + ".");
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(double a){
        if(a < 0){
            System.out.println("Input number must be a positive integer.");
        }
        else if (a > getBalance()){
            System.out.println("Not enough money!");
        }
        else{
            // setBalance(getBalance() - a);
            balance -= a;
            System.out.println("now : " + this.balance);
            System.out.println(a + " baht is withdrawn from " + name + ".");
        }
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void showAccount(){
        System.out.println(getName() + " account has " + getBalance() + " baht.");
    }
}
