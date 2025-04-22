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
    private final String address;

    public SmartHome(String owner, String address) {
        this.owner = owner;
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public class Room {
        private final String name;
        private int deviceCount;

        public Room(String name, int deviceCount) {
            this.name = name;
            this.deviceCount = deviceCount;
        }

        public void describe() {
            System.out.printf("Название комнаты: %s Количество устройств: %d Владелец дома: %s\n", name, deviceCount, owner);
        }

        public void setDeviceCount(int deviceCount) {
            this.deviceCount = deviceCount;
        }

        public int getDeviceCount() {
            return deviceCount;
        }
    }

    public static class Device {
        private final String name;
        private boolean isOn;

        public Device(String name, boolean isOn) {
            this.name = name;
            this.isOn = isOn;
        }

        public void toggle() {
            if (this.isOn()) {
                this.setOn(false);
            } else {
                this.setOn(true);
            }
            System.out.printf("Устройство %s теперь ", name);
            if (this.isOn()) {
                System.out.println("включено");
            } else {
                System.out.println("выключено");
            }
        }

        public boolean isOn() {
            return isOn;
        }

        public void setOn(boolean on) {
            this.isOn = on;
        }
    }
}
