
import java.io.*;
import java.util.*;

/**
 * 
 */
public interface Subscribable {


    /**
     * @param ResearchJournal 
     * @return
     */
    public void subscribe(journal: ResearchJournal);

    /**
     * @param ResearchJournal 
     * @return
     */
    public void unsubscribe(journal: ResearchJournal);

    /**
     * @param ResearchPaper 
     * @return
     */
    public void onNewPaperPublished(paper: ResearchPaper);

}