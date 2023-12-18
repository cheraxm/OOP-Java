/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.*;

/**
 *
 * @author armmy
 */
public class PlayerModel {

    private int x_pos;
    private int y_pos;
    private int width;
    private int height;
    private int position = 0;
    private int money = 20000;
    private String name;
    private ArrayList<String> possession;
    private int numberOfHotelHave = 0;
    private boolean isStop = false;
    private boolean bankrupt = false;
    private int countRepeatTurn = 0;
    private boolean repeatTurn = false;
    private boolean inTurn = false;
//    debug zone
    private String color;
//    end

    public PlayerModel(int x, int y, int width, int height, String color, String name) {
        this.x_pos = x;
        this.y_pos = y;
        this.width = width;
        this.height = height;
        this.name = name;
        this.color = color;
        possession = new ArrayList();
    }

    public ArrayList<Integer> getIntPossession() {
        if (possession == null) {
            return null;
        }
        ArrayList<Integer> possession_ = new ArrayList<>();
        for (String i : possession) {
            possession_.add(Integer.valueOf(i));
        }
        return possession_;
    }
    
    public ArrayList<String> getPossession() {
        return possession;
    }
    
    public int getNumberOfHotelHave() {
        return numberOfHotelHave;
    }

    public int getX_pos() {
        return x_pos;
    }

    public void setX_pos(int x_pos) {
        this.x_pos = x_pos;
    }

    public int getY_pos() {
        return y_pos;
    }

    public void setY_pos(int y_pos) {
        this.y_pos = y_pos;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getCountRepeatTurn() {
        return countRepeatTurn;
    }

    public void setCountRepeatTurn(int countRepeatTurn) {
        this.countRepeatTurn = countRepeatTurn;
    }

    public boolean isRepeatTurn() {
        return repeatTurn;
    }

    public void setRepeatTurn(boolean repeatTurn) {
        this.repeatTurn = repeatTurn;
    }

    public boolean isInTurn() {
        return inTurn;
    }

    public void setInTurn(boolean inTurn) {
        this.inTurn = inTurn;
    }
    

    public boolean isHaveCity(Possessable city) {
        return possession.contains(city.getNumber());
    }

    public void buyCity(Possessable city) {
        city.setOwner(this);
        city.setProperty(city.getProperty()+city.getLandPrice());
        getPossession().add(String.valueOf(position));
        money -= city.getLandPrice();
        
        if (city.getNumber() == 4 || city.getNumber() == 5 || city.getNumber() == 15 || city.getNumber() == 25 || city.getNumber() == 35) {
            numberOfHotelHave += 1;
        }
    }

    
    public void move() {
        if (position == 0) {
            x_pos += 60;
        } else if (position < 9) {
            x_pos += 40;
        } else if (position == 9) {
            x_pos += 60;
        } else if (position == 10) {
            y_pos -= 60;
        } else if (position < 19) {
            y_pos -= 40;
        } else if (position == 19) {
            y_pos -= 60;
        } else if (position == 20) {
            x_pos -= 60;
        } else if (position < 29) {
            x_pos -= 40;
        } else if (position == 29) {
            x_pos -= 60;
        } else if (position == 30) {
            y_pos += 60;
        } else if (position < 39) {
            y_pos += 40;
        } else if (position == 39) {
            y_pos += 60;
        }
        position += 1;
        if (position == 40) {
            position = 0;
        }
    }

    public void buyHome(CityModel city) {
        if (city.getNumberOfHome() == 4) {
            city.getOwner().setMoney(city.getOwner().getMoney() - (city.getPriceOfHotel()));
            city.setProperty(city.getProperty()+city.getPriceOfHotel());
        } else if (city.getNumberOfHome() < 5) {
            city.getOwner().setMoney(city.getOwner().getMoney() - (city.getPriceOfHome()));
            city.setProperty(city.getProperty()+city.getPriceOfHome());
        }
        city.setNumberOfHome(city.getNumberOfHome() + 1);
    }

    public void setIsStop(boolean b) {
        this.isStop = b;
    }

    public boolean isIsStop() {
        return isStop;
    }

    public boolean isBankrupt() {
        return bankrupt;
    }

    public void setBankrupt() {
        this.bankrupt = true;
        possession = null;
        money = 0;
    }

    public boolean payMent(PlayerModel player, int price) {
        if (this.getMoney() >= price) {
            this.setMoney(this.getMoney() - price);
            player.setMoney(player.getMoney() + price);
            return true;
        } else {
            return false;
        }
    }

    public void sellCity(Possessable city) {
        setMoney(getMoney()+(city.getProperty()/2));
        possession.remove(city.getNumber() + "");
        city.reset();
    }
    
//    debug Zone
    public String getColor() {
        return color;
    }
}
