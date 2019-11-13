package org.launchcode.java.exercises.school;

import java.util.ArrayList;

public class Course {
    private String teacher;
    private String courseName;
    private ArrayList<Student> students;

    public Course(String teacher, String courseName) {
        this.teacher = teacher;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getTeacher() {
        return this.teacher;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void addStudent(Student studentToAdd) {
        this.students.add(studentToAdd);
    }

    public void setTeacher(String newTeacher) {
        this.teacher = newTeacher;
    }

    public void setCourseName(String newCourseName) {
        this.courseName = newCourseName;
    }

}
