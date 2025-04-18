package FlamyMap.com.pwflamy.tasks.enums;

public class CoffeeOrder {
    public static void makeOrder(CoffeeType type) {
        System.out.printf("Ваш заказ: %s Цена: %d Крепость: %s", type.name(), type.getPrice(), type.getStrength());
    }
}
