package university.interfaces;

import university.research.ResearchPaper;
import university.research.ResearchProject;
import java.util.Comparator;
import java.util.List;

public interface Researcher {
    List<ResearchPaper> getResearchPapers();
    List<ResearchProject> getResearchProjects();
    int calculateHIndex();
    void printPapers(Comparator<ResearchPaper> comparator);
    void addPaper(ResearchPaper paper);
    void joinProject(ResearchProject project);
}
