
import java.io.*;
import java.util.*;

/**
 * 
 */
public class ResearcherDecorator implements Researcher {

    /**
     * Default constructor
     */
    public ResearcherDecorator() {
    }

    /**
     * 
     */
    private wrappee: User;

    /**
     * 
     */
    private papers: List~ResearchPaper~;

    /**
     * 
     */
    private projects: List~ResearchProject~;

    /**
     * 
     */
    public void Attribute1;




    /**
     * @param User
     */
    public ResearcherDecorator(wrappee: User) {
        // TODO implement here
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

    /**
     * @return
     */
    public int calculateHIndex() {
        // TODO implement here
        return 0;
    }

    /**
     * @param Comparator~ResearchPaper~ 
     * @return
     */
    public void printPapers(comparator: Comparator~ResearchPaper~) {
        // TODO implement here
        return null;
    }

    /**
     * @param ResearchPaper 
     * @return
     */
    public void addPaper(paper: ResearchPaper) {
        // TODO implement here
        return null;
    }

    /**
     * @param ResearchProject 
     * @return
     */
    public void joinProject(project: ResearchProject) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public User getWrappee() {
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
     * @return
     */
    public List<ResearchPaper> getResearchPapers() {
        // TODO implement Researcher.getResearchPapers() here
        return null;
    }

    /**
     * @return
     */
    public List<ResearchProject> getResearchProjects() {
        // TODO implement Researcher.getResearchProjects() here
        return null;
    }

    /**
     * @return
     */
    public int calculateHIndex() {
        // TODO implement Researcher.calculateHIndex() here
        return 0;
    }

    /**
     * @param Comparator~ResearchPaper~ 
     * @return
     */
    public void printPapers(comparator: Comparator~ResearchPaper~) {
        // TODO implement Researcher.printPapers() here
        return null;
    }

    /**
     * @param ResearchPaper 
     * @return
     */
    public void addPaper(paper: ResearchPaper) {
        // TODO implement Researcher.addPaper() here
        return null;
    }

    /**
     * @param ResearchProject 
     * @return
     */
    public void joinProject(project: ResearchProject) {
        // TODO implement Researcher.joinProject() here
        return null;
    }

}