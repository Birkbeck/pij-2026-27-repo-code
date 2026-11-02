package pij.day08solutions.mapToCount;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/** Exercise 6. */
public class MapToCount {
    /**
     * Returns a map from collection entries to number of occurrences in
     * {@code coll}. Does not modify {@code coll}.
     *
     * @param coll the collection to analyse
     * @return a map from collection entries to number of occurrences in
     *  {@code coll}
     * @param <E> generic type of the entries of {@code coll}
     */
    public static <E> Map<E, Integer> count(Collection<? extends E> coll) {
        Map<E, Integer> result = new LinkedHashMap<>();
        for (E e : coll) {
            // ALTERNATIVE 1:
            //int oldCount = result.containsKey(e) ? result.get(e) : 0;
            // downside of this approach: needs to check twice whether
            // result contains e

            // ALTERNATIVE 2:
            //Integer oldCount = result.get(e);
            //if (oldCount == null) {
            //    oldCount = 0;
            //}
            // more efficient than ALTERNATIVE 1, but more verbose

            // ALTERNATIVE 3:
            int oldCount = result.getOrDefault(e, 0);
            result.put(e, oldCount + 1);
        }
        return result;
    }
}
