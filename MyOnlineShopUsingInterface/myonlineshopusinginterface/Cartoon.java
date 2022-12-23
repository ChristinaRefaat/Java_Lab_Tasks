package myonlineshopusinginterface;

public class Cartoon extends book {

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
