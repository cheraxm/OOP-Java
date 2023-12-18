package Model;

public class CityModel extends Possessable {

    private int priceOfHome;
    private int priceOfHotel;
    private int numberOfHome = 0;
    private int[] allHomePrice;

    public CityModel(int number, String name, int price) {
        super(number, name, price);
        allHomePrice = new int[6];
    }

    public void setPriceHome(int home0, int home1, int home2, int home3, int home4, int hotel) {
        allHomePrice[0] = home0;
        allHomePrice[1] = home1;
        allHomePrice[2] = home2;
        allHomePrice[3] = home3;
        allHomePrice[4] = home4;
        allHomePrice[5] = hotel;
    }

    public void setPriceOfHome(int price) {
        this.priceOfHome = price;
    }

    public void setPriceOfHotel(int price) {
        this.priceOfHotel = price;
    }

    public int getPrice() {
        return allHomePrice[numberOfHome];
    }

    public int getNumberOfHome() {
        return numberOfHome;
    }

    public int getPriceOfHotel() {
        return priceOfHotel;
    }

    public int getPriceOfHome() {
        return priceOfHome;
    }

    public void setNumberOfHome(int numberOfHome) {
        this.numberOfHome = numberOfHome;
    }

    @Override
    public void reset() {
        setOwner(null);
        setProperty(0);
        setNumberOfHome(0);
    }

}
