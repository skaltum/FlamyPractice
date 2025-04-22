package FlamyMap.com.pwflamy.tasks.nestedclasses;

public class Tests {

    /**
     * Создай объект SmartHome, несколько объектов комнат Room и вызови у них метод describe(). Создай объект устройства Device
     * и вызови метод toggle() несколько раз.
     */
    public static void main(String[] args) {
        SmartHome home = new SmartHome("Флами", "Бэйкер-стрит 201");
        SmartHome.Room kitchen = home.new Room("Кухня", 4);
        SmartHome.Room bedroom = home.new Room("Спальня", 3);
        SmartHome.Room hall = home.new Room("Зал", 6);
        kitchen.describe();
        bedroom.describe();
        hall.describe();
        SmartHome.Device mixer = new SmartHome.Device("Миксер", false);
        mixer.toggle();
        mixer.toggle();
        mixer.toggle();
        mixer.toggle();
    }
}
