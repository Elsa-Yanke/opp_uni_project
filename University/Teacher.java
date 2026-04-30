
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Teacher extends Employee {

    /**
     * Default constructor
     */
    public Teacher() {
    }

    /**
     * 
     */
    private position: TeacherPosition;

    /**
     * 
     */
    private rating: double;

    /**
     * 
     */
    private offerings: List~CourseOffering~;

    /**
     * 
     */
    private complaints: List~Complaint~;








    /**
     * @return
     */
    public List<CourseOffering> viewCourses() {
        // TODO implement here
        return null;
    }

    /**
     * @param CourseOffering 
     * @return
     */
    public void addCourseOffering(offering: CourseOffering) {
        // TODO implement here
        return null;
    }

    /**
     * @param Student 
     * @param CourseOffering 
     * @param Mark 
     * @return
     */
    public void putMark(student: Student, offering: CourseOffering, mark: Mark) {
        // TODO implement here
        return null;
    }

    /**
     * @param Student 
     * @param ComplaintUrgency 
     * @return
     */
    public void sendComplaint(student: Student, urgency: ComplaintUrgency) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Student> viewStudents() {
        // TODO implement here
        return null;
    }

    /**
     * @param CourseOffering 
     * @return
     */
    public String generateMarkReport(offering: CourseOffering) {
        // TODO implement here
        return "";
    }

    /**
     * @param double 
     * @param int 
     * @return
     */
    public void updateRating(newRating: double, totalRatings: int) {
        // TODO implement here
        return null;
    }

}