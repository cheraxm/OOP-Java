/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.*;
import Model.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author armmy
 */
public class GameController implements Runnable, ActionListener {

    private static GameWindow fr;
    private MapView map;
    private static DisplayView display;
    private static MainGameView main;
    private HomePageController homePageC;
    private static PlayerModel allPlayer[];
    private MapModel mapModel;
    private int nowTurn = 0;
    private static int numberPlayer;
    private static boolean startGame = false;
    private boolean startTurn = false;
    private boolean inTurn = false;

    private DebugRoll debugRoll;

    public GameController() {
        homePageC = new HomePageController();

        fr = new GameWindow();
        main = new MainGameView();
        fr.setContentPane(main);
        map = main.getMap();
        display = main.getDisplay();

        mapModel = new MapModel();
        map.getRoll().addActionListener(this);

        display.getViewInfo().addActionListener(this);

//        debug
//        debugRoll = new DebugRoll();
//        debugRoll.getGo().addActionListener(this);
    }

    public int getNowTurn() {
        return nowTurn;
    }

    public void setNowTurn(int nowTurn) {
        this.nowTurn = nowTurn;
    }

    public static int getNumberPlayer() {
        return numberPlayer;
    }

    public static void setNumberPlayer(int numberPlayer) {
        GameController.numberPlayer = numberPlayer;
    }

    public static PlayerModel getPlayer(int num) {
        return allPlayer[num];
    }

    public static void setPlayer(int index, PlayerModel player) {
        GameController.allPlayer[index] = player;
    }

    public static void setAllPlayer(PlayerModel[] allPlayer) {
        GameController.allPlayer = allPlayer;
    }

    public static PlayerModel[] getAllPlayer() {
        return allPlayer;
    }

    public static GameWindow getFr() {
        return fr;
    }

    public static MainGameView getMain() {
        return main;
    }

    public static DisplayView getDisplay() {
        return display;
    }

    public static void setStartGame(boolean startGame) {
        GameController.startGame = startGame;
    }

    public synchronized void endTurn() {
        if (GameController.allPlayer[nowTurn].isRepeatTurn()) {
            GameController.allPlayer[nowTurn].setRepeatTurn(false);
            return;
        }
        while (true) {
            nowTurn += 1;
            if (nowTurn == allPlayer.length) {
                nowTurn = 0;
            }
            if (GameController.allPlayer[nowTurn].isIsStop()) {
                GameController.allPlayer[nowTurn].setIsStop(false);
            } else if (GameController.allPlayer[nowTurn].isBankrupt()) {
            } else {
                return;
            }
        }
    }

    public int roll() {
        int min = 1;
        int max = 6;
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        return randomNumber;
    }

    public synchronized void refreshInfo() {
        if (display.getP1() != null) {
            getDisplay().getP1().refresh(allPlayer[0], mapModel);
        }
        if (display.getP2() != null) {
            getDisplay().getP2().refresh(allPlayer[1], mapModel);
        }
        if (display.getP3() != null) {
            getDisplay().getP3().refresh(allPlayer[2], mapModel);
        }
        if (display.getP4() != null) {
            getDisplay().getP4().refresh(allPlayer[3], mapModel);
        }
    }

    public void bankrupt(PlayerModel player) {
        numberPlayer -= 1;
        player.setWidth(0);
        player.setHeight(0);
        map.repaint();
        if (player.getIntPossession() == null) {
            player.setBankrupt();
            return;
        }
        for (int possession : player.getIntPossession()) {
            if (mapModel.getNumberOfCity().contains(possession)) {
                CityModel city = (CityModel) mapModel.getPlace(possession);
                city.reset();
            } else {
                PlaceModel city = (PlaceModel) mapModel.getPlace(possession);
                city.reset();
            }
        }
        player.setBankrupt();
    }

