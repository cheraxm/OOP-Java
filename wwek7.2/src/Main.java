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
      //  Flyable f1 = new Flyable();
        //Floatable f2 = new Floatable();
        //Dieselable d = new Dieselable();
 //}
    //public static void main(String[] args) {
      //      Pigeon p1 = new Pigeon(10,15,20);
        //    System.out.println(p1);
          //  p1.takeOff();
            //System.out.println(p1);
            //p1.fly();
            //System.out.println(p1);
            //p1.landing();
            //System.out.println(p1);
            //p1.eat("seed");
            //System.out.println(p1);
            //Pigeon p3 = new Pigeon();
        //System.out.println(p3);
    //}
    public static void main(String[] args) {
        Plane p1 = new Plane(200,"IT Airline","FX-747");
        Ship s1 = new Ship(200);

        System.out.println("=== plane ===");
        p1.startEngine();
        p1.takeOff();
        p1.fly();
        p1.fly();
        p1.honk();
        p1.landing();
        p1.stopEngine();

        System.out.println("=== ship ===");
        s1.startEngine();
        s1.move(2);
        s1.honk();
        s1.stopEngine();

    }

}
