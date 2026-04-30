
import java.io.*;
import java.util.*;

/**
 * 
 */
public class GraduateStudent extends Student implements Researcher {

    /**
     * Default constructor
     */
    public GraduateStudent() {
    }

    /**
     * 
     */
    private supervisor: Researcher;

    /**
     * 
     */
    private diplomaProjects: List~ResearchPaper~;



    /**
     * @param Researcher 
     * @return
     */
    public void setSupervisor(researcher: Researcher) {
        // TODO implement here
        return null;
    }

    /**
     * @param ResearchPaper 
     * @return
     */
    public void addDiplomaProject(paper: ResearchPaper) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<ResearchPaper> getDiplomaProjects() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Researcher getSupervisor() {
        // TODO implement here
        return null;
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