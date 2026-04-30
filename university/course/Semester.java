package university.course;

import university.enums.SemesterSeason;
import java.util.ArrayList;
import java.util.List;

public class Semester {

    private int year;
    private SemesterSeason season;
    private boolean isRegistrationOpen;
    private List<CourseOffering> offerings;

    public Semester() {
        this.offerings = new ArrayList<>();
    }

    public Semester(int year, SemesterSeason season) {
        this.year = year;
        this.season = season;
        this.isRegistrationOpen = false;
        this.offerings = new ArrayList<>();
    }

    public void addOffering(CourseOffering offering) {
        offerings.add(offering);
    }

    public List<CourseOffering> getOfferings() { return offerings; }

    public void openRegistration() { this.isRegistrationOpen = true; }
    public void closeRegistration() { this.isRegistrationOpen = false; }

    public int getYear() { return year; }
    public SemesterSeason getSeason() { return season; }
    public boolean isRegistrationOpen() { return isRegistrationOpen; }

    @Override
    public String toString() {
        return season + " " + year;
    }
}
