package FlamyMap.com.pwflamy.tasks.exceptions;

import java.util.ArrayList;
import java.util.List;

public class tests {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Product potato = new Product("Картофель", 20);
        Product banana = new Product("Банан", 30);
        Product cabbage = new Product("Капуста", 10);
        products.add(potato);
        products.add(banana);
        products.add(cabbage);
        Store store = new Store(products);
        store.purchase("Метамфетамин", 50);
        store.purchase("Картофель", 10);
        store.purchase("Картофель", 30);
    }
}