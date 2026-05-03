package university.course;

import university.users.Student;
import university.users.Teacher;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CourseOffering implements Serializable {

    private String offeringId;
    private Course course;
    private Semester semester;
    private Teacher lectureTeacher;
    private Teacher practiceTeacher;
    private List<Student> enrolledStudents;
    private List<Lesson> lessons;
    private GradeBook gradeBook;
    private int maxStudents;
    private String major;
    private int yearOfStudy;

    public CourseOffering() {
        this.enrolledStudents = new ArrayList<>();
        this.lessons = new ArrayList<>();
    }

    public CourseOffering(String offeringId, Course course, Semester semester, int maxStudents, String major, int yearOfStudy) {
        this.offeringId = offeringId;
        this.course = course;
        this.semester = semester;
        this.maxStudents = maxStudents;
        this.major = major;
        this.yearOfStudy = yearOfStudy;
        this.enrolledStudents = new ArrayList<>();
        this.lessons = new ArrayList<>();
        this.gradeBook = new GradeBook(this);
    }

    public void addStudent(Student student) {
        if (!isFull() && !enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        } else {
            System.out.println("Course offering is full.");
        }
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }

    public boolean isFull() {
        return enrolledStudents.size() >= maxStudents;
    }

    public List<Teacher> getTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        if (lectureTeacher != null) teachers.add(lectureTeacher);
        if (practiceTeacher != null && !teachers.contains(practiceTeacher)) {
            teachers.add(practiceTeacher);
        }
        return teachers;
    }

    public String getOfferingId() { 
        return offeringId; 
    }
    public Course getCourse() { 
        return course; 
    }
    public Semester getSemester() { 
        return semester; 
    }
    public Teacher getLectureTeacher() { 
        return lectureTeacher; 
    }
    public void setLectureTeacher(Teacher teacher) { 
        this.lectureTeacher = teacher; 
    }
    public Teacher getPracticeTeacher() { 
        return practiceTeacher; 
    }
    public void setPracticeTeacher(Teacher teacher) { 
        this.practiceTeacher = teacher; 
    }
    public List<Student> getEnrolledStudents() { 
        return enrolledStudents; 
    }
    public List<Lesson> getLessons() { 
        return lessons; 
    }
    public GradeBook getGradeBook() { 
        return gradeBook; 
    }
    public int getMaxStudents() { 
        return maxStudents; 
    }
    public String getMajor() { 
        return major; 
    }
    public int getYearOfStudy() { 
        return yearOfStudy; 
    }
}