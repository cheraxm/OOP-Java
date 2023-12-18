package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nilobon
 */
public class PlaceModel extends Possessable {

    private int allPriceHotel[];

    public PlaceModel(int number, String name, int price) {
        super(number, name, price);
    }

    public void setPriceHotel(int have1, int have2, int have3, int have4, int have5) {
        allPriceHotel = new int[5]; //โรงแรม max 5
        allPriceHotel[0] = have1;
        allPriceHotel[1] = have2;
        allPriceHotel[2] = have3;
        allPriceHotel[3] = have4;
        allPriceHotel[4] = have5;
    }

    public void setPriceHotel(int have1, int have2) { //การประปา max 2
        allPriceHotel = new int[2];
        allPriceHotel[0] = have1;
        allPriceHotel[1] = have2;
    }

    public int getPrice() {
        if (getNumber() == 4 || getNumber() == 5 || getNumber() == 15 || getNumber() == 25 || getNumber() == 35) {
            return allPriceHotel[getOwner().getNumberOfHotelHave()-1];
        } else {
            if (getOwner().getPossession().contains(12) & getOwner().getPossession().contains(28)) {
                return allPriceHotel[1];
            } else {
                return allPriceHotel[0];
            }
        }
    }

    @Override
    public void reset() {
        setOwner(null);
        setProperty(0);
    }
}
