package com.company;

import org.junit.BeforeClass;
import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class TestTest {

    private Semester semester;
    private Student student;

    @BeforeClass
    private void setup(){
        student = new Student(false, 1,   3);
        semester = new Semester();
    }

    @Test
    public void gradeStudentTest() {
        student.setGrade("przyrka", 5.0);
        assertEquals(5.0, student.getGrade("przyrka"));

    }

    @Test
    public void retakeTest() {
        assertEquals(2.0, student.getGrade("przyrka"));
        assertTrue(student.isRetakeAvailable());
    }

    @Test
    public void viewGradesTest() {
        String output = "przyroda:5.0";
        assertEquals(output, student.getAllGrades() );
    }

    @Test
    public void timeboxExpirationTest() {
        LocalDate date = LocalDate.now(); // gets the current date
        assertEquals(date,semester.getEndDate());
    }

    @Test
    public void calculateECTSTest() {
        assertEquals(10, student.getECTSSum());
        assertNotNull(student.getECTSSum());
    }
}