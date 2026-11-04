package pij.day09solutions.module;

import pij.day09.module.Student;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Exercise 2.
 * A Module has a name and keeps track of enrolled students and their
 * attendance.
 */
public class Module {
    private final String moduleName;

    /**
     * Just count number of attendances rather than tracking specific dates
     * (to keep things simple for the example).
     */
    private final Map<Student, Integer> attendanceCounter;

    /**
     * Constructs a module with a specific name.
     *
     * @param moduleName the module name
     */
    public Module(String moduleName) {
        this(moduleName, null);
    }

    /**
     * Constructs a module with a specific name and a comparator to use
     * for ordering Student objects.
     *
     * @param moduleName the module name
     */
    public Module(String moduleName, Comparator<Student> cmp) {
        this.moduleName = moduleName;
        // Ex 2.3: Downside of providing the Comparator<Student> in the
        // constructor only: what if, for the same module, we want to be
        // able to print the list in several different orders?
        // Better: (also) provide a method
        //    public String toString(Comparator<Student> cmp)
        // that builds a TreeMap<Student, Integer> on the fly; use only
        // the (faster) LinkedHashMap<Student, Integer> in the constructor.
        // See below for a possible implementation of the method
        if (cmp == null) {
            this.attendanceCounter = new LinkedHashMap<>();
        } else {
            this.attendanceCounter = new TreeMap<>(cmp);
        }
    }

    /**
     * Enrols a Student on this Module. From that point on, their class
     * attendances will be counted. If the Student is already enrolled on
     * this Module, the method call has no effect.
     *
     * @param student Student to enrol on this Module
     */
    public void enrol(Student student) {
        if (attendanceCounter.containsKey(student)) {
            return; // student already enrolled, do not reset attendance count
        }
        attendanceCounter.put(student, 0);
    }

    /**
     * Increments the attendance count for the given Student, provided
     * that they are enrolled for this Module. Has no effect otherwise.
     *
     * @param student the Student whose attendance count should be incremented
     */
    public void attendClass(Student student) {
        // note: Integer rather than int, because the result may be null
        Integer numberOfAttendances = attendanceCounter.get(student);
        if (numberOfAttendances == null) {
            return; // student not enrolled
        }
        attendanceCounter.put(student, numberOfAttendances + 1);
    }

    @Override
    public String toString() {
        return toStringHelper(attendanceCounter);
    }

    /**
     * Introduced as a more flexible alternative for Exercise 2.3.
     *
     * @param cmp the comparator to use
     * @return a String representation of this Module with students
     *  ordered according to the order given by {@code cmp}
     */
    public String toString(Comparator<Student> cmp) {
        return toStringHelper(new TreeMap<>(cmp));
    }

    /**
     * Helper method for toString() and for toString(Comparator<Student>)
     * introduced in Exercise 2.3, in the spirit of DRY.
     *
     * @param attendanceCounter to be used for String generation
     * @return a String representation of this Module with the students
     *  in the iteration order of the {@code attendanceCounter} parameter
     */
    private String toStringHelper(Map<Student, Integer> attendanceCounter) {
        // class StringBuilder allows for efficient String construction
        StringBuilder sb = new StringBuilder();
        sb.append(moduleName).append("\n")
                .append("=".repeat(moduleName.length()))
                .append("\n");
        for (Map.Entry<Student, Integer> entry : attendanceCounter.entrySet()) {
            sb.append(entry.getKey()).append(" : ")
                    .append(entry.getValue())
                    .append(" attendances\n");
        }
        return sb.toString();
    }
}
