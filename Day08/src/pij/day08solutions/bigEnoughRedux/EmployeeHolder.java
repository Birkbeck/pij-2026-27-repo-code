package pij.day08solutions.bigEnoughRedux;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 7.
 * An EmployeeHolder can store an unbounded number of Employee references
 * and can be queried for these references via a zero-based index as well
 * as for the number of stored references.
 */
public class EmployeeHolder {
    // Stores the Employee references that have been added so far.
    private final List<Employee> employees;

    /** Constructs an empty EmployeeHolder. */
    public EmployeeHolder() {
        employees = new ArrayList<>();
    }

    public void add(Employee e) {
        employees.add(e);
    }

    public int size() {
        return employees.size();
    }

    public Employee get(int i) {
        return employees.get(i);
    }
}
