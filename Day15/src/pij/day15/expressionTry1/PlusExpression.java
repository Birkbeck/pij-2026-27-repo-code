package pij.day15.expressionTry1;

import java.util.Objects;

/**
 * Represents an IntExpression of the form (e1 + e2).
 */
public class PlusExpression implements IntExpression {

    /** the left subexpression; non-null */
    private IntExpression left;

    /** the right subexpression; non-null */
    private IntExpression right;

    /**
     * Constructs a PlusExpression with left and right as direct
     * subexpressions.
     *
     * @param left the left subexpression
     * @param right the right subexpression
     * @throws NullPointerException if left or right is null
     */
    public PlusExpression(IntExpression left, IntExpression right) {
        this.left = Objects.requireNonNull(left, "Illegal null IntExpression!");
        this.right = Objects.requireNonNull(right, "Illegal null IntExpression!");
    }

    /**
     * Getter for the left subexpression.
     *
     * @return the left subexpression
     */
    public IntExpression getLeft() {
        return this.left;
    }

    /**
     * Getter for the right subexpression.
     *
     * @return the right subexpression
     */
    public IntExpression getRight() {
        return this.right;
    }

    /**
     * @return the sum of the values of the direct subexpressions
     */
    @Override
    public int value() {
        return this.left.value() + this.right.value();
    }

    /**
     * The number of nodes of a PlusExpression is 1 plus the number of
     * nodes of the left subexpression and of the right subexpression.
     *
     * @return the number of nodes of this expression
     */
    @Override
    public int numberOfNodes() {
        return 1 + this.left.numberOfNodes() + this.right.numberOfNodes();
    }
}
