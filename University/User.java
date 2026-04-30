
import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class User implements Subscribable {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    private id: String;

    /**
     * 
     */
    private login: String;

    /**
     * 
     */
    private password: String;

    /**
     * 
     */
    private name: String;

    /**
     * 
     */
    private surname: String;

    /**
     * 
     */
    private email: String;

    /**
     * 
     */
    private language: Language;

    /**
     * 
     */
    private subscribedJournals: List~ResearchJournal~;




    /**
     * @param String 
     * @param String 
     * @return
     */
    public boolean authenticate(login: String, password: String) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public void logout() {
        // TODO implement here
        return null;
    }

    /**
     * @param ResearchJournal 
     * @return
     */
    public void subscribe(journal: ResearchJournal) {
        // TODO implement here
        return null;
    }

    /**
     * @param ResearchJournal 
     * @return
     */
    public void unsubscribe(journal: ResearchJournal) {
        // TODO implement here
        return null;
    }

    /**
     * @param ResearchPaper 
     * @return
     */
    public void onNewPaperPublished(paper: ResearchPaper) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getFullName() {
        // TODO implement here
        return "";
    }

    /**
     * @param Object 
     * @return
     */
    public boolean equals(o: Object) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public int hashCode() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

    /**
     * @param ResearchJournal 
     * @return
     */
    public void subscribe(journal: ResearchJournal) {
        // TODO implement Subscribable.subscribe() here
        return null;
    }

    /**
     * @param ResearchJournal 
     * @return
     */
    public void unsubscribe(journal: ResearchJournal) {
        // TODO implement Subscribable.unsubscribe() here
        return null;
    }

    /**
     * @param ResearchPaper 
     * @return
     */
    public void onNewPaperPublished(paper: ResearchPaper) {
        // TODO implement Subscribable.onNewPaperPublished() here
        return null;
    }

}