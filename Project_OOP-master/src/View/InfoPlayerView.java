/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author armmy
 */
import Model.*;
import java.awt.*;
import javax.swing.*;

public class InfoPlayerView extends JPanel {

    private JLabel name, money, position;
    private JLabel dis_name, dis_money, dis_position;

    public InfoPlayerView() {
        setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));

        name = new JLabel("Name :");
        money = new JLabel("Money :");
        position = new JLabel("Position :");
        dis_name = new JLabel();
        dis_money = new JLabel();
        dis_position = new JLabel();
        dis_name.setFont(new Font("Cordia New", Font.BOLD, 16));
        dis_position.setFont(new Font("Cordia New", Font.BOLD, 16));
        setLayout(new GridLayout(3, 2));
        add(name);
        add(dis_name);
        add(money);
        add(dis_money);
        add(position);
        add(dis_position);
    }

    public synchronized void refresh(PlayerModel player, MapModel map) {
        if (player.isBankrupt()) {
            dis_name.setText(player.getName() + " ( ล้มละลาย )");
            dis_money.setText("" + player.getMoney());
            dis_position.setText("None");
            return;
        }
        if (player.isInTurn()) {
                setBackground(Color.LIGHT_GRAY);
            } else {
            setBackground(null);
        }
        dis_name.setText(player.getName() + " (" + player.getColor() + ")");
        dis_money.setText("" + player.getMoney());
        String placeName;
        try {
            placeName = ((Possessable) map.getPlace(player.getPosition())).getName();
        } catch (ClassCastException exception) {
            placeName = ((AllUnPossessable) map.getPlace(player.getPosition())).getName();
        }
        dis_position.setText("" + placeName);
    }
}
