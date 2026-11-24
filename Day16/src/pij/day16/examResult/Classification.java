package pij.day16.examResult;

/**
 * Represents the postgraduate degree classification to which given
 * marks correspond.
 */
public enum Classification {
    FAIL, PASS, MERIT, DISTINCTION;

    /** The minimum mark for a PASS classification. */
    private static final int MIN_PASS_MARK = 50;

    /** The minimum mark for a MERIT classification. */
    private static final int MIN_MERIT_MARK = 60;

    /** The minimum mark for a DISTINCTION classification. */
    private static final int MIN_DISTINCTION_MARK = 70;

    /**
     * Returns the classification corresponding to the given marks.
     *
     * @param examResult the marks that a student has got in a postgraduate exam
     * @return the classification corresponding to the given marks
     */
    public static Classification fromExamResult(ExamResult examResult) {
        int marks = examResult.marks();
        if (marks < MIN_PASS_MARK) {
            return FAIL;
        }
        if (marks < MIN_MERIT_MARK) {
            return PASS;
        }
        if (marks < MIN_DISTINCTION_MARK) {
            return MERIT;
        }
        return DISTINCTION;
    }
}
