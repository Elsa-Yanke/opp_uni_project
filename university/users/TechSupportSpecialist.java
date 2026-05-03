package university.users;

import university.enums.RequestStatus;
import university.other.TechRequest;
import java.util.ArrayList;
import java.util.List;

public class TechSupportSpecialist extends Employee {

    private List<TechRequest> assignedRequests;

    public TechSupportSpecialist() {
        super();
        this.assignedRequests = new ArrayList<>();
    }

    public TechSupportSpecialist(String id, String login, String password, String name, String surname, String email, double salary, String department) {
        super(id, login, password, name, surname, email, salary, department);
        this.assignedRequests = new ArrayList<>();
    }

    public List<TechRequest> viewRequests(List<TechRequest> allRequests) {
        for (TechRequest request : allRequests) {
            if (request.getStatus() == RequestStatus.NEW) {
                request.updateStatus(RequestStatus.VIEWED);
                assignedRequests.add(request);
            }
        }
        return assignedRequests;
    }

    public void acceptRequest(TechRequest request) {
        request.updateStatus(RequestStatus.ACCEPTED);
    }

    public void rejectRequest(TechRequest request) {
        request.updateStatus(RequestStatus.REJECTED);
    }

    public void markDone(TechRequest request) {
        request.updateStatus(RequestStatus.DONE);
    }

    public List<TechRequest> getAssignedRequests() { return assignedRequests; }
}
