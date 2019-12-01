package com.company;

import java.util.Objects;

public class Course {

    private String name;
    private int ECTS;

    public Course(String name, int ECTS) {
        this.name = name;
        this.ECTS = ECTS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }
}
