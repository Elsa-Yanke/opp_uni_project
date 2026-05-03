package university.users;

import university.enums.StudentDegree;
import university.exceptions.LowHIndexException;
import university.interfaces.Researcher;
import university.research.ResearchPaper;
import university.research.ResearchProject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GraduateStudent extends Student implements Researcher {

    private Researcher supervisor;
    private List<ResearchPaper> papers;
    private List<ResearchProject> projects;
    private List<ResearchPaper> diplomaProjects;

    public GraduateStudent() {
        super();
        this.papers = new ArrayList<>();
        this.projects = new ArrayList<>();
        this.diplomaProjects = new ArrayList<>();
    }

    public GraduateStudent(String id, String login, String password, String name, String surname, String email, String studentId, StudentDegree degree) {
        super(id, login, password, name, surname, email, studentId);
        this.setDegree(degree); // MASTER or PHD
        this.papers = new ArrayList<>();
        this.projects = new ArrayList<>();
        this.diplomaProjects = new ArrayList<>();
    }

    public void setSupervisor(Researcher researcher) {
        if (researcher.calculateHIndex() < 3) {
            throw new LowHIndexException(researcher.calculateHIndex());
        }
        this.supervisor = researcher;
    }

    public void addDiplomaProject(ResearchPaper paper) {
        diplomaProjects.add(paper);
        addPaper(paper); 
    }

    public List<ResearchPaper> getDiplomaProjects() { return diplomaProjects; }
    public Researcher getSupervisor() { return supervisor; }

    @Override
    public List<ResearchPaper> getResearchPapers() { return papers; }

    @Override
    public List<ResearchProject> getResearchProjects() { return projects; }

    @Override
    public int calculateHIndex() {
        // h-index: h papers each cited at least h times
        List<Integer> citations = new ArrayList<>();
        for (ResearchPaper p : papers) {
            citations.add(p.getCitations());
        }
        citations.sort(Comparator.reverseOrder());
        int h = 0;
        for (int i = 0; i < citations.size(); i++) {
            if (citations.get(i) >= i + 1) {
                h = i + 1;
            } else break;
        }
        return h;
    }

    @Override
    public void printPapers(Comparator<ResearchPaper> comparator) {
        papers.stream()
              .sorted(comparator)
              .forEach(System.out::println);
    }

    @Override
    public void addPaper(ResearchPaper paper) {
        papers.add(paper);
    }

    @Override
    public void joinProject(ResearchProject project) {
        project.addParticipant(this);
        projects.add(project);
    }
}
