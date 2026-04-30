
import java.io.*;
import java.util.*;

/**
 * 
 */
public class TeacherResearcher extends ResearcherDecorator {

    /**
     * Default constructor
     */
    public TeacherResearcher() {
    }

    /**
     * 
     */
    private Teacher wrappee;

    /**
     * @return
     */
    public boolean canBeSupervisor() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public Teacher getTeacherInfo() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<ResearchPaper> getResearchPapers() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<ResearchProject> getResearchProjects() {
        // TODO implement here
        return null;
    }

}