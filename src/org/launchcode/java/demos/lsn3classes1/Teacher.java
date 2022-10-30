package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    private String firstname;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstname, String lastName, String subject, int yearsTeaching) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    public static String teacherInfo(Teacher teacher) {
        return (teacher.getFirstname() + " " + teacher.getLastName() + " has been teaching " + teacher.getSubject() + " for " + teacher.getYearsTeaching() + " years.");
    }
}
