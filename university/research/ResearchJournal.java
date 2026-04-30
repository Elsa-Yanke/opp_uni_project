package university.research;

import university.interfaces.Subscribable;
import java.util.ArrayList;
import java.util.List;

// Observer pattern: ResearchJournal is the Subject
// Subscribers (Subscribable) are the Observers
public class ResearchJournal {

    private String journalId;
    private String name;
    private String issn;
    private List<ResearchPaper> papers;
    private List<Subscribable> subscribers;

    public ResearchJournal() {
        this.papers = new ArrayList<>();
        this.subscribers = new ArrayList<>();
    }

    public ResearchJournal(String journalId, String name, String issn) {
        this.journalId = journalId;
        this.name = name;
        this.issn = issn;
        this.papers = new ArrayList<>();
        this.subscribers = new ArrayList<>();
    }

    // Publishes paper and notifies all subscribers — Observer pattern trigger
    public void publishPaper(ResearchPaper paper) {
        papers.add(paper);
        notifySubscribers(paper);
    }

    public void subscribe(Subscribable subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
        }
    }

    public void unsubscribe(Subscribable subscriber) {
        subscribers.remove(subscriber);
    }

    // Notifies all subscribers — Observer pattern notify
    public void notifySubscribers(ResearchPaper paper) {
        for (Subscribable subscriber : subscribers) {
            subscriber.onNewPaperPublished(paper);
        }
    }

    // Getters
    public String getJournalId() { return journalId; }
    public String getName() { return name; }
    public String getIssn() { return issn; }
    public List<ResearchPaper> getPapers() { return papers; }
    public List<Subscribable> getSubscribers() { return subscribers; }
}
