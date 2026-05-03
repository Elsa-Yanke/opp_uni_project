package university.users;

import university.course.CourseOffering;
import university.course.Mark;
import university.course.Registration;
import university.enums.RegistrationStatus;
import university.enums.StudentDegree;
import university.exceptions.MaxCreditsExceededException;
import university.exceptions.MaxFailsExceededException;
import university.other.StudentOrganization;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends User implements Comparable<Student> {

    private String studentId;
    private double gpa;
    private int credits;
    private int failCount;
    private StudentDegree degree;
    private List<Registration> registrations;
    private Map<CourseOffering, Mark> marks;
    private List<StudentOrganization> organizations;

    public Student() {
        super();
        this.registrations = new ArrayList<>();
        this.marks = new HashMap<>();
        this.organizations = new ArrayList<>();
        this.degree = StudentDegree.BACHELOR;
    }

    public Student(String id, String login, String password, String name, String surname, String email, String studentId) {
        super(id, login, password, name, surname, email);
        this.studentId = studentId;
        this.gpa = 0.0;
        this.credits = 0;
        this.failCount = 0;
        this.degree = StudentDegree.BACHELOR;
        this.registrations = new ArrayList<>();
        this.marks = new HashMap<>();
        this.organizations = new ArrayList<>();
    }

    public void registerForCourse(CourseOffering offering) {
        if (this.credits + offering.getCourse().getCredits() > 21) {
            throw new MaxCreditsExceededException(this.credits,
                    offering.getCourse().getCredits());
        }
        if (this.failCount >= 3) {
            throw new MaxFailsExceededException(getFullName(),
                    offering.getCourse().getName());
        }
        Registration registration = new Registration(this, offering);
        registrations.add(registration);
    }

    public void addMark(CourseOffering offering, Mark mark) {
        marks.put(offering, mark);
        if (!mark.isPassed()) {
            failCount++;
        } else {
            credits += offering.getCourse().getCredits();
        }
        recalculateGpa();
    }

    public void receiveMark(CourseOffering offering, Mark mark) {
        marks.put(offering, mark);
        if (!mark.isPassed()) {
            failCount++;
        } else {
            credits += offering.getCourse().getCredits();
        }
        recalculateGpa();
    }

    private void recalculateGpa() {
        if (marks.isEmpty()) return;
        double sum = 0;
        for (Mark m : marks.values()) {
            sum += m.total();
        }
        this.gpa = sum / marks.size();
    }

    public String getTranscript() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== TRANSCRIPT: ").append(getFullName()).append(" ===\n");
        sb.append("GPA: ").append(String.format("%.2f", gpa)).append("\n");
        sb.append("Total Credits: ").append(credits).append("\n\n");
        for (Map.Entry<CourseOffering, Mark> entry : marks.entrySet()) {
            sb.append(entry.getKey().getCourse().getName())
              .append(" - ").append(entry.getValue().getLetterGrade())
              .append(" (").append(entry.getValue().total()).append(")\n");
        }
        return sb.toString();
    }

    public void rateTeacher(Teacher teacher, int rating) {
        teacher.updateRating(rating, teacher.getOfferings().size() + 1);
    }

    public Teacher viewCourseTeacher(CourseOffering offering) {
        return offering.getLectureTeacher();
    }

    public void joinOrganization(StudentOrganization org) {
        org.addMember(this);
        organizations.add(org);
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.gpa, this.gpa); // descending by GPA
    }

    public String getStudentId() { return studentId; }
    public double getGpa() { return gpa; }
    public int getCredits() { return credits; }
    public int getFailCount() { return failCount; }
    public StudentDegree getDegree() { return degree; }
    public void setDegree(StudentDegree degree) { this.degree = degree; }
    public List<Registration> getRegistrations() { return registrations; }
    public Map<CourseOffering, Mark> getMarks() { return marks; }
    public List<StudentOrganization> getOrganizations() { return organizations; }
}
