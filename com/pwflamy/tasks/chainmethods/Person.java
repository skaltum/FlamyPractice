package FlamyMap.com.pwflamy.tasks.chainmethods;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Прочитать, что такое "Chaining method" в java. Добавить в этот класс сеттеры с использованием этого стиля программирования.
 * Создать метод main, в котором создать несколько объектов Person и заполнить им поля, используя созданные сеттеры
 */
public class Person {

    private Long id;
    private String name;
    private ZonedDateTime createdAt;

    public Person setId(Long id) {
        this.id = id;
        return this;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public static void getInfo(Person person) {
        System.out.printf("Данные человека: ID:%d Имя: %s Появился на свет: %s \n", person.getID(), person.getName(), person.getDate());
    }

    public Long getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss z");
        return this.createdAt.format(formatter);
    }
}
