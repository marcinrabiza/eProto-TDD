package com.company;

import java.util.HashMap;

public class Student {

    private int id;
    private int currentSemester;
    private HashMap<String, Grade> gradesFromCourses = new HashMap<>();

    public Student(boolean retakeAvailable, int id, int currentSemester) {
        this.id = id;
        this.currentSemester = currentSemester;
    }


    public double getGrade(String courseName) {
        return gradesFromCourses.get(courseName).getValue();
    }

    public String getAllGrades() {
        return gradesFromCourses.values().toString();
    }

    public int getECTSSum() {
        int sum = 0;
        for (Grade grade : gradesFromCourses.values()) {
            sum += grade.getValue();
        }
        return sum;
    }

    public boolean isRetakeAvailable(String courseName) {
        return gradesFromCourses.get(courseName).getValue() == 2.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public void setGrade(String courseName, double newValue) {
        Grade grade = gradesFromCourses.get(courseName);
        grade.setValue(newValue);
        gradesFromCourses.replace(courseName, grade);
    }

    public HashMap<String, Grade> getGradesFromCourses() {
        return gradesFromCourses;
    }

    public void setGradesFromCourses(HashMap<String, Grade> gradesFromCourses) {
        this.gradesFromCourses = gradesFromCourses;
    }
}
