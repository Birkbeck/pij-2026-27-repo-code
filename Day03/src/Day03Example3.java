int add(int op1, int op2) {
    int result = op1 + op2;
    return result;
}

void doSomething() {
    int a = 5;
    int sum = add(a, 10);
    IO.println(sum);
}

void main() {
    doSomething();
}
