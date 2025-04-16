package FlamyMap.com.pwflamy.tasks.nestedclasses;

/**
 * Добавь следующие два вложенных класса:
 * 1) нестатический вложенный класс Room с полями "String name" и "int deviceCount", а также метод "void describe()",
 * который выводит в консоль имя комнаты (name), количество устройств (deviceCount) и владельца дома (owner);
 * 2) статический вложенный класс Device с полями "String name" и "boolean isOn", а также метод "void toggle()", который
 * переключает текущее состояние устройства и выводит информации о новом состоянии в консоль.
 */
public class SmartHome {
    private String owner;
    private String address;

    public SmartHome(String owner, String address) {
        this.owner = owner;
        this.address = address;
    }
}
