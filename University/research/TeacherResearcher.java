package university.research;

import university.users.Teacher;

public class TeacherResearcher extends ResearcherDecorator {

    private Teacher wrappee;

    public TeacherResearcher(Teacher wrappee) {
        super(wrappee);
        this.wrappee = wrappee;
    }

    // Can be supervisor only if h-index >= 3
    public boolean canBeSupervisor() {
        return calculateHIndex() >= 3;
    }

    public Teacher getTeacherInfo() {
        return wrappee;
    }
}
