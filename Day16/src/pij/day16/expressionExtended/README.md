# Expression Extended

Now that you have seen lambda expressions, let us revisit the expression example. In the previous example we had to create a 
new class for each new operator we wanted to add. Now using lambda expressions we can create a single class for all binary
binary expressions. We extend the `BinaryExpression` and create a `FunctionExpression` class that takes a `BinaryOperator`
as a parameter. This way we can create any binary expression we want without having to create a new class for each operator.

There are several ways we can implement this.

Using existing method references:

```java
FunctionExpression plus1 = new FunctionExpression(new IntConstant(5), new IntConstant(3), Integer::sum, "+");
FunctionExpression times = new FunctionExpression(new IntConstant(5), new IntConstant(3), Integer::multiply, "*");
```

Creating our own method references is also possible. For examples `IntegerUtils` has the method `addFunction`.

```java
import pij.day16.expressionExtended.IntConstant;

// method reference
FunctionExpression plus2 = new FunctionExpression(new IntConstant(5), new IntConstant(3), IntegerUtils::addFunction, "+");
// method call via lambda expression
FunctionExpression plus3 = new FunctionExpression(new IntConstant(5), new IntConstant(3), (x, y) -> IntegerUtils.addFunction(x, y), "+");
```

We can also create our own `BinaryOperator` using a lambda expression:

```java
FunctionExpression plus4 = new FunctionExpression(new IntConstant(5), new IntConstant(3), (a, b) -> a + b, "+");
```
