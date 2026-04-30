
import java.io.*;
import java.util.*;

/**
 * 
 */
public class News {

    /**
     * Default constructor
     */
    public News() {
    }

    /**
     * 
     */
    private id: String;

    /**
     * 
     */
    private title: String;

    /**
     * 
     */
    private content: String;

    /**
     * 
     */
    private topic: String;

    /**
     * 
     */
    private isPinned: boolean;

    /**
     * 
     */
    private comments: List~String~;

    /**
     * 
     */
    private date: Date;


    /**
     * @param String 
     * @return
     */
    public void addComment(comment: String) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void pin() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void unpin() {
        // TODO implement here
        return null;
    }

    /**
     * @param News 
     * @return
     */
    public int compareTo(other: News) {
        // TODO implement here
        return 0;
    }

    /**
     * @param ResearchPaper 
     * @param Researcher 
     * @return
     */
    public News createPaperAnnouncement(paper: ResearchPaper, researcher: Researcher) {
        // TODO implement here
        return null;
    }

    /**
     * @param Researcher 
     * @return
     */
    public News createTopResearcherAnnouncement(researcher: Researcher) {
        // TODO implement here
        return null;
    }

}