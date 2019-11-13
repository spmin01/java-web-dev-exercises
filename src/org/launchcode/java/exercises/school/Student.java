package org.launchcode.java.exercises.school;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setStudentId(int newId) {
        this.studentId = newId;
    }

    public void setNumberOfCredits(int newNumberOfCredits) {
        this.numberOfCredits = newNumberOfCredits;
    }

    public void setGpa(double newGpa) {
        this.gpa = newGpa;
    }

    public String getName() {
        return this.name;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    public double getGpa() {
        return this.gpa;
    }


}