package FlamyMap.com.pwflamy.tasks.immutable;

import java.util.List;

public class ProbablyImmutableClass {

    private String id;
    private int version;
    private List<String> items;

    public ProbablyImmutableClass(String id, int version, List<String> items) {
        this.id = id;
        this.version = version;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
