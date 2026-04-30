package university.users;

import university.course.Complaint;
import university.course.CourseOffering;
import university.course.Mark;
import university.enums.ComplaintUrgency;
import university.enums.TeacherPosition;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Employee {

    private TeacherPosition position;
    private double rating;
    private List<CourseOffering> offerings;
    private List<Complaint> complaints;

    public Teacher() {
        super();
        this.offerings = new ArrayList<>();
        this.complaints = new ArrayList<>();
    }

    public Teacher(String id, String login, String password,
                   String name, String surname, String email,
                   double salary, String department, TeacherPosition position) {
        super(id, login, password, name, surname, email, salary, department);
        this.position = position;
        this.rating = 0.0;
        this.offerings = new ArrayList<>();
        this.complaints = new ArrayList<>();
    }

    public List<CourseOffering> viewCourses() {
        return offerings;
    }

    public void addCourseOffering(CourseOffering offering) {
        offerings.add(offering);
    }

    public void putMark(Student student, CourseOffering offering, Mark mark) {
        // TODO: validate that student is enrolled in this offering
        offering.addMark(student, mark);
    }

    public void sendComplaint(Student student, ComplaintUrgency urgency) {
        Complaint complaint = new Complaint(this, student, urgency);
        complaints.add(complaint);
        System.out.println("Complaint sent against " + student.getFullName()
                + " with urgency: " + urgency);
    }

    public List<Student> viewStudents() {
        List<Student> allStudents = new ArrayList<>();
        for (CourseOffering offering : offerings) {
            allStudents.addAll(offering.getEnrolledStudents());
        }
        return allStudents;
    }

    public String generateMarkReport(CourseOffering offering) {
        StringBuilder sb = new StringBuilder();
        sb.append("Mark Report for: ").append(offering.getCourse().getName()).append("\n");
        for (Student student : offering.getEnrolledStudents()) {
            Mark mark = offering.getMark(student);
            if (mark != null) {
                sb.append(student.getFullName()).append(": ")
                  .append(mark.total()).append(" (").append(mark.getLetterGrade()).append(")\n");
            }
        }
        return sb.toString();
    }

    public void updateRating(double newRating, int totalRatings) {
        this.rating = ((this.rating * (totalRatings - 1)) + newRating) / totalRatings;
    }

    // Getters and Setters
    public TeacherPosition getPosition() { return position; }
    public void setPosition(TeacherPosition position) { this.position = position; }

    public double getRating() { return rating; }
    public List<Complaint> getComplaints() { return complaints; }
    public List<CourseOffering> getOfferings() { return offerings; }
}
