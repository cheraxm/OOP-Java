/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author nilobon
 */
public class MapModel {
    private ArrayList<Integer> numberOfCity;
    private ArrayList<Integer> numberOfHotel;
    private ArrayList<Integer> numberOfDuo;
    private static HashMap<Integer, Object> Map;
    
    public MapModel(){
        numberOfCity = new ArrayList<>();
        numberOfHotel = new ArrayList<>();
        numberOfDuo = new ArrayList<>();
        Map = new HashMap<>();
        
        AllUnPossessable index0 = new AllUnPossessable(0, "start");
        Map.put(0, index0);
        
        CityModel index1 = new CityModel(1, "กรุงเทพ", 600);
        index1.setPriceHome(20, 100, 300, 900, 1600, 4100);
        index1.setPriceOfHome(500);
        index1.setPriceOfHotel(2500);
        Map.put(1, index1);
        numberOfCity.add(1);

        AllUnPossessable index2 = new AllUnPossessable(2, "หีบสมบัติ");
        Map.put(2, index2);

        CityModel index3 = new CityModel(3, "นครปฐม", 600);
        index3.setPriceHome(40, 200, 600, 1800, 3200, 7700);
        index3.setPriceOfHome(500);
        index3.setPriceOfHotel(2500);
        Map.put(3, index3);
        numberOfCity.add(3);
        
        PlaceModel index4 = new PlaceModel(4, "โรงแรมเซนทรัล", 2000);
        index4.setPriceHotel(250, 300, 350, 400, 450);
        Map.put(4, index4);
        numberOfHotel.add(4);
        
        PlaceModel index5 = new PlaceModel(5, "โรงแรมการ์เด้น", 2000);
        index5.setPriceHotel(250, 300, 350, 400, 450);
        Map.put(5, index5);
        numberOfHotel.add(5);
        
        CityModel index6 = new CityModel(6, "ตลาดโบ้เบ้", 1000);
        index6.setPriceHome(60, 300, 900, 2700, 4000, 9500);
        index6.setPriceOfHome(500);
        index6.setPriceOfHotel(2500);
        Map.put(6, index6);
        numberOfCity.add(6);
        
        AllUnPossessable index7 = new AllUnPossessable(7, "ประดูดวง");
        Map.put(7, index7);
        
        CityModel index8 = new CityModel(8, "เยาวราช", 1000);
        index8.setPriceHome(60, 300, 900, 2700, 4000, 9500);
        index8.setPriceOfHome(500);
        index8.setPriceOfHotel(2500);
        Map.put(8, index8);
        numberOfCity.add(8);
        
        CityModel index9 = new CityModel(9, "จันทบุรี", 1200);
        index9.setPriceHome(80, 400, 1000, 3000, 4500, 10500);
        index9.setPriceOfHome(500);
        index9.setPriceOfHotel(2500);
        Map.put(9, index9);
        numberOfCity.add(9);
        
        AllUnPossessable index10 = new AllUnPossessable(10, "คุก");
        Map.put(10, index10);
        
        CityModel index11 = new CityModel(11, "กาญจนบุรี", 1400);
        index11.setPriceHome(100, 500, 1500, 4500, 6250, 13750);
        index11.setPriceOfHome(1000);
        index11.setPriceOfHotel(5000);
        Map.put(11, index11);
        numberOfCity.add(11);
        
        PlaceModel index12 = new PlaceModel(12, "การไฟฟ้า", 1500);
        index12.setPriceHotel(300, 600);
        Map.put(12, index12);
        numberOfDuo.add(12);
        
        CityModel index13 = new CityModel(13, "ระยอง", 1400);
        index13.setPriceHome(100, 500, 1500, 4500, 6250, 13750);
        index13.setPriceOfHome(1000);
        index13.setPriceOfHotel(5000);
        Map.put(13, index13);
        numberOfCity.add(13);
        
        CityModel index14 = new CityModel(14, "สุโขทัย", 1600);
        index14.setPriceHome(120, 600, 1800, 5000, 7000, 16000);
        index14.setPriceOfHome(1000);
        index14.setPriceOfHotel(5000);
        Map.put(14, index14);
        numberOfCity.add(14);
        
        PlaceModel index15 = new PlaceModel(15, "โรงแรมเอเมอรัล", 2000);
        index15.setPriceHotel(250, 300, 350, 400, 450);
        Map.put(15, index15);
        numberOfHotel.add(15);
        
        CityModel index16 = new CityModel(16, "ภูเก็ต", 1800);
        index16.setPriceHome(140, 700, 2000, 5500, 7500, 17000);
        index16.setPriceOfHome(1000);
        index16.setPriceOfHotel(5000);
        Map.put(16, index16);
        numberOfCity.add(16);
        
        AllUnPossessable index17 = new AllUnPossessable(17, "หีบสมบัติ");
        Map.put(17, index17);

        CityModel index18 = new CityModel(18, "สุราษฎร์ธานี", 1800);
        index18.setPriceHome(140, 700, 2000, 5500, 7500, 17000);
        index18.setPriceOfHome(1000);
        index18.setPriceOfHotel(5000);
        Map.put(18, index18);
        numberOfCity.add(18);
        
        CityModel index19 = new CityModel(19, "สงขลา", 2000);
        index19.setPriceHome(160, 800, 2200, 6000, 8000, 18000);
        index19.setPriceOfHome(1000);
        index19.setPriceOfHotel(5000);
        Map.put(19, index19);
        numberOfCity.add(19);
        
        AllUnPossessable index20 = new AllUnPossessable(20, "แวะพักผ่อนพัทยา");
        Map.put(20, index20);
        
        CityModel index21 = new CityModel(20, "เพชรบุรี", 2200);
        index21.setPriceHome(180, 900, 2500, 7000, 8750, 19250);
        index21.setPriceOfHome(1500);
        index21.setPriceOfHotel(7500);
        Map.put(21, index21);
        numberOfCity.add(21);
        
        AllUnPossessable index22 = new AllUnPossessable(21, "ประดูดวง");
        Map.put(22, index22);
        
        CityModel index23 = new CityModel(23, "เชียงใหม่", 2200);
        index23.setPriceHome(180, 900, 2500, 7000, 8750, 19250);
        index23.setPriceOfHome(1500);
        index23.setPriceOfHotel(7500);
        Map.put(23, index23);
        numberOfCity.add(23);
        
        CityModel index24 = new CityModel(24, "เชียงราย", 2400);
        index24.setPriceHome(200, 1000, 2500, 7500, 9250, 20250);
        index24.setPriceOfHome(1500);
        index24.setPriceOfHotel(7500);
        Map.put(24, index24);
        numberOfCity.add(24);
        
        PlaceModel index25 = new PlaceModel(25, "แกรนด์จอมเทียน", 2000);
        index25.setPriceHotel(250, 300, 350, 400, 450);
        Map.put(25, index25);
        numberOfHotel.add(25);
        
        CityModel index26 = new CityModel(26, "แม่ฮ่องสอน", 2600);
        index26.setPriceHome(220, 1100, 3300, 8000, 9750, 21250);
        index26.setPriceOfHome(1500);
        index26.setPriceOfHotel(7500);
        Map.put(26, index26);
        numberOfCity.add(26);
        
        CityModel index27 = new CityModel(27, "ลำปาง", 2600);
        index27.setPriceHome(220, 1100, 3300, 8000, 9750, 21250);
        index27.setPriceOfHome(1500);
        index27.setPriceOfHotel(7500);
        Map.put(27, index27);
        numberOfCity.add(27);
        
        PlaceModel index28 = new PlaceModel(28, "การประปา", 1500);
        index28.setPriceHotel(300, 600);
        Map.put(28, index28);
        numberOfDuo.add(28);
        
        CityModel index29 = new CityModel(29, "โคราช", 2800);
        index29.setPriceHome(220, 1200, 3600, 8500, 10250, 22250);
        index29.setPriceOfHome(1500);
        index29.setPriceOfHotel(7500);
        Map.put(29, index29);
        numberOfCity.add(29);
        
        AllUnPossessable index30 = new AllUnPossessable(30, "ไปคุก");
        Map.put(30, index30);
        
        CityModel index31 = new CityModel(31, "แดนเนรมิต", 3000);
        index31.setPriceHome(260, 1300, 3900, 9000, 11000, 23750);
        index31.setPriceOfHome(2000);
        index31.setPriceOfHotel(10000);
        Map.put(31, index31);
        numberOfCity.add(31);
        
        CityModel index32 = new CityModel(32, "แดนเนรมิต", 3000);
        index32.setPriceHome(260, 1300, 3900, 9000, 11000, 23750);
        index32.setPriceOfHome(2000);
        index32.setPriceOfHotel(10000);
        Map.put(32, index32);
        numberOfCity.add(32);
        
        AllUnPossessable index33 = new AllUnPossessable(33, "หีบสมบัติ");
        Map.put(33, index33);
        
        CityModel index34 = new CityModel(34, "อุบลราชธานี", 3200);
        index34.setPriceHome(280, 1500, 4500, 10000, 12000, 26000);
        index34.setPriceOfHome(2000);
        index34.setPriceOfHotel(10000);
        Map.put(34, index34);
        numberOfCity.add(34);
        
        PlaceModel index35 = new PlaceModel(35, "โรงแรมโนโวเทล", 2000);
        index35.setPriceHotel(250, 300, 350, 400, 450);
        Map.put(35, index35);
        numberOfHotel.add(35);
        
        AllUnPossessable index36 = new AllUnPossessable(21, "ประดูดวง");
        Map.put(36, index36);
        
        CityModel index37 = new CityModel(37, "ดอนเมือง", 3500);
        index37.setPriceHome(350, 1750, 5000, 11000, 13000, 28000);
        index37.setPriceOfHome(2000);
        index37.setPriceOfHotel(10000);
        Map.put(37, index37);
        numberOfCity.add(37);
        
        AllUnPossessable index38 = new AllUnPossessable(38, "เสียภาษี");
        Map.put(38, index38);

        CityModel index39 = new CityModel(39, "เสาชิงช้า", 4000);
        index39.setPriceHome(500, 2000, 6000, 14000, 17000, 37000);
        index39.setPriceOfHome(2000);
        index39.setPriceOfHotel(10000);
        Map.put(39, index39);
        numberOfCity.add(39);

    }
    
    public Object getPlace(int index){
        return Map.get(index);
    }

    public ArrayList<Integer> getNumberOfCity() {
        return numberOfCity;
    }

    public ArrayList<Integer> getNumberOfHotel() {
        return numberOfHotel;
    }

    public ArrayList<Integer> getNumberOfDuo() {
        return numberOfDuo;
    }

    public static HashMap<Integer, Object> getMap() {
        return Map;
    }
    
    
}
