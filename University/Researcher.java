
import java.io.*;
import java.util.*;

/**
 * 
 */
public interface Researcher {



    /**
     * @return
     */
    public List<ResearchPaper> getResearchPapers();

    /**
     * @return
     */
    public List<ResearchProject> getResearchProjects();

    /**
     * @return
     */
    public int calculateHIndex();

    /**
     * @param Comparator~ResearchPaper~ 
     * @return
     */
    public void printPapers(comparator: Comparator~ResearchPaper~);

    /**
     * @param ResearchPaper 
     * @return
     */
    public void addPaper(paper: ResearchPaper);

    /**
     * @param ResearchProject 
     * @return
     */
    public void joinProject(project: ResearchProject);

}