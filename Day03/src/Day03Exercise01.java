void main() {
    final int MIN_ADULT_YEARS = 18;
    int currentYear = 2026;
    int birthYear = Integer.parseInt(IO.readln("When were you born (year)? "));
    int ageApprox = currentYear - birthYear;
    String result = (ageApprox >= MIN_ADULT_YEARS) ? "" : "not ";
    IO.println("It seems you are " + result + "an adult.");
}
