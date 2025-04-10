package FlamyMap.com.pwflamy.task1.dto;

public class Creature {

    private final Integer id;

    public Creature(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "id=" + id +
                '}';
    }
}
