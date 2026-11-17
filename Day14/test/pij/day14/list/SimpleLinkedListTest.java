package pij.day14.list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SimpleLinkedListTest {

    private static List<Integer> make1List() {
        return List.of(1);
    }

    private static SimpleLinkedList<Integer> make1SimpleLinkedList() {
        SimpleLinkedList<Integer> simpleList = new SimpleLinkedList<>();
        simpleList.add(1);
        return simpleList;
    }

    private static List<Integer> make123List() {
        return List.of(1, 2, 3);
    }

    private static SimpleLinkedList<Integer> make123SimpleLinkedList() {
        SimpleLinkedList<Integer> simpleList = new SimpleLinkedList<>();
        simpleList.add(1);
        simpleList.add(2);
        simpleList.add(3);
        return simpleList;
    }

    @Test
    void testConstructor_List_zeroElements() {
        List<Integer> input = List.of();
        SimpleList<Integer> simpleList = new SimpleLinkedList<>(input);
        List<Integer> actual = simpleList.toList();
        List<Integer> expected = List.of();
        assertEquals(expected, actual);
    }

    @Test
    void testConstructor_List_oneElement() {
        List<Integer> input = make1List();
        SimpleList<Integer> actualSimpleList = new SimpleLinkedList<>(input);
        List<Integer> actual = actualSimpleList.toList();
        List<Integer> expected = make1List();
        assertEquals(expected, actual);
    }

    @Test
    void testConstructor_List_threeElements() {
        List<Integer> input = make123List();
        SimpleList<Integer> actualSimpleList = new SimpleLinkedList<>(input);
        List<Integer> actual = actualSimpleList.toList();
        List<Integer> expected = make123List();
        assertEquals(expected, actual);
    }

    @Test
    void testConstructor_List_null() {
        assertThrows(NullPointerException.class,
                () ->  {
                    List<Integer> l = null;
                    new SimpleLinkedList<>(l);
                });
    }

    @Test
    void testConstructor_SimpleList_zeroElements() {
        SimpleList<Integer> input = new SimpleLinkedList<>();
        SimpleList<Integer> actualSimpleList = new SimpleLinkedList<>(input);
        List<Integer> actual = actualSimpleList.toList();
        List<Integer> expected = List.of();
        assertEquals(expected, actual);
    }

    @Test
    void testConstructor_SimpleList_oneElement() {
        SimpleList<Integer> input = make1SimpleLinkedList(); // automatic upcast
        SimpleList<Integer> actualSimpleList = new SimpleLinkedList<>(input);
        List<Integer> actual = actualSimpleList.toList();
        List<Integer> expected = make1List();
        assertEquals(expected, actual);
    }

    @Test
    void testConstructor_SimpleList_threeElements() {
        SimpleList<Integer> input = make123SimpleLinkedList(); // automatic upcast
        SimpleList<Integer> actualSimpleList = new SimpleLinkedList<>(input);
        List<Integer> actual = actualSimpleList.toList();
        List<Integer> expected = make123List();
        assertEquals(expected, actual);
    }

    @Test
    void testConstructor_SimpleList_null() {
        assertThrows(NullPointerException.class,
                () -> {
                    SimpleList<Integer> l = null;
                    new SimpleLinkedList<>(l);
                });
    }

    @Test
    void testConstructor_SimpleLinkedList_zeroElements() {
        SimpleLinkedList<Integer> input = new SimpleLinkedList<>();
        SimpleList<Integer> actualSimpleList = new SimpleLinkedList<>(input);
        List<Integer> actual = actualSimpleList.toList();
        List<Integer> expected = List.of();
        assertEquals(expected, actual);
    }

    @Test
    void testConstructor_SimpleLinkedList_oneElement() {
        SimpleLinkedList<Integer> input = make1SimpleLinkedList();
        SimpleList<Integer> actualSimpleList = new SimpleLinkedList<>(input);
        List<Integer> actual = actualSimpleList.toList();
        List<Integer> expected = make1List();
        assertEquals(expected, actual);
    }

    @Test
    void testConstructor_SimpleLinkedList_threeElements() {
        SimpleLinkedList<Integer> input = make123SimpleLinkedList();
        SimpleList<Integer> actualSimpleList = new SimpleLinkedList<>(input);
        List<Integer> actual = actualSimpleList.toList();
        List<Integer> expected = make123List();
        assertEquals(expected, actual);
    }

    @Test
    void testConstructor_SimpleLinkedList_null() {
        assertThrows(NullPointerException.class,
                () -> {
                    SimpleLinkedList<Integer> l = null;
                    new SimpleLinkedList<>(l);
                });
    }
}
