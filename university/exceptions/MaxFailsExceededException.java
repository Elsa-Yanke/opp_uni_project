package university.exceptions;

public class MaxFailsExceededException extends RuntimeException {
    private static final int MAX_FAILS = 3;

    public MaxFailsExceededException(String studentName, String courseName) {
        super("Student " + studentName + " has exceeded maximum fails (" + MAX_FAILS + ") for course: " + courseName);
    }

    public static int getMaxFails() {
        return MAX_FAILS;
    }
}
