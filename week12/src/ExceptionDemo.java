/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chuti
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            Double a = Double.parseDouble(args[0]);
            Double b = Double.parseDouble(args[1]);
            Double c = Double.parseDouble(args[2]);
            Double x1 = -b + Math.sqrt((Math.pow(b, 2) - 4*a*c));
            Double x2 = -b - Math.sqrt((Math.pow(b, 2) - 4*a*c));
            System.out.println(x1);
            System.out.println(x2);
        }
        catch(NumberFormatException ex){
            System.out.println("Please input data in number format only");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
        }
    }
    
}
