
import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Employee extends User {

    /**
     * Default constructor
     */
    public Employee() {
    }

    /**
     * 
     */
    private salary: double;

    /**
     * 
     */
    private department: String;

    /**
     * 
     */
    private inbox: List~Message~;




    /**
     * @param Employee 
     * @param String 
     * @return
     */
    public Message sendMessage(to: Employee, content: String) {
        // TODO implement here
        return null;
    }

    /**
     * @param Message 
     * @return
     */
    public void receiveMessage(message: Message) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Message> receiveMessages() {
        // TODO implement here
        return null;
    }

}