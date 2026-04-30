package university.course;

import university.enums.ComplaintUrgency;
import university.users.Student;
import university.users.Teacher;
import java.util.Date;

public class Complaint {

    private Teacher sender;
    private Student target;
    private String description;
    private ComplaintUrgency urgency;
    private Date date;

    public Complaint() {}

    public Complaint(Teacher sender, Student target, ComplaintUrgency urgency) {
        this.sender = sender;
        this.target = target;
        this.urgency = urgency;
        this.date = new Date();
    }

    public Complaint(Teacher sender, Student target,
                     String description, ComplaintUrgency urgency) {
        this.sender = sender;
        this.target = target;
        this.description = description;
        this.urgency = urgency;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Complaint{from=" + sender.getFullName()
                + ", against=" + target.getFullName()
                + ", urgency=" + urgency + "}";
    }

    // Getters
    public Teacher getSender() { return sender; }
    public Student getTarget() { return target; }
    public String getDescription() { return description; }
    public ComplaintUrgency getUrgency() { return urgency; }
    public Date getDate() { return date; }
}
