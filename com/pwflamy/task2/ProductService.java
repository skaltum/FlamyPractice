package FlamyMap.com.pwflamy.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Задание на использования лямбд
 */
@FunctionalInterface
interface FuncInterface{
    int enlarge(Product product, int i);
}
public class ProductService {

    /**
     * Метод формирует список продуктов, у которых цена больше 10.
     * Данный метод должен быть реализован путем вызова приватного метода filterProducts с использованием
     * анонимного класса как предикат.
     */
    public List<Product> filterProductPriceMoreThan10(List<Product> products) {
        Predicate<Product> anonClass = new Predicate<Product>() {
            @Override
            public boolean test(Product product) {
                return product.getPrice() > 10;
            }
        };
        return filterProducts(products,anonClass);
    }

    /**
     * Метод формирует список продуктов, у которых цена меньше указанной в maxPrice.
     * Данный метод должен быть реализован путем вызова приватного метода filterProducts с использованием
     * лямбды как предиката. Обратить внимание на ограничение, которые накладываются на использовании переменной maxPrice
     * в теле лямбды.
     * Лямбду указать в виде ссылки на метод. Изучить различные типы ссылок на методы и определить какой тип используется в этом случае.
     * В идеале написать ссылку на метод своими силами, не давая подсказать IDE
     */
    public List<Product> filterProductPriceLessThanMaxPrice(List<Product> products,final int maxPrice) {
        Predicate<Product> lambda = (product) -> product.getPrice()<maxPrice;
        return filterProducts(products,lambda);
    }

    /**
     * Метод формирует список имен продуктов.
     * Данный метод должен быть реализован путем вызова приватного метода transform с использованием функции, оформленной
     * в виде лямбды.
     */
    public List<String> transformIntoNames(List<Product> products) {
        Function<Product,String> link = (Product::getName);
        return transform(products,link);
    }

    /**
     * Создать новый функциональный интерфейс, который соответствует лямбде следующего вида: "(Product product, int i) -> product.getPrice() + i"
     * Изменить тип переменной lambda на этот интерфейс.
     * Сделать реализацию метода, которая применяет эту лямбду к каждому элементу списка products и использует переменную i,
     * а результат выполнения лямбды сохраняет в результирующий список.
     */
    public List<Integer> customFuncInterface(List<Product> products, Object lambda,final int i) {
        FuncInterface anonClass = (FuncInterface) lambda;
        List<Integer> list = new ArrayList<>();
        int result;
        for(Product k:products){
            result= anonClass.enlarge(k,i);
            list.add(result);
        }
        return list;
    }

    /**
     * Метод выполняет фильтрацию списка продуктов на основании переданного предиката. В ответ вернуть отфильтрованный
     * список продуктов.
     * Исходный список продуктов не должен быть изменен.
     */
    private List<Product> filterProducts(List<Product> products, Predicate<Product> predicate) {
        List<Product> list=new ArrayList<>();
        for(Product i:products){
            if(predicate.test(i)){
                list.add(i);
            }
        }
        return list;
    }

    /**
     * Метод выполняет преобразование списка продуктов в список типа Т, последовательно применяя mapper к каждому
     * продукту в списке.
     */
    private <T> List<T> transform(List<Product> products, Function<Product, T> mapper) {
        List<T> list = new ArrayList<>();
        T prod;
        for(Product i:products) {
            prod = mapper.apply(i);
            list.add(prod);
        }
        return list;
    }
}
