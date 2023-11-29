package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import util.FakeLibrarys;

/**
 *
 * @author minat
 */
public class ProductsList {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<ShopStuff> productsList = new ArrayList();
    
        
    public void addPros() {
        // add some rackets
        productsList.add(new Racket("R001" , "9000C"      , "LINING", 3700000 , 0.88 , 28.5));
        productsList.add(new Racket("R015" , "TECTONIC 9" , "LINING", 3500000 , 0.85 , 27  ));
        productsList.add(new Racket("R035" , "88D PRO"    , "LINING", 4200000 , 0.86 , 29  ));
        
        
        // add some clothes
        productsList.add(new Clothes("C001" , "QUẦN VNB"   , 100000 , "VNB"   ));
        productsList.add(new Clothes("C021" , "ÁO YONEX"   , 150000 , "YONEX" ));
        productsList.add(new Clothes("C088" , "VÁY LINING" , 200000 , "LINING"));
        
        // add some shoes 
        productsList.add(new Shoe("S801" , "65Z3"      , 2400000 , "YONEX" ));
        productsList.add(new Shoe("S102" , "A311"      , 1050000 , "VICTOR"));
        productsList.add(new Shoe("S401" , "GATESKY+3" , 1800000 , "MIZUNO"));
        productsList.add(new Shoe("S123" , "AYAT001-2" , 4400000 , "LINING"));
        
        // add some shuttles
        productsList.add(new ShuttleCock("Q001" , "BUDABU"    , "CẦU BUDABU"    , 225000));
        productsList.add(new ShuttleCock("Q002" , "VNB"       , "CẦU VNB"       , 215000));
        productsList.add(new ShuttleCock("Q003" , "SAO MAI"   , "CẦU SAO MAI"   , 235000));
        productsList.add(new ShuttleCock("Q004" , "88"        , "CẦU 88"        , 240000));
        productsList.add(new ShuttleCock("Q005" , "VINA STAR" , "CẦU VINA STAR" , 240000));
        
        System.out.println("Added some products into list..");
    }
    
    public void addRacket() { //String id, String name, String brandName, int price, double weight, double maxLBS

        String id, name, brandName;
        int price;
        double weight, maxLBS;
        int pos;

        do {
            id = FakeLibrarys.controlID("Input id(Rxxx): ",
                    "Rxxx(x is a digit)", "^[R|r]\\d{3}$");
            pos = searchProsByID(id);
            if (pos >= 0) 
                System.out.println("The racket's ID already exists. Input another one!");
            
        } while (pos != -1);

        name = FakeLibrarys.controlString("- Name:    "     , "The racket name is already have!");
        brandName = FakeLibrarys.controlString("- Brand:   ", "VNB, Lining, Yonex, Kawasaki, ...");
        price = FakeLibrarys.controlInteger("- Price:   "   , "Maybe price is lower 10.000.000 VNĐ", 500000, 10000000); // [500.000 - 10.000.000]
        weight = FakeLibrarys.controlDouble("- Weight:  "   , "Maybe Weight is lower 2kg", 0.1, 2.0); // [100g - 2.000g] 
        maxLBS = FakeLibrarys.controlDouble("- Max LBS: "   , "Maybe max LBS is in range [21-30]", 21, 30); // 21 lbs ~ 9.5 kg  
        productsList.add(new Racket(id, name, brandName, price, weight, maxLBS));
        System.out.println("A new racket is added sucessfully !");
    }

    public void addClothes() { //String id, String name, int price, String brandName

        String id, name, brandName;
        int price, pos;

        do {
            id = FakeLibrarys.controlID("Input id(Cxxx): ",
                    "Cxxx(x is a digit)", "^[C|c]\\d{3}$");
            pos = searchProsByID(id);
            if (pos >= 0) 
                System.out.println("The clothes's ID already exists. Input another one!");
            
        } while (pos != -1);

        name = FakeLibrarys.controlString("- Name:  ", "The clothes name is already have!");
        brandName = FakeLibrarys.controlString("- Brand: ", "VNB, Lining, Yonex, Kawasaki, ...");
        price = FakeLibrarys.controlInteger("- Price: ", "Maybe price is lower 2.000.000 VNĐ", 100000, 2000000); // [100.000 - 2.000.000]
        productsList.add(new Clothes(id, name, price, brandName));
        System.out.println("A new clothes is added sucessfully !");
    }

    public void addShoe() { //String id, String name, int price, String brandName

        String id, name, brandName;
        int price, pos;

        do {
            id = FakeLibrarys.controlID("Input id(Sxxx): ",
                    "Sxxx(x is a digit)", "^[S|s]\\d{3}$");
            pos = searchProsByID(id);
            if (pos >= 0) 
                System.out.println("The shoe's ID already exists. Input another one!");        
        } while (pos != -1);

        name = FakeLibrarys.controlString("- Name :  ", "The shoe's name is already have!");
        brandName = FakeLibrarys.controlString("- Brand: ", "VNB, Lining, Yonex, Kawasaki, ...");
        price = FakeLibrarys.controlInteger("- Price: ", "Maybe price is lower 4.000.000 VNĐ", 500000, 4000000); // [500.000 - 4.000.000]
        productsList.add(new Shoe(id, name, price, brandName));
        System.out.println("A new shoe is added sucessfully !");
    }

