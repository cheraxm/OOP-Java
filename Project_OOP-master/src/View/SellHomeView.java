/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author armmy
 */
import Controller.GameController;
import Model.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class SellHomeView {

    private JPanel panel, display, input, btn;
    private JList<String> info;
    private JTextField result;
    private JButton sell, bankrupt;
    private PlayerModel player;
    private MapModel map;
    private int[] selectCity;
    private ArrayList<String> data;
    private boolean success = false;
    private int getMoney = 0;

    public SellHomeView(JFrame parent, PlayerModel player, MapModel mapModel, int price) {
        JDialog fr = new JDialog(parent, "", true);
        panel = new JPanel(new BorderLayout());
        display = new JPanel();
        input = new JPanel(new GridLayout(2, 1));
        btn = new JPanel();
        result = new JTextField("Money to earn : 0");
        sell = new JButton("Sell");
        bankrupt = new JButton("Bankrupt");
        this.player = player;
        this.map = mapModel;
        data = new ArrayList<>();

        for (int possession : player.getIntPossession()) {
            if (mapModel.getNumberOfCity().contains(possession)) {
                CityModel city = (CityModel) map.getPlace(possession);
                data.add("Name : " + city.getName() + "\tToll : " + city.getPrice() + "\tPrice : " + city.getProperty()/2 + "\n");
            } else {
                PlaceModel city = (PlaceModel) map.getPlace(possession);
                data.add("Name : " + city.getName() + "\tToll : " + city.getPrice() + "\tPrice : " + city.getProperty()/2 + "\n");
            }
        }

        info = new JList<>(data.toArray(String[]::new));
        info.setFont(new Font("Cordia New", Font.BOLD, 16));
        display.add(info);

        input.add(result);
        input.add(btn);
        btn.add(sell);
        btn.add(bankrupt);
        
         new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SellHomeView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    synchronized (this) {
                        if (success) {
                            return;
                        }
                        getMoney = 0;
                        for (int i = 0; i < info.getSelectedIndices().length; i++) {
                            Possessable place = (Possessable) map.getPlace(player.getIntPossession().get(info.getSelectedIndices()[i]));
                            getMoney += place.getProperty() / 2;
                        }
                        int lack;
                        if (price-player.getMoney()-getMoney > 0) {
                            lack = price-player.getMoney()-getMoney;
                        } else {
                            lack = 0;
                        }
                        result.setText("Money to earn : " + getMoney + "\nLack of money : " + (lack));
                    }
                }
            }
        }.start();
        
        sell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.dispose();
                success = true;
                selectCity = info.getSelectedIndices();
            }
        });

        bankrupt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int want_to_bankrupt = OptionView.showOption(parent, "Do you want to bankrupt?", "Yes", "No");
                if (want_to_bankrupt == OptionView.FIRST_OPTION) {
                    fr.dispose();
                    selectCity = null;
                    success = true;
                }
            }
        });

        panel.add(display, BorderLayout.CENTER);
        panel.add(input, BorderLayout.SOUTH);

        fr.setContentPane(panel);
        fr.pack();
        fr.setLocationRelativeTo(parent);
        fr.setVisible(true);

       

        if (fr.isActive()) {
            fr.dispose();
        }

    }

    public boolean isSuccess() {
        return success;
    }

    public ArrayList<Integer> getSelectIndex() {
        ArrayList<Integer> select = new ArrayList<>();
        for (int i = 0; i < selectCity.length; i++) {
            select.add(player.getIntPossession().get(selectCity[i]));
        }
        return select;
    }
}
