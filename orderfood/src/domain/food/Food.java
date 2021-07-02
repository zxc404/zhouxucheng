package domain.food;

/**
 * @author Zxc
 * @version 1.0
 */
public abstract class Food {
    private String name;
    private double price;
    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
