package pij.day14.employee;

/**
 * Driver class for class Employee.
 */
public class EmployeeDriver {
    static void main() {
        Employee erica = new Employee("Erica"); // Erica is the CEO
        Employee derek = new Employee("Derek", erica);
        Employee celia = new Employee("Celia", derek);
        Employee colin = new Employee("Colin", derek);
        Employee barry = new Employee("Barry", celia); // Barry and Betsy both have
        Employee betsy = new Employee("Betsy", celia); // Celia as their line manager

        IO.println("Betsy answers, recursively: " + betsy.getCEORecursively());
        IO.println("Betsy answers, iteratively: " + betsy.getCEOIteratively());

        IO.println("Barry answers, recursively: " + barry.getCEORecursively());
        IO.println("Barry answers, iteratively: " + barry.getCEOIteratively());

        IO.println("Celia answers, recursively: " + celia.getCEORecursively());
        IO.println("Celia answers, iteratively: " + celia.getCEOIteratively());
    }
}
