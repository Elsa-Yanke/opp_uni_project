package university.users;

import university.course.CourseOffering;
import university.course.Registration;
import university.course.Semester;
import university.enums.ManagerType;
import university.enums.RegistrationStatus;
import university.other.News;
import university.other.TechRequest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Manager extends Employee {

    private ManagerType managerType;

    public Manager() {
        super();
    }

    public Manager(String id, String login, String password,
                   String name, String surname, String email,
                   double salary, String department, ManagerType managerType) {
        super(id, login, password, name, surname, email, salary, department);
        this.managerType = managerType;
    }

    public void assignCourseToTeacher(CourseOffering offering, Teacher teacher) {
        offering.setLectureTeacher(teacher);
        teacher.addCourseOffering(offering);
    }

    public void approveRegistration(Registration registration) {
        registration.approve();
    }

    public void rejectRegistration(Registration registration) {
        registration.reject();
    }

    public void addCourseOffering(CourseOffering offering, Semester semester) {
        semester.addOffering(offering);
    }

    public String createStatisticsReport(List<Student> students) {
        StringBuilder sb = new StringBuilder("=== STATISTICS REPORT ===\n");
        for (Student s : students) {
            sb.append(s.getFullName())
              .append(" | GPA: ").append(String.format("%.2f", s.getGpa()))
              .append(" | Credits: ").append(s.getCredits()).append("\n");
        }
        return sb.toString();
    }

    public void manageNews(News news) {
        System.out.println("Managing news: " + news.getTitle());
    }

    public List<Student> viewStudentsSortedByGPA(List<Student> students) {
        List<Student> sorted = new ArrayList<>(students);
        sorted.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        return sorted;
    }

    public List<Student> viewStudentsSortedAlphabetically(List<Student> students) {
        List<Student> sorted = new ArrayList<>(students);
        sorted.sort(Comparator.comparing(Student::getFullName));
        return sorted;
    }

    public List<TechRequest> viewRequests(List<TechRequest> allRequests) {
        return allRequests;
    }

    public ManagerType getManagerType() { return managerType; }
    public void setManagerType(ManagerType managerType) { this.managerType = managerType; }
}
