
import Controller.GameController;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author armmy
 */
public class StartGame {
    public static void main(String[] args) {
        GameController game = new GameController();
        Thread t1 = new Thread(game);
        t1.run();
    }
}
