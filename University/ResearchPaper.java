
import java.io.*;
import java.util.*;

/**
 * 
 */
public class ResearchPaper {

    /**
     * Default constructor
     */
    public ResearchPaper() {
    }

    /**
     * 
     */
    private paperId: String;

    /**
     * 
     */
    private title: String;

    /**
     * 
     */
    private authors: List~String~;

    /**
     * 
     */
    private journal: String;

    /**
     * 
     */
    private pages: int;

    /**
     * 
     */
    private date: Date;

    /**
     * 
     */
    private doi: String;

    /**
     * 
     */
    private citations: int;





    /**
     * @param CitationFormat 
     * @return
     */
    public String getCitation(format: CitationFormat) {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public void addCitation() {
        // TODO implement here
        return null;
    }

    /**
     * @param ResearchPaper 
     * @return
     */
    public int compareTo(other: ResearchPaper) {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public Comparator<ResearchPaper> byDateDesc() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Comparator<ResearchPaper> byCitationsDesc() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Comparator<ResearchPaper> byPagesDesc() {
        // TODO implement here
        return null;
    }

}