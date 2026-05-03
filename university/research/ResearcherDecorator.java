package university.research;

import university.interfaces.Researcher;
import university.users.User;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class ResearcherDecorator implements Researcher {

    protected User wrappee;
    protected List<ResearchPaper> papers;
    protected List<ResearchProject> projects;

    public ResearcherDecorator(User wrappee) {
        this.wrappee = wrappee;
        this.papers = new ArrayList<>();
        this.projects = new ArrayList<>();
    }

    @Override
    public List<ResearchPaper> getResearchPapers() {
        return papers;
    }

    @Override
    public List<ResearchProject> getResearchProjects() {
        return projects;
    }

    @Override
    public int calculateHIndex() {
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

    public User getWrappee() { return wrappee; }

    public String getFullName() { return wrappee.getFullName(); }
}
