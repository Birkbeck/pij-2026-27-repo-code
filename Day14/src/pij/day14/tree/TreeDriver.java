package pij.day14.tree;

/**
 * Driver class for class Tree. Performs different tree traversals.
 */
public class TreeDriver {
    static void main() {
        Tree<Integer> tree = new Tree<>(
                new TreeNode<>(1,
                        new TreeNode<>(2,
                                new TreeNode<>(4),
                                new TreeNode<>(5)),
                        new TreeNode<>(3,
                                new TreeNode<>(6),
                                new TreeNode<>(7)))
        );
        IO.println("preOrder: ");
        tree.printTreePreOrder();
        IO.println("inOrder: ");
        tree.printTreeInOrder();
        IO.println("postOrder: ");
        tree.printTreePostOrder();
        IO.println("preOrderLoop: ");
        tree.printTreePreOrderLoop();
    }
}
