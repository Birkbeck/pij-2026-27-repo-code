void main() {
    double d = 1.0;
    int i = (int) d; // puts 1 into i (not 1.0)
    IO.println(i);
        
    double d2 = 1.8;
    int i2 = (int) d2; // puts 1 into i2 (no rounding by the cast!)
    IO.println(i2);

    int i3 = 1;
    double d3 = i; // puts 1.0 into d3 (not 1)
    IO.println(d3);

    int i4 = 3;
    int j4 = 4;
    IO.println(i4 + "/" + j4 + " is about " + (i4/(double)j4));
}
