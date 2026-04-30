
import java.io.*;
import java.util.*;

/**
 * 
 */
public class MaxCreditsExceededException extends RuntimeException {

    /**
     * Default constructor
     */
    public MaxCreditsExceededException() {
    }

    /**
     * 
     */
    private currentCredits: int;

    /**
     * 
     */
    private attemptedToAdd: int;

    /**
     * 
     */
    private MAX_CREDITS: int;

    /**
     * @param int 
     * @param int
     */
    public MaxCreditsExceededException(current: int, add: int) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getCurrentCredits() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getAttemptedToAdd() {
        // TODO implement here
        return 0;
    }

}