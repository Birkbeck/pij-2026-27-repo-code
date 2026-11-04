package pij.day09solutions.module;

import pij.day09.module.Student;

import java.util.Comparator;

/** Exercise 2.2 */
public class StudentIDThenNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int studentIDDiff = o1.getStudentId().compareTo(o2.getStudentId());
        if (studentIDDiff != 0) {
            return studentIDDiff;
        }
        return o1.getName().compareTo(o2.getName());
    }

}
