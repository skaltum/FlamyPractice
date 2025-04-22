package FlamyMap.com.pwflamy.tasks.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ProbablyImmutableClass {

    private final String id;
    private final int version;
    private final List<String> items;

    public ProbablyImmutableClass(String id, int version, List<String> items) {
        this.id = id;
        this.version = version;
        this.items = List.copyOf(items);
    }

    public String getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }

}
