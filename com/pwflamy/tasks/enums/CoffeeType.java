package FlamyMap.com.pwflamy.tasks.enums;

public enum CoffeeType {
    ESPRESSO(7, "крепкий"),
    LATTE(8, "нежный"),
    CAPPUCCINO(9, "сбалансированный"),
    AMERICANO(10, "крепкий"),
    MOCHA(11, "нежный");
    private final int price;
    private final String strength;
    private static CoffeeType[] array = CoffeeType.values();

    CoffeeType(int price, String strength) {
        this.price = price;
        this.strength = strength;
    }

    public int getPrice() {
        return price;
    }

    public String getStrength() {
        return strength;
    }

    public static CoffeeType getType(String neededType) {
        for (CoffeeType i : array) {
            String name = i.name();
            if (name.equalsIgnoreCase(neededType)) return i;
        }
        return null;
    }
}
