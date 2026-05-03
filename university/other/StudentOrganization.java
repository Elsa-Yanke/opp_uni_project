package university.other;

import university.users.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentOrganization {

    private String id;
    private String name;
    private Student head;
    private List<Student> members;

    public StudentOrganization() {
        this.members = new ArrayList<>();
    }
    public StudentOrganization(String id, String name, Student head) {
        this.id = id;
        this.name = name;
        this.head = head;
        this.members = new ArrayList<>();
        members.add(head);
    }

    public void addMember(Student student) {
        if (!members.contains(student)) {
            members.add(student);
        }
    }

    public void removeMember(Student student) {
        if (!student.equals(head)) { 
            members.remove(student);
        }
    }

    public List<Student> getMembers() { return members; }
    public String getId() { return id; }
    public String getName() { return name; }
    public Student getHead() { return head; }
}
