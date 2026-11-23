package pij.day16.map;

import java.util.Arrays;

/**
 * Driver class for class Shifter.
 */
public class ShifterDriver {
    static void main() {
        runShifterMap();
        runShifterSort();
    }

    private static void runShifterMap() {
        Shifter s = new Shifter(10);
        int[] myData = { 5, 6, 7, 8 };
        int[] shifted1 = s.shiftAll(myData);
        int[] shifted2 = Shifter.shiftAll(s, myData);

        IO.println(Arrays.toString(myData));
        IO.println(Arrays.toString(shifted1));
        IO.println(Arrays.toString(shifted2));
    }

    public static void runShifterSort() {
        Shifter[] shifters = { new Shifter(10), new Shifter(12),
                new Shifter(10), new Shifter(8), new Shifter(10) };
        IO.println(Arrays.toString(shifters));
        Shifter.sortShifters(shifters);
        IO.println(Arrays.toString(shifters));
    }
}
