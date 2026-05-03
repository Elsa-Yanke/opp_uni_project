package university.patterns;

import university.course.Course;
import university.course.Semester;
import university.other.News;
import university.other.TechRequest;
import university.research.ResearchJournal;
import university.users.User;
import java.io.*;
import java.util.*;

public class Database implements Serializable {

    private static Database instance;

    private Map<String, User> users;
    private Map<String, Course> courses;
    private List<Semester> semesters;
    private List<News> news;
    private List<ResearchJournal> journals;
    private List<TechRequest> techRequests;
    private List<String> logs;

    private Database() {
        this.users = new HashMap<>();
        this.courses = new HashMap<>();
        this.semesters = new ArrayList<>();
        this.news = new ArrayList<>();
        this.journals = new ArrayList<>();
        this.techRequests = new ArrayList<>();
        this.logs = new ArrayList<>();
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void saveUser(User user) {
        users.put(user.getId(), user);
    }

    public User findUser(String id) {
        return users.get(id);
    }

    public User findUserByLogin(String login) {
        for (User user : users.values()) {
            if (user.getLogin().equals(login)) return user;
        }
        return null;
    }

    public void removeUser(String id) {
        users.remove(id);
    }

    public void saveCourse(Course course) {
        courses.put(course.getCourseId(), course);
    }

    public Course findCourse(String id) {
        return courses.get(id);
    }

    public Collection<User> getAllUsers() { return users.values(); }
    public Collection<Course> getAllCourses() { return courses.values(); }
    public List<Semester> getAllSemesters() { return semesters; }

    public void saveNews(News n) { news.add(n); }
    public List<News> getAllNews() { return news; }
    public void saveTechRequest(TechRequest req) { techRequests.add(req); }
    public List<TechRequest> getAllTechRequests() { return techRequests; }
    public void addJournal(ResearchJournal journal) { journals.add(journal); }
    public List<ResearchJournal> getAllJournals() { return journals; }
    public void addSemester(Semester semester) { semesters.add(semester); }

    public void log(String action) {
        String entry = new Date() + " | " + action;
        logs.add(entry);
        System.out.println("[LOG] " + entry);
    }

    public List<String> getLogs() { return logs; }

    public void save() {
    }

    public void load() {
    }
}
