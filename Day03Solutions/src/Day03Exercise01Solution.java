void main() {

    // The below code provides a check whether a person becomes an
    // adult in the year 2026, assuming that the threshold to
    // adulthood is to reach 18 years of age. The code uses a
    // conditional expression with ? : to compose the user-facing
    // answer as a String, with the result depending on whether the
    // person passes the check or not.

    final int MIN_ADULT_YEARS = 18;
    int currentYear = 2026;
    int birthYear = Integer.parseInt(IO.readln("When were you born (year)? "));
    int ageApprox = currentYear - birthYear;
    String result = (ageApprox >= MIN_ADULT_YEARS) ? "" : "not ";
    IO.println("It seems you are " + result + "an adult.");
}
