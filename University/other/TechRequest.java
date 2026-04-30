package university.other;

import university.enums.RequestStatus;
import university.users.Employee;
import java.util.Date;

public class TechRequest {

    private String id;
    private String description;
    private RequestStatus status;
    private Employee requester;
    private Date createdAt;
    private Date updatedAt;

    public TechRequest() {}

    public TechRequest(Employee requester, String description) {
        this.id = java.util.UUID.randomUUID().toString();
        this.requester = requester;
        this.description = description;
        this.status = RequestStatus.NEW;
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    public void updateStatus(RequestStatus status) {
        this.status = status;
        this.updatedAt = new Date();
        System.out.println("Request '" + description + "' status updated to: " + status);
    }

    // Getters
    public String getId() { return id; }
    public String getDescription() { return description; }
    public RequestStatus getStatus() { return status; }
    public Employee getRequester() { return requester; }
    public Date getCreatedAt() { return createdAt; }
    public Date getUpdatedAt() { return updatedAt; }
}
