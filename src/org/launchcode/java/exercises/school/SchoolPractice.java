package org.launchcode.java.exercises.school;

public class SchoolPractice {
    public static void main(String[] args) {
        Student firstStudent = new Student("Shaun", 2236, 1, 4.0);

        System.out.println(firstStudent.getName() + " " + firstStudent.getStudentId() + " " + firstStudent.getNumberOfCredits() + " " + firstStudent.getGpa());
    }
}
