package pij.day15.expressionTry2;

public class IntExpressionDriver {
    static void main() {
        IntExpression intExp1 = new IntConstant(9);
        IntExpression intExp2 = new IntConstant(3);
        IntExpression intExp3 = new IntConstant(6);
        IntExpression plusExp = new PlusExpression(intExp1, intExp2);
        IntExpression timesExp = new TimesExpression(plusExp, intExp3);
        IO.println("((9 + 3) * 6) = " + timesExp.value());
        IO.println("((9 + 3) * 6) has " + timesExp.numberOfNodes() + " nodes");
    }
}