    public void addShuttleCock() { // int id, String brandName, int price

        String name, id, brandName;
        int price, pos;

        do {
            id = FakeLibrarys.controlID("Input id(Qxxx): ",
                    "The format of id is Qxxx(x is a digit)", "^[Q|q]\\d{3}$");
            pos = searchProsByID(id);
            if (pos >= 0) 
                System.out.println("The shuttle's ID already exists. Input another one!"); 
        } while (pos != -1);

        name = FakeLibrarys.controlString("- Name :  ", "The shuttle's name is already have!");
        brandName = FakeLibrarys.controlString("- Brand: ", "VNB, Lining, Yonex, Kawasaki, ...");
        price = FakeLibrarys.controlInteger("- Price: ", "Maybe price is lower 10.000.000 VNĐ", 500000, 10000000); // [500.000 - 10.000.000]
        productsList.add(new ShuttleCock(id, name, brandName, price));
        System.out.println("A new shuttle is added sucessfully !");
    }

    public int searchProsByID(String id) {
        if (productsList.isEmpty()) // list rỗng khỏi tìm
            return -1;

        for (int i = 0; i < productsList.size(); i++) {                     // list ko rỗng thì duyệt hết phần tử mảng
            if (productsList.get(i).getId().equalsIgnoreCase(id)) 
                return i;           // tìm thấy thì return phần tử tìm thấy     
        }
        return -1;                  // duyệt hết ở for trên ko thấy thì sure return -1: not found
    }

    public void searchProsByID() {
        String id;
        ShopStuff x;  //con trỏ trỏ tạm thời đến Pet tìm thấy
        id = FakeLibrarys.controlString("- Input ID: ", "Pro id is required!");
        x = searchProsObjByID(id);
//        System.out.println("------------------------------------------------------------");
        
        if (x == null) {
            System.out.println("Not found!!!");
            System.out.println();
        } 
        else {
            System.out.println(" ~~--------------------------------------------------------------~~ ");
            x.showInfoProducts();
            System.out.println(" ~~--------------------------------------------------------------~~ ");
        }
        
        System.out.println();
    }

    public int searchProsByName(String name) {
        if (productsList.isEmpty()) 
            return -1;
            System.out.println("\n");
       
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getName().equalsIgnoreCase(name)) 
                return i;     
        }
        return -1;
    }

    public ShopStuff searchProsObjByID(String productID) {

        if (productsList.isEmpty()) 
            return null;
        
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getId().equalsIgnoreCase(productID)) 
                return productsList.get(i);
        }
        return null;
    }

    public void updateInfoPros() {
        String id;
        String tmpName;  //change new name to old one
        ShopStuff obj;  //con trỏ tạm thời
        id = FakeLibrarys.controlString("- Input ID: ", "Pro ID is required!");
        obj = searchProsObjByID(id);
        
        if (obj == null) 
            System.out.println("Not found!!!");
        else {
            System.out.println("- This is the Product info before updating");
            System.out.println(" ~~--------------------------------------------------------------~~ ");
            obj.showInfoProducts();
            System.out.println(" ~~--------------------------------------------------------------~~ ");
            System.out.println("- You are required to input a new name");
            tmpName = FakeLibrarys.controlString("- Input new name: ", "Name is required!");
            obj.setName(tmpName);

//            System.out.println("The product info is updated successfully!");
            System.out.println("This is the info of " + id + " you just fixed for a second ago..");
            System.out.println(" ~~--------------------------------------------------------------~~ ");
            obj.showInfoProducts();
            System.out.println(" ~~--------------------------------------------------------------~~ ");
            System.out.println("\n");
        }
    }

    public void removePros() {

        int pos;
        String id = FakeLibrarys.controlString("- Input ID: ", "Pro ID is required!");;
        String reply;
        pos = searchProsByID(id);
//        System.out.println("------------------------------------------------------------");
        if (pos == -1) 
            System.out.println("Not found!!!");
        else {
            
//            System.out.println("Are you sure to remove this product?(Y/N): ");
            reply = FakeLibrarys.controlString("Are you sure cuz like this info will be permanently delete?(Y/N): ", "Please input your choice(Y/N)").toUpperCase();
            
            if (reply.startsWith("Y")) {
                productsList.remove(pos);
                System.out.println("Deleted successfullly!");
                System.out.println();
            } else 
                System.out.println("Delete is failed!");          
        }
    }

    public void printProsListSortAscByName() {

        if (productsList.isEmpty()) {
            System.out.println("The list is empty. Nothing to print!");
            return;
        }
        
        Comparator compare = new Comparator<ShopStuff>() {
            @Override
            public int compare(ShopStuff o1, ShopStuff o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        };
        
        Collections.sort(productsList, compare);

        String header = String.format("|%5s|%15s|%9s|%13s|%9s|%10s|", "ID", "Name", "PRICE", "BRAND NAME", "WEIGHT", "MAX-LBS");
        System.out.println(" ~~--------------------------------------------------------------~~ ");
        System.out.println(header);
        System.out.println(" ~~--------------------------------------------------------------~~ ");
        
        for (int i = 0; i < productsList.size(); i++) 
            productsList.get(i).showInfoProducts();
  
        System.out.println(" ~~--------------------------------------------------------------~~ ");
        System.out.println("\n");
    }
    
    public void printProsListSortAscByID() {
        if (productsList.isEmpty()) {
            System.out.println("The list is empty. Nothing to print");
            return;
        }
        
        Collections.sort(productsList);
        System.out.println(" ~~--------------------------------------------------------------~~ ");

        String header = String.format("|%5s|%15s|%9s|%13s|%9s|%10s|", "ID", "Name", "PRICE", "BRAND NAME", "WEIGHT", "MAX-LBS");
        System.out.println(header);
        
        for (int i = 0; i < productsList.size(); i++) 
            productsList.get(i).showInfoProducts();
                  
        System.out.println(" ~~--------------------------------------------------------------~~ ");
        System.out.println("\n");
    }

}
