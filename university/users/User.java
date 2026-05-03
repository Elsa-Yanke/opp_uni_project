package university.users;

import university.enums.Language;
import university.interfaces.Subscribable;
import university.research.ResearchJournal;
import university.research.ResearchPaper;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class User implements Subscribable {

    private String id;
    private String login;
    private String password;
    private String name;
    private String surname;
    private String email;
    private Language language;
    private List<ResearchJournal> subscribedJournals;

    public User() {
        this.subscribedJournals = new ArrayList<>();
    }

    public User(String id, String login, String password, String name, String surname, String email) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.language = Language.EN;
        this.subscribedJournals = new ArrayList<>();
    }

    public boolean authenticate(String login, String password) {
        return this.login.equals(login) && this.password.equals(password);
    }

    public void logout() {
    }

    @Override
    public void subscribe(ResearchJournal journal) {
        if (!subscribedJournals.contains(journal)) {
            subscribedJournals.add(journal);
            journal.subscribe(this);
        }
    }

    @Override
    public void unsubscribe(ResearchJournal journal) {
        subscribedJournals.remove(journal);
        journal.unsubscribe(this);
    }

    @Override
    public void onNewPaperPublished(ResearchPaper paper) {
        System.out.println("Notification for " + getFullName() + ": New paper published - " + paper.getTitle());
    }

    public String getFullName() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{id='" + id + "', name='" + getFullName() + "'}";
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Language getLanguage() { return language; }
    public void setLanguage(Language language) { this.language = language; }
    public List<ResearchJournal> getSubscribedJournals() { return subscribedJournals; }
}
