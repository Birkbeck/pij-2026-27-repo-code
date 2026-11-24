package pij.day16.examResult;

import java.util.Objects;

/**
 * Represents the marks a student was awarded in an exam.
 *
 * @param studentName The name of the student who took the exam. Never null.
 * @param examName    The name of the module to which the exam belongs. Never null.
 * @param marks       The number of marks obtained by the student in the exam.
 *                    At least MIN_EXAM_MARK, at most MAX_EXAM_MARK.
 */
public record ExamResult(String studentName, String examName, int marks) {

    /** The minimum mark that can be obtained in an exam. */
    public static final int MIN_EXAM_MARK = 0;

    /** The maximum mark that can be obtained in an exam. */
    public static final int MAX_EXAM_MARK = 100;

    /**
     * Initialises a new ExamResult according to the parameter values.
     *
     * @param studentName the name of the student who took the exam
     * @param examName    the name of the module to which the exam belongs
     * @param marks       the marks obtained in the exam by the student
     * @throws NullPointerException     if studentName or examName is null
     * @throws IllegalArgumentException if marks is not at least MIN_EXAM_MARK
     *                                  and at most MAX_EXAM_MARK
     */
    public ExamResult(String studentName, String examName, int marks) {
        this.studentName = Objects.requireNonNull(studentName);
        this.examName = Objects.requireNonNull(examName);
        if (marks < MIN_EXAM_MARK || marks > MAX_EXAM_MARK) {
            throw new IllegalArgumentException("marks: Illegal value " + marks
                    + "! Allowed values are at least " + MIN_EXAM_MARK
                    + " and at most " + MAX_EXAM_MARK + ".");
        }
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "(" + this.studentName + "," + this.examName + "," + this.marks + ")";
    }
}
