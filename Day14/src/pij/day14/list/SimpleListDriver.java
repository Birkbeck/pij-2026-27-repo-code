package pij.day14.list;

/**
 * Driver class for interface SimpleList and class SimpleLinkedList.
 */
public class SimpleListDriver {

    private static void driveInteger(SimpleList<Integer> simpleList) {
        final int INSIDE = 8022;
        final int OUTSIDE = 42;

        printListInfo(simpleList);
        simpleList.add(0, 8021);
        simpleList.add(1, INSIDE);
        simpleList.add(0, 8020);
        simpleList.add(3, 8023);
        IO.println(simpleList.get(2));
        printListInfo(simpleList);
        printElementInfo(simpleList, INSIDE);
        printElementInfo(simpleList, OUTSIDE);
        IO.println(simpleList.set(3, OUTSIDE));
        printListInfo(simpleList);
        printElementInfo(simpleList, OUTSIDE);
        IO.println(simpleList.remove(1));
        printListInfo(simpleList);
        simpleList.clear();
        printListInfo(simpleList);
        simpleList.add(0, 9030);
        printListInfo(simpleList);
    }

    private static <E> void printElementInfo(SimpleList<E> simpleList, E value) {
        IO.println(simpleList + ".contains(" + value + "): " + simpleList.contains(value));
        IO.println(simpleList + ".indexOf(" + value + "): " + simpleList.indexOf(value));
    }


    private static <E> void printListInfo(SimpleList<E> simpleList) {
        IO.println(simpleList + ".isEmpty(): " + simpleList.isEmpty());
        IO.println(simpleList + ".size(): " + simpleList.size());
    }

    static void main() {
        SimpleList<Integer> simpleList = new SimpleLinkedList<>();
        driveInteger(simpleList);
    }
}
