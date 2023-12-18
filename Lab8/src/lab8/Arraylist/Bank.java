/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8.Arraylist;

/**
 *
 * @author chuti
 */
public class Bank {
    private lab8.Account acct[];
    private int numAcct;
    public Bank(){
        acct = new lab8.Account[10];
    }
    public void addAccount(lab8.Account ac){
        acct[numAcct] = ac;
        numAcct++;
    }
    public lab8.Account getAccount(int index){
        return acct[index];
    }
    public int getNumAccount(){
        return numAcct;
    }
    
}
    
