package university.course;

import university.enums.CourseType;

public class Course {

    private String courseId;
    private String name;
    private int credits;
    private CourseType courseType;
    private String description;

    public Course() {}

    public Course(String courseId, String name, int credits,
                  CourseType courseType, String description) {
        this.courseId = courseId;
        this.name = name;
        this.credits = credits;
        this.courseType = courseType;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{id='" + courseId + "', name='" + name + "', credits=" + credits + ", type=" + courseType + "}";
    }

    public String getCourseId() { 
        return courseId; 
    }
    public String getName() { 
        return name; 
    }
    public int getCredits() { 
        return credits; 
    }
    public CourseType getCourseType() { 
        return courseType; 
    }
    public String getDescription() { 
        return description; 
    }
}
