/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author chuti
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            CheckingAccount acct1 = new CheckingAccount(1000, "A0001", 500);
            Customer cust = new Customer("Sompong", "Sookjai", acct1);
            cust.getAcct().deposit(500);
            cust.getAcct().withdraw(1800);
            cust.getAcct().withdraw(300);
            cust.getAcct().deposit(1000);
            cust.getAcct().withdraw(200);
        }
        catch(WithdrawException ex){
            System.out.println("WithdrawException: Account A0001 has not enough money!");
        }
        finally{
            System.out.println("Thank You.");
        }
    }
}
