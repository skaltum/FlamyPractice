package FlamyMap.com.pwflamy.tasks.exceptions;

public class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void buy(int quantity) {
        if (quantity > stock) throw new OutOfStockException("Недостаточно товара на складе", this.stock);
        else stock -= quantity;
    }
}
