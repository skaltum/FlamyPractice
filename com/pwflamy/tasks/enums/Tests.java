package FlamyMap.com.pwflamy.tasks.enums;

import java.util.Scanner;

import static FlamyMap.com.pwflamy.tasks.enums.CoffeeOrder.makeOrder;

/**
 * Создай enum CoffeeType, в котором будут перечислены виды кофе, например:
 * ESPRESSO
 * LATTE
 * CAPPUCCINO
 * AMERICANO
 * MOCHA
 * <p>
 * У каждого вида кофе должны быть следующие свойства: цена (int) и крепость (String с вариантами "низкая", "средняя", "высокая")
 * Реализуй класс CoffeeOrder, в котором будет метод makeOrder(CoffeeType type), который выводит в консоль информацию о
 * заказанном кофе: его название, цену и крепость.
 * В main реализуй ввод данных с консоли, чтобы пользователь мог выбрать вид кофе (пользователь должен ввести наименование
 * кофе, которое соответствует enum (например, latte), регистр строки не имеет значения. Используя класс CoffeeOrder
 * выведи информацию о выбранном кофе в консоль.
 */
public class Tests {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название кофе");
        String order = in.nextLine();
        in.close();
        CoffeeType leOrder = CoffeeType.getType(order);
        if (leOrder == null) {
            System.out.println("Неверно введено название заказа");
        } else makeOrder(leOrder);
    }
}
