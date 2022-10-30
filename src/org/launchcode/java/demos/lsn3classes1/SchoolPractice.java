package org.launchcode.java.demos.lsn3classes1;


import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        Student student1 = new Student("Megan", 1, 4.0);
        Student student2 = new Student("Neal", 2, 3.5);
        Student student3 = new Student("Kyle", 0, 0.0);
        System.out.println(Student.studentInfo(student1));

        Teacher teacher1 = new Teacher("Pam", "Grumbine", "students with dyslexia how to read", 7);
        System.out.println(Teacher.teacherInfo(teacher1));

        ArrayList<Student> enrolledStudents = new ArrayList<Student>();
        enrolledStudents.add(student1);
        enrolledStudents.add(student2);
        enrolledStudents.add(student3);

        Course course1 = new Course("Pamelicious's Class", teacher1, enrolledStudents);
        System.out.println(Course.courseInfo(course1));

    }
}
