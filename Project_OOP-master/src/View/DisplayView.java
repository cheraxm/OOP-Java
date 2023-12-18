/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.AllUnPossessable;
import Model.Possessable;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author armmy
 */
public class DisplayView extends JPanel{
    private InfoPlayerView p1, p2, p3, p4;
    private JPanel placeInfo;
    private JLabel name, price, owner;
    private JTextField dis_name, dis_price, dis_owner, in_index;
    private JButton viewInfo;
    
    public DisplayView() {
        setBounds(610, 40, 362, 520);
        setLayout(new GridLayout(5, 1));
        
        placeInfo = new JPanel(new GridLayout(4, 2));
        name = new JLabel("Name :");
        price = new JLabel("Price :");
        owner = new JLabel("Owner");
        dis_name = new JTextField();
        dis_price = new JTextField();
        dis_owner = new JTextField();
        in_index = new JTextField();
        viewInfo = new JButton("View!");
        
        placeInfo.add(in_index); placeInfo.add(viewInfo);
        placeInfo.add(name); placeInfo.add(dis_name); dis_name.setEditable(false);
        placeInfo.add(owner); placeInfo.add(dis_owner); dis_owner.setEditable(false);
        placeInfo.add(price); placeInfo.add(dis_price); dis_price.setEditable(false);
        
    }
    
    public void createDisplay(int numberPlayer){
        for (int i = 0; i < numberPlayer; i++) {
            if (i == 0){
                p1 = new InfoPlayerView();
                add(p1);
            } 
            if (i == 1){
                p2 = new InfoPlayerView();
                add(p2);
            }
            if (i == 2){
                p3 = new InfoPlayerView();
                add(p3);
            }
            if (i == 3){
                p4 = new InfoPlayerView();
                add(p4);
            }
        }
        add(placeInfo);
    }

    public InfoPlayerView getP1() {
        return p1;
    }

    public InfoPlayerView getP2() {
        return p2;
    }

    public InfoPlayerView getP3() {
        return p3;
    }

    public InfoPlayerView getP4() {
        return p4;
    }

    public JTextField getDis_name() {
        return dis_name;
    }

    public JTextField getDis_price() {
        return dis_price;
    }

    public JTextField getDis_owner() {
        return dis_owner;
    }

    public JTextField getIn_index() {
        return in_index;
    }

    public JButton getViewInfo() {
        return viewInfo;
    }
    
    
    public void updatePlaceInfo(Possessable place) {
        dis_name.setFont(new Font("Cordia New", Font.BOLD, 16));
        dis_name.setText(place.getName());
        if (place.getOwner() == null) {
            price.setText("Price :");
            dis_price.setText(String.valueOf(place.getLandPrice()));
            dis_owner.setText("None");
        } else {
            price.setText("Toll :");
            dis_owner.setText(place.getOwner().getName());
            dis_price.setText(String.valueOf(place.getPrice()));
        }
    }
    
    public void updatePlaceInfo(AllUnPossessable place) {
        dis_name.setFont(new Font("Cordia New", Font.BOLD, 16));
        dis_name.setText(place.getName());
        dis_price.setText("");
        dis_owner.setText("");
    }
}
