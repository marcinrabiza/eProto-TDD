package com.company;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class Semester {
    private LocalDate endDate;
    private boolean isExpired;

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean checkIfExpiredSemester() {
        LocalDate todayDate = LocalDate.now(); // gets the current date
        return todayDate.isAfter(endDate);
    }
}
