
package myonlineshopusinginterface;

public class book implements Product{
    public double price;
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice() {
        return price;
    }
}
