package university.course;

import university.enums.LessonType;
import university.users.Teacher;
import java.util.Date;

public class Lesson {

    private String lessonId;
    private String topic;
    private LessonType type;
    private Teacher teacher;
    private Date date;

    public Lesson() {}

    public Lesson(String lessonId, String topic, LessonType type,
                  Teacher teacher, Date date) {
        this.lessonId = lessonId;
        this.topic = topic;
        this.type = type;
        this.teacher = teacher;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Lesson{topic='" + topic + "', type=" + type + ", date=" + date + "}";
    }

    public String getLessonId() { 
        return lessonId; 
    }
    public String getTopic() { 
        return topic; 
    }
    public LessonType getType() { 
        return type; 
    }
    public Teacher getTeacher() { 
        return teacher; 
    }

    public Date getDate() { 
        return date; 
    }
}
