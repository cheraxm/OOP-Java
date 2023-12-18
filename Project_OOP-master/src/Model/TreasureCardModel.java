/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.GameController;

/**
 *
 * @author Cream
 */
public class TreasureCardModel extends CardModel{
    public TreasureCardModel(){
        super();
    }
    @Override
    public boolean action(PlayerModel player, GameController mainController) {
        if(getID()==1){
            player.setMoney(player.getMoney()+400);
            return true;
        }else if(getID()==2){
            player.setMoney(player.getMoney()+200);
            return true;
        }else if(getID()==3){
            player.setMoney(player.getMoney()+2000);
            return true;
        }else if(getID()==4){
            player.setMoney(player.getMoney()+1000);
            return true;
        }else if(getID()==5){
            player.setMoney(player.getMoney()+4000);
            return true;
        }else if(getID()==6){
            if(player.getMoney()>=1500){
                player.setMoney(player.getMoney()-1500);
                return true;
            }else{
                return false;
            }
        }else if(getID()==7){
            if(player.getMoney()>=200){
                player.setMoney(player.getMoney()-200);
                return true;
            }else{
                return false;
            }
        }else if(getID()==8){
             player.setMoney(player.getMoney()+500);
            return true;
        }else if(getID()==9){
            if(player.getMoney()>=1500){
                player.setMoney(player.getMoney()-1500);
                return true;
            }else{
                return false;
            }
        }else if(getID()==10){
            if(player.getMoney()>=2500){
                player.setMoney(player.getMoney()-2500);
                return true;
            }else{
                return false;
            }
        }else if(getID()==11){
            player.setMoney(player.getMoney()+3000);
            return true;
        }else if(getID()==12){
            player.setMoney(player.getMoney()+250);
            return true;
        }else if(getID()==13){
            player.setMoney(player.getMoney()+5000);
            return true;
        }else if(getID()==14){
            if(player.getMoney()>=500){
                player.setMoney(player.getMoney()-500);
                return true;
            }else{
                return false;
            }
        }else if(getID()==15){
            player.setMoney(player.getMoney()+300);
            return true;
        }else{
            return false;
        }
    }
    }
    
    

