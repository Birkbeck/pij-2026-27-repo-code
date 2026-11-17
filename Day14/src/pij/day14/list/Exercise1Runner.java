package pij.day14.list;

/** Runner class for Exercise 1. */
public class Exercise1Runner {
    static void main() {
        Node<String> myNode = Node.createSelfLoop();
        int size = myNode.size();
        IO.println(size);
    }
}
