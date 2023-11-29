
package data;

/**
 *
 * @author minat
 */
public class Racket extends ShopStuff{
    
    private double weight;
    private double maxLBS; // sức căng tối đa vợt có thể đạt được

    public Racket(String id, String name, String brandName, int price, double weight, double maxLBS) {
        super(id, name, price, brandName);
        this.weight = weight;
        this.maxLBS = maxLBS;
    }

    
    @Override
    public void showInfoProducts() {
        String mess;
        mess = String.format("|%5s|%-15s|  %7d|   %10s|     %4.2f|  %8.2f|",
                               id, name, price, brandName, weight, maxLBS);
        System.out.println(mess);
    }


    
    
    
}
