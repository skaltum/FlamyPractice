package FlamyMap.com.pwflamy.tasks.chainmethods;

import java.time.ZonedDateTime;

import static FlamyMap.com.pwflamy.tasks.chainmethods.Person.getInfo;

public class Tests {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        Person person1 = new Person().setId(100L).setName("Акакий").setCreatedAt(now);
        Person person2 = new Person().setId(101L).setName("Эдуардо").setCreatedAt(now);
        Person person3 = new Person().setId(102L).setName("Игнациус").setCreatedAt(now);
        getInfo(person1);
        getInfo(person2);
        getInfo(person3);
    }
}
