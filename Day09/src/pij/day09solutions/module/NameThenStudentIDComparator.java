package pij.day09solutions.module;

import pij.day09.module.Student;

import java.util.Comparator;

/** Exercise 2.2 */
public class NameThenStudentIDComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int nameComparison = o1.getName().compareTo(o2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        return o1.getStudentId().compareTo(o2.getStudentId());
    }
}
