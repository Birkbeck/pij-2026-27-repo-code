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

        Employee[] someEmployees = { betsy, barry, celia };
        notesTest(someEmployees); // output from reading material

        exercise3Test(betsy); // output from Exercise 3
    }

    private static void exercise3Test(Employee e) {
        // TODO
    }

    private static void notesTest(Employee[] employees) {
        for (Employee employee : employees) {
            IO.println(employee.getName() + " answers, recursively: "
                    + employee.getCEORecursively());
            IO.println(employee.getName() + " answers, iteratively: "
                    + employee.getCEOIteratively());
        }
    }

}
