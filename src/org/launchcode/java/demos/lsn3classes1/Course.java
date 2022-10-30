package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {

    private String courseTitle;
    private Teacher teacher;
    private ArrayList<Student> roster;

    public Course(String courseTitle, Teacher teacher, ArrayList<Student> roster) {
        this.courseTitle = courseTitle;
        this.teacher = teacher;
        this.roster = roster;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }

    public static String courseInfo(Course course) {
        return (course.getCourseTitle() + " is taught by " + course.getTeacher().getFirstname() + " " + course.getTeacher().getLastName()
                + " and has " + course.getRoster().get(0).getName() + ", " + course.getRoster().get(1).getName() + ", and " + course.getRoster().get(2).getName() + " as students.");
    }
}