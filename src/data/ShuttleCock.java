/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author minat
 */
public class ShuttleCock extends ShopStuff{

    public ShuttleCock(String id,String brandName, String name, int price ) {
        super(id, name, price, brandName);
    }
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public void showInfoProducts() {
        String mess;
        mess = String.format("|%5s|%-15s|  %7d|   %10s|         |          |",
                id, name, price, brandName);
        System.out.println(mess);
    }
    
    

    
    
    
    
}
