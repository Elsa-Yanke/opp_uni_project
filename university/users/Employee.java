package university.users;

import university.other.Message;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee extends User {

    private double salary;
    private String department;
    private List<Message> inbox;

    public Employee() {
        super();
        this.inbox = new ArrayList<>();
    }

    public Employee(String id, String login, String password, String name, String surname, String email, double salary, String department) {
        super(id, login, password, name, surname, email);
        this.salary = salary;
        this.department = department;
        this.inbox = new ArrayList<>();
    }

    public Message sendMessage(Employee to, String content) {
        Message message = new Message(this, to, content);
        to.receiveMessage(message);
        return message;
    }

    public void receiveMessage(Message message) {
        inbox.add(message);
    }

    public List<Message> receiveMessages() {
        return inbox;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public List<Message> getInbox() { return inbox; }
}
