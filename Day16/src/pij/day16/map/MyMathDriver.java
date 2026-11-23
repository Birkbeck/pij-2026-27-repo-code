package pij.day16.map;

public class MyMathDriver {
    static void main() {
        int[] myData = { 5, 6, 7, 8 };
        int[] myFactorials1 = ArrayMapper.map(n -> MyMath.factorial(n), myData);
        int[] myFactorials2 = ArrayMapper.map(MyMath::factorial, myData);

        IO.println(java.util.Arrays.toString(myData));
        IO.println(java.util.Arrays.toString(myFactorials1));
        IO.println(java.util.Arrays.toString(myFactorials2));

    }
}
