/****************************************************
 * Order.java 
 * Author: Ochwada
 * Date: Friday, 21.Mar.2025, 15:37
 * Description: 
 ***************************************************/

public class Order {

    public String type;
    public int size;
    public Boolean hasMilk;
    public String status;
    public int id;
    public double price;
    public String addOns;

    public Order(int id, String type, int size, Boolean hasMilk, String status, double price, String addOns) {
        this.id = id;
        this.type = type;
        this.size = size;
        this.hasMilk = hasMilk;
        this.status = status;
        this.price = price;
        this.addOns = addOns;
    }


}
