/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chuti
 */
import java.io.*;
public class Book implements Serializable{
    private String name;
    private double price;
    private String type;
    
    public Book(){
        this("",0.0,"");
    }
    public Book(String name, double price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void save(){
        Book b = new Book();
        try{
            FileOutputStream fOut = new FileOutputStream("dataBook.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);
            oout.writeObject(b);
            oout.close();
            fOut.close();
        }catch(IOException i){
            i.printStackTrace();
        }
    }
    public void load(){
        Book b = null;
        try{
            FileInputStream fin = new FileInputStream("dataStudent.dat");
            ObjectInputStream in = new ObjectInputStream(fin);
            b = (Book) in.readObject();
            in.close();
            fin.close();
        }
        catch(IOException i){
            i.printStackTrace();
        }
        catch(ClassNotFoundException c){
            c.printStackTrace();
        }
    }
    
}
