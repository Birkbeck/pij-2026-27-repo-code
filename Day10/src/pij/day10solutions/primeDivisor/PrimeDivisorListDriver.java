package pij.day10solutions.primeDivisor;

/** Day 10, Exercise 5. */
public class PrimeDivisorListDriver {
    static void main() {
        PrimeDivisorList list = new PrimeDivisorList();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(11);
        list.remove(4);
        IO.println(list);
        //list.add(null); // NullPointerException
        //list.add(15); // IllegalArgumentException
    }
}
