
import java.io.*;
import java.util.*;

/**
 * 
 */
public class ResearchJournal {

    /**
     * Default constructor
     */
    public ResearchJournal() {
    }

    /**
     * 
     */
    private journalId: String;

    /**
     * 
     */
    private name: String;

    /**
     * 
     */
    private issn: String;

    /**
     * 
     */
    private papers: List~ResearchPaper~;

    /**
     * 
     */
    private subscribers: List~Subscribable~;



    /**
     * @param ResearchPaper 
     * @return
     */
    public void publishPaper(paper: ResearchPaper) {
        // TODO implement here
        return null;
    }

    /**
     * @param Subscribable 
     * @return
     */
    public void subscribe(subscriber: Subscribable) {
        // TODO implement here
        return null;
    }

    /**
     * @param Subscribable 
     * @return
     */
    public void unsubscribe(subscriber: Subscribable) {
        // TODO implement here
        return null;
    }

    /**
     * @param ResearchPaper 
     * @return
     */
    public void notifySubscribers(paper: ResearchPaper) {
        // TODO implement here
        return null;
    }

}