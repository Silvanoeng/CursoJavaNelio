package exemploAula67;

public class Produto {
    private String name;
    private double price;
    private int quantity;

    public Produto(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void removeQuantity(int quantity) {
        this.quantity -= quantity;
    }

    public double totalValueInStock() {
        return this.price*this.quantity;
    }

    @Override
    public String toString() {
        return "Name: " + name +", price: " + price + ", quantity: " + quantity + ", value in stock: " + totalValueInStock();
    }
}
