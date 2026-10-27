package pij.day07solutions.measurable;

/**
 * Exercise 2:
 * Utility class that provides a method to sum up the measures of the
 * Measurable objects in a given array.
 */
public class MeasureSummer {

    /**
     * Returns the sum of the measures of the objects in {@code }measurables}.
     *
     * @param measurables non-null array that may contain null references
     * @return the sum of the measures of the objects in {@code }measurables}
     */
    public static double sumMeasures(Measurable[] measurables) {
        if (measurables == null) { // Ex 3
            return 0;
        }
        double runningTotal = 0;
        for (int i = 0; i < measurables.length; i++) {
            // ALTERNATIVE 1
            if (measurables[i] == null) { // Ex 3
                continue; // skip the rest of the loop body,
                // run the increment i++, go directly to the loop header
            }
            runningTotal += measurables[i].getMeasure();

            // ALTERNATIVE 2
            //if (measurables[i] != null) { // Ex 3
            //    runningTotal += measurables[i].getMeasure();
            //}
        }
        return runningTotal;
    }
}
