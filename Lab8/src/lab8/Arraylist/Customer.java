/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8.Arraylist;

/**
 *
 * @author chuti
 */
import java.util.*;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Account>acct;
    private int numOfAccount;
    
    
    
    public Customer(){
        this("","");
        acct = new ArrayList();
    }
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }
    
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    
    
    @Override
    public String toString(){
        if(acct==null){
            return firstName +lastName+" doesn’t have account.";
        }
        else{
            return firstName+ lastName+" has "+getNumOfAccount()+ " accounts.";
        }
    }
    public boolean equals(lab8.Customer c){
        return (this.firstName.equals(this.lastName));
    }
    public Account getAccount(int index){
        return acct.get(index);
    }
    public void addAccount(Account acct){
        this.acct.add(acct);
        numOfAccount++;
    }
    public int getNumOfAccount(){
        return acct.size();
    }
    
}
