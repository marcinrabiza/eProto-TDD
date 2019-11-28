package com.company;

public class Student {
    public Student(boolean retakeAvailable, int id, int currentSemester) {
        this.retakeAvailable = retakeAvailable;
        this.id = id;
        this.currentSemester = currentSemester;
    }

    private boolean retakeAvailable;
    private int id;
    private int currentSemester;

    public boolean isRetakeAvailable() {
        return retakeAvailable;
    }

    public void setRetakeAvailable(boolean retakeAvailable) {
        this.retakeAvailable = retakeAvailable;
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

    public double getGrade(String przyrka) {
        return 0;
    }

    public String getAllGrades() {
        return "";
    }

    public int getECTSSum() {
        return 0;
    }

    public void setGrade(String przyrka, double grade) {
    }
}
