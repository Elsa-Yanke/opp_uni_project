package university.interfaces;

import java.util.Comparator;
import java.util.List;

import university.research.ResearchPaper;
import university.research.ResearchProject;

public interface Researcher {
    List<ResearchPaper> getResearchPapers();
    List<ResearchProject> getResearchProjects();
    int calculateHIndex();
    void printPapers(Comparator<ResearchPaper> comparator);
    void addPaper(ResearchPaper paper);
    void joinProject(ResearchProject project);
}
