package university.research;

import university.users.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentResearcher extends ResearcherDecorator {

    private Student wrappee;
    private List<ResearchPaper> diplomaProjects;

    public StudentResearcher(Student wrappee) {
        super(wrappee);
        this.wrappee = wrappee;
        this.diplomaProjects = new ArrayList<>();
    }

    public void addDiplomaProject(ResearchPaper paper) {
        diplomaProjects.add(paper);
        addPaper(paper); // diploma project counts as research paper too
    }

    public List<ResearchPaper> getDiplomaProjects() {
        return diplomaProjects;
    }

    public Student getStudentInfo() {
        return wrappee;
    }
}
