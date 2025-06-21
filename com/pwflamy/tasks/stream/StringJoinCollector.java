package FlamyMap.com.pwflamy.tasks.stream;

import java.util.StringJoiner;
import java.util.stream.Collector;

public class StringJoinCollector {
    public static Collector<String, StringJoiner, String> StringJoinNow() {
        return Collector.of(
                () -> new StringJoiner(","),
                StringJoiner::add,
                StringJoiner::merge,
                StringJoiner::toString);

    }
}
