package pij.day16.expressionExtended;

import java.util.Objects;
import java.util.function.BiFunction;

/**
 * A FunctionExpression is a BinaryExpression with a given
 * BiFunction<Integer, Integer, Integer> for its value computation.
 */
public class FunctionExpression extends BinaryExpression {

    private final BiFunction<Integer, Integer, Integer> function;

    /**
     * Constructs a BinaryExpression with left and right as direct
     * subexpressions.
     *
     * @param left  the left subexpression
     * @param right the right subexpression
     * @param function the function to be computed
     * @param operatorSymbol the operator symbol; write "foo()" to indicate
     *                       that the String representation should be in
     *                       prefix form "foo(left, right)"; without
     *                       parentheses, the form "left " + operatorSymbol
     *                       + " right" is used
     * @throws NullPointerException if left or right or function or
     *                              operatorSymbol is null
     */
    public FunctionExpression(IntExpression left, IntExpression right,
                              BiFunction<Integer, Integer, Integer> function,
                              String operatorSymbol) {
        super(left, right, operatorSymbol);
        this.function = Objects.requireNonNull(function);
    }

    @Override
    public int value() {
        return this.function.apply(getLeft().value(), getRight().value());
    }

    @Override
    public String toString() {
        final String PREFIX_INDICATOR = "(";
        String operatorSymbol = this.getOperatorSymbol();
        if (operatorSymbol.contains(PREFIX_INDICATOR)) {
            return operatorSymbol.substring(0, operatorSymbol.indexOf(PREFIX_INDICATOR))
                    + "(" + getLeft().toString() + ", " + getRight().toString() + ")";
        }
        return super.toString();
    }
}
