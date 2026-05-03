package university.users;

import university.patterns.Database;
import java.util.List;

public class Admin extends Employee {

    public Admin() {
        super();
    }

    public Admin(String id, String login, String password, String name, String surname, String email, double salary, String department) {
        super(id, login, password, name, surname, email, salary, department);
    }

    public void addUser(User user) {
        Database.getInstance().saveUser(user);
        Database.getInstance().log("Admin " + getFullName() + " added user: " + user.getFullName());
    }

    public void removeUser(String userId) {
        Database.getInstance().removeUser(userId);
        Database.getInstance().log("Admin " + getFullName() + " removed user id: " + userId);
    }

    public void updateUser(User user) {
        Database.getInstance().saveUser(user);
        Database.getInstance().log("Admin " + getFullName() + " updated user: " + user.getFullName());
    }

    public List<String> viewLogs() {
        return Database.getInstance().getLogs();
    }
}
