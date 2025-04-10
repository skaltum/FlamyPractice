package FlamyMap.com.pwflamy.task1.dto;

public class Fruit extends Creature {

    public Fruit(Integer id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + getId() +
                '}';
    }
}
