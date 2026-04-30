
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Student extends User {

    /**
     * Default constructor
     */
    public Student() {
    }

    /**
     * 
     */
    private studentId: String;

    /**
     * 
     */
    private gpa: double;

    /**
     * 
     */
    private credits: int;

    /**
     * 
     */
    private failCount: int;

    /**
     * 
     */
    private degree: StudentDegree;

    /**
     * 
     */
    private registrations: List~Registration~;

    /**
     * 
     */
    private marks: Map~CourseOffering,;

    /**
     * 
     */
    private organizations: List~StudentOrganization~;









    /**
     * @param CourseOffering 
     * @return
     */
    public void registerForCourse(offering: CourseOffering) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Mark> viewMarks() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getTranscript() {
        // TODO implement here
        return "";
    }

    /**
     * @param Teacher 
     * @param int 
     * @return
     */
    public void rateTeacher(teacher: Teacher, rating: int) {
        // TODO implement here
        return null;
    }

    /**
     * @param CourseOffering 
     * @return
     */
    public Teacher viewCourseTeacher(offering: CourseOffering) {
        // TODO implement here
        return null;
    }

    /**
     * @param StudentOrganization 
     * @return
     */
    public void joinOrganization(org: StudentOrganization) {
        // TODO implement here
        return null;
    }

    /**
     * @param Student 
     * @return
     */
    public int compareTo(other: Student) {
        // TODO implement here
        return 0;
    }

}