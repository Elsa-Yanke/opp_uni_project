package university.other;

import university.users.Employee;
import java.util.Date;

public class Message {

    private String id;
    private Employee sender;
    private Employee receiver;
    private String content;
    private Date timestamp;
    private boolean isRead;

    public Message() {}

    public Message(Employee sender, Employee receiver, String content) {
        this.id = java.util.UUID.randomUUID().toString();
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.timestamp = new Date();
        this.isRead = false;
    }

    public void markAsRead() {
        this.isRead = true;
    }

    public String getId() { return id; }
    public Employee getSender() { return sender; }
    public Employee getReceiver() { return receiver; }
    public String getContent() { return content; }
    public Date getTimestamp() { return timestamp; }
    public boolean isRead() { return isRead; }
}
