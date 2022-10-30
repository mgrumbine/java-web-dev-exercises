package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int numberOfCredits, double gpa) {
        this.studentId = 0;
        this.name = name;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
        this.studentId += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public static String studentInfo(Student student) {
        return (student.getName() + " (ID: " + student.getStudentId() + ") has a GPA of " + student.getGpa() + " and has taken " + student.getNumberOfCredits() + " number of credits.");
    }

}