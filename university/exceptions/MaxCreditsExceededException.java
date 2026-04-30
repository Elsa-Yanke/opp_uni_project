package university.exceptions;

public class MaxCreditsExceededException extends RuntimeException {
    private static final int MAX_CREDITS = 21;
    private int currentCredits;
    private int attemptedToAdd;

    public MaxCreditsExceededException(int currentCredits, int attemptedToAdd) {
        super("Cannot add " + attemptedToAdd + " credits. Current: "
                + currentCredits + ", max allowed: " + MAX_CREDITS);
        this.currentCredits = currentCredits;
        this.attemptedToAdd = attemptedToAdd;
    }

    public int getCurrentCredits() {
        return currentCredits;
    }

    public int getAttemptedToAdd() {
        return attemptedToAdd;
    }

    public static int getMaxCredits() {
        return MAX_CREDITS;
    }
}
