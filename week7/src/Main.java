/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chuti
 */
public class Main {
    //public static void main(String[] args){
      //  Account a1 = new Account(50000, "61070033");
        //a1.showAccount();
        //a1.deposit(500);
        //a1.showAccount();
        //a1.withdraw(40000);
        //a1.showAccount();
    //}
    public static void main(String[] args){
        CheckingAccount a1 = new CheckingAccount(50000,"61070033",5000);
        a1.showAccount();
        a1.deposit(500);
        System.out.println(a1);
        a1.withdraw("40000.0");
        System.out.println(a1.toString());
    }
}