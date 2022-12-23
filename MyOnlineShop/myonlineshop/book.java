
package myonlineshop;

public class book extends Product {
    @Override
    public void setPrice(double price){
        this.price=price;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
