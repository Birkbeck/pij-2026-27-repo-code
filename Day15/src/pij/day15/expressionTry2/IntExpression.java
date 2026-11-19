package pij.day15.expressionTry2;

/**
 * Represents a (simple or complex) mathematical expression. An IntExpression
 * can provide its value and its number of nodes as a tree.
 */
public interface IntExpression {

    /**
     * Returns the int value represented by this IntExpression.
     *
     * @return the int value represented by this IntExpression
     */
    int value();

    /**
     * Returns the number of sub-expressions of this IntExpression (its "size").
     *
     * @return the number of nodes of this IntExpression.
     */
    int numberOfNodes();
}