    public MapView getMap() {
        return map;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Graphics gMap = map.getGraphics();
        Font font = new Font("Cordia New", Font.BOLD, 25);
        gMap.setFont(font);
        if (e.getSource().equals(map.getRoll())) {
            startTurn = true;
//        roll point
            PlayerModel nowTurn = GameController.allPlayer[this.nowTurn];
            int number1 = roll();
            int number2 = roll();
            int number = number1 + number2;
            new Thread() {
                @Override
                public void run() {
                    String text = "";
                    if (number1 == number2) {
                        text = number1 + " + " + number2 + " = " + number + " Point! : Double!";
                        gMap.drawString(text, 200, 200);
                        if (nowTurn.getCountRepeatTurn() < 2) {
                            nowTurn.setCountRepeatTurn(nowTurn.getCountRepeatTurn() + 1);
                            nowTurn.setRepeatTurn(true);
                        } else if (nowTurn.getCountRepeatTurn() == 2) {
                            try {
                                Thread.sleep(800);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            getMap().repaint();
                            gMap.drawString("เข้าคุก!", 200, 230);
                            getMap().repaint();
                            nowTurn.setX_pos(470);
                            nowTurn.setY_pos(470);
                            nowTurn.setIsStop(true);
                            nowTurn.setPosition(10);
                            nowTurn.setCountRepeatTurn(0);
                            nowTurn.setRepeatTurn(false);

                            try {
                                Thread.sleep(800);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            getMap().repaint();
                            endTurn();
                            startTurn = false;
                            return;
                        }
                    } else {
                        text = number1 + " + " + number2 + " = " + number + " Point!";
                        gMap.drawString(text, 200, 200);
                        nowTurn.setCountRepeatTurn(0);
                        nowTurn.setRepeatTurn(false);
                    }
                    for (int i = 0; i < number; i++) {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException ex) {
                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                nowTurn.move();
                                map.repaint();
                                if (nowTurn.getPosition() == 0) {
                                    nowTurn.setMoney(nowTurn.getMoney() + 2000);
                                }
                            }
                        });
                    }
                    inTurn = true;
                }
            }.start();
        } else if (e.getSource().equals(display.getViewInfo())) {
            try {
                display.updatePlaceInfo((Possessable) (mapModel.getPlace(Integer.valueOf(display.getIn_index().getText()))));
            } catch (ClassCastException ex) {
                display.updatePlaceInfo((AllUnPossessable) (mapModel.getPlace(Integer.valueOf(display.getIn_index().getText()))));
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                refreshInfo();
            }
            map.getRoll().setVisible(!startTurn);
            if (inTurn) {
                synchronized (this) {
                    Graphics gMap = map.getGraphics();
                    Font font = new Font("Cordia New", Font.BOLD, 20);
                    gMap.setFont(font);
                    String text = "";
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    PlayerModel nowTurn = GameController.allPlayer[this.nowTurn];
                    if (mapModel.getNumberOfCity().contains(nowTurn.getPosition())) { // กรณียืนอยู่บนเมืองปกติ
                        CityModel place = (CityModel) mapModel.getPlace(nowTurn.getPosition());
                        if (place.getOwner() == null) { // ถ้าไม่มีเจ้าของ
                            int want_to_buy_city = OptionView.showOption(fr, "Do you want to buy " + place.getName() + "? \nPrice : " + place.getLandPrice() + "Baht.", "Yes", "No"); // ซื้อเมืองมั้ย?
                            if (want_to_buy_city == OptionView.FIRST_OPTION) {
                                nowTurn.buyCity(place);
                                int want_to_buy_home = OptionView.showOption(fr, "Do you want to buy with home? \nPrice : " + place.getPriceOfHome(), "Yes", "No"); // ซื้อพร้อมบ้านมั้ย?
                                if (want_to_buy_home == OptionView.FIRST_OPTION) {
                                    nowTurn.buyHome(place);
                                }
                            }

                        } else { // ถ้ามีเจ้าของ
                            if (nowTurn.isHaveCity(place)) { // ถ้าเป็นของ player
                                if (place.getNumberOfHome() < 4) {
                                    int want_to_buy_home = OptionView.showOption(fr, "Do you want to buy home?\nPrice : " + place.getPriceOfHome(), "Yes", "No"); // ซื้อพร้อมบ้านมั้ย?
                                    if (want_to_buy_home == OptionView.FIRST_OPTION) {
                                        nowTurn.buyHome(place);
                                    }
                                } else if (place.getNumberOfHome() == 4) {
                                    int want_to_buy_home = OptionView.showOption(fr, "Do you want to buy hotel?\nPrice : " + place.getPriceOfHotel(), "Yes", "No"); // ซื้อพร้อมบ้านมั้ย?
                                    if (want_to_buy_home == OptionView.FIRST_OPTION) {
                                        nowTurn.buyHome(place);
                                    }
                                }

                            } else { // ถ้าไม่ได้เป็นของ player
                                boolean success = false;
                                while (true) {
                                    if (nowTurn.payMent(place.getOwner(), place.getPrice()) || success) { // ถ้ามีเงินพอจ่าย หรือ เลือกจะล้มละลาย
                                        text = "จ่ายเงิน " + place.getPrice() + " บาท ให้ " + place.getOwner().getName() + "ค่าผ่านทาง" + place.getName();
                                        gMap.drawString(text, 100, 200);
                                        try {
                                            Thread.sleep(1500);
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                        map.repaint();
                                        break;
                                    } else { // ถ้าเงินไม่พอจ่าย
                                        while (true) {
                                            if (nowTurn.getPossession().isEmpty()) {
                                                OptionView.alertMessage(fr, nowTurn.getName() + " are bankrupt.");
                                                bankrupt(nowTurn);
                                                System.out.println(allPlayer[2].getName() + "\t" + allPlayer[2].getWidth());
                                                success = true;
                                                break;
                                            }
                                            int want_to_sell = OptionView.showOption(fr, "Do you want to sell city?", "Yes", "No"); // จะขายเมืองไหม?
                                            if (want_to_sell == OptionView.FIRST_OPTION) { // ขาย
                                                SellHomeView city_want_to_sell = new SellHomeView(fr, nowTurn, mapModel, place.getPrice());
                                                if (city_want_to_sell.getSelectIndex() == null) {
                                                    success = true;
                                                    bankrupt(nowTurn);
                                                } else {
                                                    for (Integer selectIndex : city_want_to_sell.getSelectIndex()) {
                                                        nowTurn.sellCity((Possessable) mapModel.getPlace(selectIndex));
                                                    }
                                                }
                                                break;
                                            } else if (want_to_sell == OptionView.SECOND_OPTION) { // ไม่ขาย(ล้มละลาย)
                                                int comfirm = OptionView.showOption(fr, "Will you bankrupt?", "Yes", "No");
                                                if (comfirm == OptionView.FIRST_OPTION) {
                                                    bankrupt(nowTurn);
                                                    success = true;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (mapModel.getNumberOfHotel().contains(nowTurn.getPosition()) || mapModel.getNumberOfDuo().contains(nowTurn.getPosition())) {
//                                    โรงแรม
                        PlaceModel place = (PlaceModel) mapModel.getPlace(nowTurn.getPosition());
                        if (place.getOwner() == null) { // ถ้าไม่มีเจ้าของ
                            int want_to_buy_city = OptionView.showOption(fr, "Do you want to buy " + place.getName() + "? \nPrice : " + place.getLandPrice() + "Baht.", "Yes", "No"); // ซื้อเมืองมั้ย?
                            if (want_to_buy_city == OptionView.FIRST_OPTION) {
                                nowTurn.buyCity(place);
                            }
                        } else {
                            boolean success = false;
                            while (true) {
                                if (nowTurn.payMent(place.getOwner(), place.getPrice()) || success) { // ถ้ามีเงินพอจ่าย หรือ เลือกจะล้มละลาย
                                    text = "จ่ายเงิน " + place.getPrice() + " บาท ให้ " + place.getOwner().getName() + "ค่าผ่านทาง" + place.getName();
                                    gMap.drawString(text, 100, 200);
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    map.repaint();
                                    break;
                                } else { // ถ้าเงินไม่พอจ่าย
                                    while (true) {
                                        if (nowTurn.getPossession().isEmpty()) {
                                            OptionView.alertMessage(fr, "You are bankrupt.");
                                            bankrupt(nowTurn);
                                            success = true;
                                            break;
                                        }
                                        int want_to_sell = OptionView.showOption(fr, "Do you want to sell city?", "Yes", "No"); // จะขายเมืองไหม?
                                        if (want_to_sell == OptionView.FIRST_OPTION) { // ขาย
                                            SellHomeView city_want_to_sell = new SellHomeView(fr, nowTurn, mapModel, place.getPrice());
                                            if (city_want_to_sell.getSelectIndex() == null) {
                                                success = true;
                                                bankrupt(nowTurn);
                                            } else {
                                                for (Integer selectIndex : city_want_to_sell.getSelectIndex()) {
                                                    nowTurn.sellCity((Possessable) mapModel.getPlace(selectIndex));
                                                }
                                            }
                                            break;
                                        } else if (want_to_sell == OptionView.SECOND_OPTION) { // ไม่ขาย(ล้มละลาย)
                                            int comfirm = OptionView.showOption(fr, "Will you bankrupt?", "Yes", "No");
                                            if (comfirm == OptionView.FIRST_OPTION) {
                                                bankrupt(nowTurn);
                                                success = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
//                                    ที่อื่นๆ
                        AllUnPossessable a = ((AllUnPossessable) mapModel.getPlace(nowTurn.getPosition()));
                        text = "ตก " + a.getName();
                        gMap.drawString(text, 100, 200);
                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        map.repaint();
                        a.action(nowTurn, this);
                        gMap.drawString(text, 200, 200);
                    }
                    nowTurn.setInTurn(false);
                    endTurn();
                    getPlayer(this.nowTurn).setInTurn(true);
                    map.repaint();
                    if (numberPlayer == 1) {
                        OptionView.alertMessage(fr, allPlayer[this.nowTurn].getName() + " Win!!!");
                        fr.dispose();
                        System.exit(0);
                    }
                    map.getRoll().setVisible(true);
                    inTurn = false;
                    startTurn = false;
                }
            }
        }
    }
}
