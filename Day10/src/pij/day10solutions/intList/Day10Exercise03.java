package pij.day10solutions.intList;

import java.util.ArrayList;
import java.util.List;

/** Day 10, Exercise 3. */
public class Day10Exercise03 {
    public void launch(int userInput) {
        List<Integer> intList = new ArrayList<Integer>(); // in comments the current content of intList
        intList.add(1); // [1]
        intList.add(2); // [1, 2]
        intList.add(3); // [1, 2, 3]
        intList.add(4); // [1, 2, 3, 4]
        intList.add(5); // [1, 2, 3, 4, 5]
        intList.add(6); // [1, 2, 3, 4, 5, 6]
        try {
            intList.remove(0); // [2, 3, 4, 5, 6]
            IO.println(intList.get(userInput));
            intList.remove(0); // [3, 4, 5, 6]
            IO.println(intList.get(userInput));
            intList.remove(0); // [4, 5, 6]
            IO.println(intList.get(userInput));
            intList.remove(0); // [5, 6]
            IO.println(intList.get(userInput));
            intList.remove(0); // [6]
            IO.println(intList.get(userInput));
            intList.remove(0); // []
            IO.println(intList.get(userInput));
            intList.remove(0); // throws IndexOutOfBoundsException if reached
            IO.println(intList.get(userInput));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Day10Exercise03 launcher = new Day10Exercise03();
        //launcher.launch(0); // 7, 8, ..., 26, 27, 30, 31, 32
        //launcher.launch(2); // 7, 8, ..., 22, 23, 30, 31, 32
        //launcher.launch(4); // 7, 8, ..., 18, 19, 30, 31, 32
        //launcher.launch(6); // 7, 8, ..., 16, 17, 30, 31, 32
    }
}
