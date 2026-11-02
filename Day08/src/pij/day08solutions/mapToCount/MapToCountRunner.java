package pij.day08solutions.mapToCount;

import java.util.List;
import java.util.Map;

public class MapToCountRunner {
    static void main() {
        List<String> list = List.of("Birkbeck", "London", "Birkbeck");
        Map<String, Integer> mapToCount = MapToCount.count(list);
        IO.println(mapToCount);
    }
}
