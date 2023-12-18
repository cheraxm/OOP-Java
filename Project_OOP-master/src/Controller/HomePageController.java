/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.PlayerModel;
import View.DebugRoll;
import View.HomePageView;
import View.MainGameView;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author armmy
 */
public class HomePageController implements ActionListener{
    private HomePageView view;

    public HomePageController() {
        view = new HomePageView();
        
        view.getStart().addActionListener(this);
    }
    
    public void createPlayer(int numberPlayer){
        GameController.setNumberPlayer(numberPlayer);
        GameController.setAllPlayer(new PlayerModel[numberPlayer]);
        for (int i = 0; i < numberPlayer; i++) {
            if (i == 0){
                GameController.setPlayer(i, new PlayerModel(30, 470, 20, 20, "Red", view.getName_p1().getText()));
            } 
            if (i == 1){
                GameController.setPlayer(i, new PlayerModel(30, 470, 20, 20, "Blue", view.getName_p2().getText()));
            }
            if (i == 2){
                GameController.setPlayer(i, new PlayerModel(30, 470, 20, 20, "Green", view.getName_p3().getText()));
            }
            if (i == 3){
                GameController.setPlayer(i, new PlayerModel(30, 470, 20, 20, "Black", view.getName_p4().getText()));
            }
        }
        GameController.getDisplay().createDisplay(numberPlayer);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int numPlayer = 0;
        if ("1Player".equals(view.getNumberPlayer().getSelectedItem())){
            if (view.getName_p1().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please input name's player.", "", JOptionPane.ERROR_MESSAGE);
                return;
            }
            numPlayer = 1;
        } else if ("2Player".equals(view.getNumberPlayer().getSelectedItem())){
            if (view.getName_p1().getText().equals("") || view.getName_p2().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please input name's player.", "", JOptionPane.ERROR_MESSAGE);
                return;
            }
            numPlayer = 2;
        } else if ("3Player".equals(view.getNumberPlayer().getSelectedItem())){
            if (view.getName_p1().getText().equals("") || view.getName_p2().getText().equals("") || view.getName_p3().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please input name's player.", "", JOptionPane.ERROR_MESSAGE);
                return;
            }
            numPlayer = 3;
        } else if ("4Player".equals(view.getNumberPlayer().getSelectedItem())){
            if (view.getName_p1().getText().equals("") || view.getName_p2().getText().equals("") || view.getName_p3().getText().equals("") || view.getName_p4().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please input name's player.", "", JOptionPane.ERROR_MESSAGE);
                return;
            }
            numPlayer = 4;
        }
        createPlayer(numPlayer);
        view.dispose();
        GameController.getPlayer(0).setInTurn(true);
        System.out.println(GameController.getPlayer(0).isInTurn());
        GameController.getMain().repaint();
        GameController.getFr().setVisible(true);
    }
    
}
