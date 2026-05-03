package university.course;

import university.users.Student;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class GradeBook implements Serializable {

    private CourseOffering offering;
    private Map<Student, Mark> marks;

    public GradeBook(CourseOffering offering) {
        this.offering = offering;
        this.marks = new HashMap<>();
    }

    public void addMark(Student student, Mark mark) {
        if (!offering.getEnrolledStudents().contains(student)) {
            System.out.println("[GradeBook] Error: " + student.getFullName() + " is not enrolled in this course.");
            return;
        }
        marks.put(student, mark);
        student.receiveMark(offering, mark);
    }

    public Mark getMark(Student student) {
        return marks.get(student);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Grade Report: ").append(offering.getCourse().getName()).append(" ===\n");
        for (Map.Entry<Student, Mark> entry : marks.entrySet()) {
            sb.append("  ").append(entry.getKey().getFullName())
              .append(": ").append(entry.getValue().getLetterGrade())
              .append(" (").append(entry.getValue().total()).append(")\n");
        }
        return sb.toString();
    }

    public Map<Student, Mark> getMarks() {
        return marks;
    }
}
