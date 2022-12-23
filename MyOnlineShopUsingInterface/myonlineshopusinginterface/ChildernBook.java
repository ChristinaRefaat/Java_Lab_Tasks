
package myonlineshopusinginterface;

public class ChildernBook extends book {
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
