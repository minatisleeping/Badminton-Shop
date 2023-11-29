
package data;

/**
 *
 * @author minat 
 */
public abstract class ShopStuff implements Comparable<ShopStuff> {
    protected String id;
    protected String name;
    protected int price;
    protected String brandName;

    public ShopStuff(String id, String name, int price, String brandName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brandName = brandName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    
    public abstract void showInfoProducts();

    @Override
    public String toString() {
        return String.format("|%-5s|%-10s|  %7d|   %10s|\n",
                                id, name, price, brandName);
    }

    
    
    @Override
    public int compareTo(ShopStuff o) {
        return this.id.compareToIgnoreCase(o.id);
    }
    
    
    
    
}
