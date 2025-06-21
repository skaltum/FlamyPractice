package FlamyMap.com.pwflamy.tasks.exceptions;

import java.util.List;

public class Store {
    private final List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    private Product findProduct(String name) throws ProductNotFoundException {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        throw new ProductNotFoundException();
    }

    public void purchase(String name, int quantity) {
        try {
            Product product = findProduct(name);
            product.buy(quantity);
            System.out.printf("Успешно куплен товар %s в количестве %d штук%n", name, quantity);
        } catch (ProductNotFoundException e) {
            System.out.printf("Товар с именем %s не найден%n", name);
        } catch (OutOfStockException ex) {
            System.out.printf("Недостаточно товара %s. Текущее количество - %d%n", name, ex.getCurrentStock());
        }
        System.out.println("Спасибо за визит!");
    }
}
