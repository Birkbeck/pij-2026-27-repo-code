package pij.day16.expressionExtended;

public class IntExpressionDriver {
    static void main() {
        IntExpression intExp1 = new IntConstant(9);
        IntExpression intExp2 = new IntConstant(3);
        IntExpression intExp3 = new IntConstant(15);
        IntExpression intExp4 = new IntConstant(6);
        IntExpression plusExp = new PlusExpression(intExp1, intExp2);
        IntExpression divExp = new DivExpression(intExp3, intExp4);
        IntExpression timesExp = new TimesExpression(plusExp, divExp);
        IO.println(timesExp + " = " + timesExp.value());
        IO.println(timesExp + " has " + timesExp.numberOfNodes() + " nodes");

        FunctionExpression plus = new FunctionExpression(
                new IntConstant(5), new IntConstant(3),
                Integer::sum, "+");
        FunctionExpression times = new FunctionExpression(new IntConstant(5),
                new IntConstant(3),
                (x, y) -> x * y, "*");
        IO.println(plus + " = " + plus.value());
        IO.println(times + " = " + times.value());
    }

}
