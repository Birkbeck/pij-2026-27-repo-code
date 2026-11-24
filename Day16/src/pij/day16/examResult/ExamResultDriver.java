package pij.day16.examResult;

import java.util.List;

import static pij.day16.examResult.ExamResultHelper.makeLargeTestData;
import static pij.day16.examResult.ExamResultHelper.makeTestData;
import static pij.day16.examResult.ExamResultUtils.allClassificationsToResults;
import static pij.day16.examResult.ExamResultUtils.classificationsToResults;
import static pij.day16.examResult.ExamResultUtils.getStudents;
import static pij.day16.examResult.ExamResultUtils.getStudentsOnExam;
import static pij.day16.examResult.ExamResultUtils.getStudentsOnExamAsString;
import static pij.day16.examResult.ExamResultUtils.getStudentsParallel;
import static pij.day16.examResult.ExamResultUtils.groupByExams;

/**
 * Driver class for queries related to exam results.
 */
public class ExamResultDriver {

    /**
     * Runs a query on "large" test data, parameterised by whether
     * sequential or parallel streams should be used. Prints on the
     * screen how many milliseconds the computation took.
     *
     * @param parallel true: use method getStudentsParallel,
     *                 false: use method getStudents
     */
    public static void runLarge(boolean parallel) {
        List<ExamResult> largeTestData = makeLargeTestData();
        long startTime = System.nanoTime();
        // use System.nanoTime() to measure time before and after the
        // method call, then compare
        List<String> results;
        if (parallel) {
            results = getStudentsParallel(largeTestData);
        } else {
            results = getStudents(largeTestData);
        }
        long finishTime = System.nanoTime();
        long totalTime = finishTime - startTime;
        IO.println("Total time (ms): " + totalTime / 1000000);
    }

    /**
     * Tests several methods related to collections of exam results.
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {
        IO.println("getStudents: " + getStudents(makeTestData()));
        IO.println("getStudentsOnExam: "
                + getStudentsOnExam(makeTestData(), "PiJ"));
        IO.println("getStudentsOnExamAsString: "
                + getStudentsOnExamAsString(makeTestData(), "PiJ"));
        IO.println("groupByExams: " + groupByExams(makeTestData()));
        IO.println("classificationToResults: "
                + classificationsToResults(makeTestData(), "PiJ"));
        IO.println("allClassificationsToResults: "
                + allClassificationsToResults(makeTestData(), "PiJ"));

        IO.println("getStudentsParallel: " + getStudentsParallel(makeTestData()));

        final boolean PARALLEL_FOR_LARGE = true;
        runLarge(PARALLEL_FOR_LARGE);
    }
}
