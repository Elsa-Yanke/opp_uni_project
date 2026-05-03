package university.research;

import university.exceptions.NotAResearcherException;
import university.interfaces.Researcher;
import university.users.User;
import java.util.ArrayList;
import java.util.List;

public class ResearchProject {

    private String projectId;
    private String topic;
    private List<Researcher> participants;
    private List<ResearchPaper> publishedPapers;

    public ResearchProject() {
        this.participants = new ArrayList<>();
        this.publishedPapers = new ArrayList<>();
    }

    public ResearchProject(String projectId, String topic) {
        this.projectId = projectId;
        this.topic = topic;
        this.participants = new ArrayList<>();
        this.publishedPapers = new ArrayList<>();
    }

    public void addParticipant(Researcher researcher) {
        participants.add(researcher);
    }

    public void tryAddUser(User user) {
        if (!(user instanceof Researcher)) {
            throw new NotAResearcherException(user.getFullName());
        }
        addParticipant((Researcher) user);
    }

    public void addPaper(ResearchPaper paper) {
        publishedPapers.add(paper);
    }

    public String getProjectId() { return projectId; }
    public String getTopic() { return topic; }
    public List<Researcher> getParticipants() { return participants; }
    public List<ResearchPaper> getPublishedPapers() { return publishedPapers; }
}
