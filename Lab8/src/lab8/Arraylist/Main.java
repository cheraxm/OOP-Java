/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8.Arraylist;

/**
 *
 * @author chuti
 */
public class Main {
    public static void main(String[] args) {
        lab8.Customer cust = new lab8.Customer("Somsri", "Boonjing");
        lab8.Account acct1 = new lab8.Account(5000, "Sommai");
        lab8.Account acct2 = new lab8.Account(3000, "Somchai");
        //Account a3 = new Account(900, "Somsri");
        cust.addAccount(acct1);
        cust.addAccount(acct2);
        
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
        //Bank myBank = new Bank();
        //myBank.addAccount(a1);
        //myBank.addAccount(a2);
        //myBank.addAccount(a3);

        //System.out.println("Number of Account: " + myBank.getNumAccount());
        //myBank.getAccount(0).showAccount();
        //System.out.println("Deposit 500...");
        //myBank.getAccount(0).deposit(500);
        //myBank.getAccount(0).showAccount();
        //System.out.println("Show all accounts");
        //System.out.println("==============================");
        
        System.out.println(cust);
        
        
        //for(int i=0; i<myBank.getNumAccount(); i++){
        //    myBank.getAccount(i).showAccount();
        //}
        
        for(int i=0; i<cust.getNumOfAccount(); i++){
            cust.getAccount(i).showAccount();
        }
    }
}
