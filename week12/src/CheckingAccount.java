/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chuti
 */
public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount(){
        super(0.0,"");
        //balance = 0.0;
        //name = "unknow";
        credit = 0.0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if(credit>0){
            this.credit = credit;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return credit;
    }
    @Override
    public void withdraw(double amount) throws WithdrawException{
        if(amount>0){
            if((balance - amount)>=0){
                balance -= amount;
                System.out.println(amount+" baht is withdrawn from "+name+" and your credit balance is "+credit+".");
            }
            else if(((balance - amount)+credit)>=0){
                Double a = amount - balance; 
                balance = 0;
                credit -= a;
                System.out.println(amount+" baht is withdrawn from "+name+" and your credit balance is "+credit+".");
            }
            else if(((balance-amount)+credit)<0){
                throw new WithdrawException("Account "+name+" has not enough money.");
//                System.out.println("Not enough money!");
            }
        }
    }
    public void withdraw(String a) throws WithdrawException{
        withdraw(Double.parseDouble(a));
    }
    @Override
    public String toString(){
        return("The "+name+" account has "+balance+" baht and "+credit+" credits.");
    }
}
