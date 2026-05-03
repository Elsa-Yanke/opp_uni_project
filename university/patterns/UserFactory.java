package university.patterns;

import university.enums.ManagerType;
import university.enums.StudentDegree;
import university.enums.TeacherPosition;
import university.users.*;

public class UserFactory {

    private UserFactory() {}

    public static Student createStudent(String id, String login, String password, String name, String surname, String email, String studentId) {
        return new Student(id, login, password, name, surname, email, studentId);
    }

    public static GraduateStudent createGraduateStudent(String id, String login,String password, String name, String surname, String email, String studentId, StudentDegree degree) {
        return new GraduateStudent(id, login, password, name, surname, email, studentId, degree);
    }

    public static Teacher createTeacher(String id, String login, String password,String name, String surname, String email,double salary, String department, TeacherPosition position) {
        return new Teacher(id, login, password, name, surname, email,
                salary, department, position);
    }

    public static Manager createManager(String id, String login, String password, String name, String surname, String email, double salary, String department, ManagerType managerType) {
        return new Manager(id, login, password, name, surname, email,
                salary, department, managerType);
    }

    public static Admin createAdmin(String id, String login, String password, String name, String surname, String email, double salary, String department) {
        return new Admin(id, login, password, name, surname, email, salary, department);
    }

    public static TechSupportSpecialist createTechSupport(String id, String login,String password, String name, String surname, String email, double salary, String department) {
        return new TechSupportSpecialist(id, login, password, name, surname, email, salary, department);
    }
}
