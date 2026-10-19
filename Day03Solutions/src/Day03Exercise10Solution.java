void printPiJFor(Day d) {
    switch (d) {
        case MONDAY -> {
            IO.println("Daytime class");
        }
        case WEDNESDAY -> {
            IO.println("Daytime class and evening class");
        }
        case SATURDAY -> {
            IO.println("Online help sessions");
        }
        default -> {
            IO.println("No teaching evening for PiJ");
        }
    }
}

void main() {
    Day day = Day.SATURDAY;
    IO.println("The day is: " + day);
    printPiJFor(day);
}
