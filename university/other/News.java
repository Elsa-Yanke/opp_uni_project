package university.other;

import university.interfaces.Researcher;
import university.research.ResearchPaper;
import university.users.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class News implements Comparable<News> {

    private String id;
    private String title;
    private String content;
    private String topic;
    private boolean isPinned;
    private List<String> comments;
    private User author;
    private Date date;

    public News() {
        this.comments = new ArrayList<>();
        this.date = new Date();
    }

    public News(String id, String title, String content, String topic, User author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.topic = topic;
        this.isPinned = topic.equalsIgnoreCase("Research");
        this.author = author;
        this.date = new Date();
        this.comments = new ArrayList<>();
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public void pin() { this.isPinned = true; }
    public void unpin() { this.isPinned = false; }

    @Override
    public int compareTo(News other) {
        if (this.isPinned && !other.isPinned) return -1;
        if (!this.isPinned && other.isPinned) return 1;
        return other.date.compareTo(this.date);
    }

    public static News createPaperAnnouncement(ResearchPaper paper, Researcher researcher) {
        return new News(
            java.util.UUID.randomUUID().toString(),
            "New paper published: " + paper.getTitle(),
            "A new research paper has been published by " + paper.getAuthors(),
            "Research",
            null
        );
    }

    public static News createTopResearcherAnnouncement(Researcher researcher) {
        return new News(
            java.util.UUID.randomUUID().toString(),
            "Top Researcher of the Year",
            "Congratulations to our top cited researcher!",
            "Research",
            null
        );
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String getTopic() { return topic; }
    public boolean isPinned() { return isPinned; }
    public List<String> getComments() { return comments; }
    public User getAuthor() { return author; }
    public Date getDate() { return date; }
}
