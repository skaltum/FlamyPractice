package FlamyMap.com.pwflamy.task2;

import java.util.ArrayList;
import java.util.List;

public class Tests {

    public static void main(String[] args) {
        ProductService productService = new ProductService();

        Product product1 = Product.of("orange", 5);
        Product product2 = Product.of("tomato", 2);
        Product product3 = Product.of("cucumber", 8);
        Product product4 = Product.of("pen", 1);
        Product product5 = Product.of("car", 10000);
        Product product6 = Product.of("moon", 12);
        Product product7 = Product.of("your soul", 666);
        Product product8 = Product.of("your body", 11);
        Product product9 = Product.of("carrot", 18);
        Product product10 = Product.of("onion", 4);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);

        List<Product> productsMoreThan10 = productService.filterProductPriceMoreThan10(products);
        check(productsMoreThan10.equals(List.of(product5, product6, product7, product8, product9)));

        List<Product> productsLessThan15 = productService.filterProductPriceLessThanMaxPrice(products, 15);
        check(productsLessThan15.equals(List.of(product1, product2, product3, product4, product6, product8, product10)));

        List<String> names = productService.transformIntoNames(products);
        check(names.equals(List.of("orange", "tomato", "cucumber", "pen", "car", "moon", "your soul", "your body", "carrot", "onion")));

//        List<Integer> sums = productService.customFuncInterface(products, (product, i) -> product.getPrice() + i, 1000);
//        check(sums.equals(List.of(1005, 1002, 1008, 1001, 11000, 1012, 1666, 1011, 1018, 1004)));
    }

    private static void check(boolean check) {
        if (!check) {
            throw new RuntimeException("Ошибка Ошибка Ошибка ...");
        }
    }
}
