package expressionImproved;

import java.util.function.BiFunction;

public class IntegerUtils {

    public static BiFunction<Integer, Integer, Integer> addFunction() {
        return Integer::sum;
    }

    public static BiFunction<Integer, Integer, Integer> doubleAddFunction() {
        return (x, y) -> (x + y) * 2;
    }

    public static BiFunction<Integer, Integer, Integer> minFunction() {
        return Integer::min;
    }
}
