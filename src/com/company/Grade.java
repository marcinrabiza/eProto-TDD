package com.company;

public class Grade {

    private Course course;
    private double value;

    public Grade(Course course, double value) {
        this.course = course;
        this.value = value;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  "course=" + course.getName() +
                ", value=" + value;

    }
}
