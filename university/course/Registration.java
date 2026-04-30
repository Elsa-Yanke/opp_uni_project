package university.course;

import university.enums.RegistrationStatus;
import university.users.Student;
import java.util.Date;

public class Registration {

    private String registrationId;
    private Student student;
    private CourseOffering offering;
    private RegistrationStatus status;
    private Date requestDate;

    public Registration() {}

    public Registration(Student student, CourseOffering offering) {
        this.registrationId = java.util.UUID.randomUUID().toString();
        this.student = student;
        this.offering = offering;
        this.status = RegistrationStatus.PENDING;
        this.requestDate = new Date();
    }

    public void approve() {
        this.status = RegistrationStatus.APPROVED;
        offering.addStudent(student);
        System.out.println("Registration approved for " + student.getFullName()
                + " in " + offering.getCourse().getName());
    }

    public void reject() {
        this.status = RegistrationStatus.REJECTED;
        System.out.println("Registration rejected for " + student.getFullName()
                + " in " + offering.getCourse().getName());
    }

    // Getters
    public String getRegistrationId() { return registrationId; }
    public Student getStudent() { return student; }
    public CourseOffering getOffering() { return offering; }
    public RegistrationStatus getStatus() { return status; }
    public Date getRequestDate() { return requestDate; }
}
