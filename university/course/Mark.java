package university.course;

import university.users.Student;

public class Mark implements Comparable<Mark> {

    private Student student;
    private CourseOffering offering;
    private double firstAttestation;
    private double secondAttestation;
    private double finalExam;

    public Mark() {}

    public Mark(Student student, CourseOffering offering,
                double firstAttestation, double secondAttestation, double finalExam) {
        this.student = student;
        this.offering = offering;
        this.firstAttestation = firstAttestation;
        this.secondAttestation = secondAttestation;
        this.finalExam = finalExam;
    }

    public double total() {
        return firstAttestation + secondAttestation + finalExam;
    }

    public String getLetterGrade() {
        double t = total();
        if (t >= 90) return "A";
        else if (t >= 80) return "B";
        else if (t >= 70) return "C";
        else if (t >= 60) return "D";
        else return "F";
    }

    public boolean isPassed() {
        return total() >= 50;
    }

    @Override
    public int compareTo(Mark other) {
        return Double.compare(this.total(), other.total());
    }

    @Override
    public String toString() {
        return "Mark{first=" + firstAttestation
                + ", second=" + secondAttestation
                + ", final=" + finalExam
                + ", total=" + total()
                + ", grade=" + getLetterGrade() + "}";
    }

    // Getters and Setters
    public Student getStudent() { return student; }
    public CourseOffering getOffering() { return offering; }
    public double getFirstAttestation() { return firstAttestation; }
    public void setFirstAttestation(double v) { this.firstAttestation = v; }
    public double getSecondAttestation() { return secondAttestation; }
    public void setSecondAttestation(double v) { this.secondAttestation = v; }
    public double getFinalExam() { return finalExam; }
    public void setFinalExam(double v) { this.finalExam = v; }
}
