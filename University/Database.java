
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Database {

    /**
     * Default constructor
     */
    public Database() {
    }

    /**
     * 
     */
    private instance: Database;

    /**
     * 
     */
    private users: Map~String,;

    /**
     * 
     */
    private courses: Map~String,;

    /**
     * 
     */
    private semesters: List~Semester~;

    /**
     * 
     */
    private news: List~News~;

    /**
     * 
     */
    private journals: List~ResearchJournal~;

    /**
     * 
     */
    private techRequests: List~TechRequest~;

    /**
     * 
     */
    private logs: List~String~;

    /**
     * 
     */
    private Database() {
        // TODO implement here
    }

    /**
     * @return
     */
    public Database getInstance() {
        // TODO implement here
        return null;
    }

    /**
     * @param User 
     * @return
     */
    public void saveUser(user: User) {
        // TODO implement here
        return null;
    }

    /**
     * @param String 
     * @return
     */
    public User findUser(id: String) {
        // TODO implement here
        return null;
    }

    /**
     * @param String 
     * @return
     */
    public User findUserByLogin(login: String) {
        // TODO implement here
        return null;
    }

    /**
     * @param String 
     * @return
     */
    public void removeUser(id: String) {
        // TODO implement here
        return null;
    }

    /**
     * @param Course 
     * @return
     */
    public void saveCourse(course: Course) {
        // TODO implement here
        return null;
    }

    /**
     * @param String 
     * @return
     */
    public Course findCourse(id: String) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Collection<User> getAllUsers() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Collection<Course> getAllCourses() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Semester> getAllSemesters() {
        // TODO implement here
        return null;
    }

    /**
     * @param News 
     * @return
     */
    public void saveNews(news: News) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<News> getAllNews() {
        // TODO implement here
        return null;
    }

    /**
     * @param TechRequest 
     * @return
     */
    public void saveTechRequest(req: TechRequest) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<TechRequest> getAllTechRequests() {
        // TODO implement here
        return null;
    }

    /**
     * @param String 
     * @return
     */
    public void log(action: String) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<String> getLogs() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void save() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void load() {
        // TODO implement here
        return null;
    }

}