package com.company;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import static org.junit.Assert.*;

public class GradesSystemTest {

    private Semester semester;
    private Student student;

    private static final double DELTA = 1e-15;

    @Before
    public void setup() {
        student = new Student(false, 1, 3);

        Course c1 = new Course("przyrka", 2);
        Course c2 = new Course("matma", 5);
        Course c3 = new Course("infa", 5);

        HashMap<String, Grade> gradeHashMap = new HashMap<>();
        gradeHashMap.put(c1.getName(), new Grade(c1, 3.0));
        gradeHashMap.put(c2.getName(), new Grade(c2, 2.0));
        gradeHashMap.put(c3.getName(), new Grade(c3, 5.0));

        student.setGradesFromCourses(gradeHashMap);

        semester = new Semester();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate localDate = LocalDate.parse("11/10/2017",formatter);
        semester.setEndDate(localDate);
    }

    @Test
    public void gradeStudentTest() {
        assertNotNull(student);
        assertEquals(3.0, student.getGrade("przyrka"));
        assertEquals(2.0, student.getGrade("matma"));
        assertEquals(5.0, student.getGrade("infa"));
    }

    @Test
    public void retakeTest() {
        assertEquals(3, student.getGrade("przyrka"), DELTA);
        assertFalse(student.isRetakeAvailable("przyrka"));
        assertTrue(student.isRetakeAvailable("matma"));
    }

    @Test
    public void viewGradesTest() {
        System.out.println(student.getAllGrades());
        String output = "[course=infa, value=5.0, course=przyrka, value=3.0, course=matma, value=2.0]";
        assertEquals(output, student.getAllGrades());
    }

    @Test
    public void timeboxExpirationTest() {
        assertEquals(true,semester.checkIfExpiredSemester());
    }

    @Test
    public void calculateECTSTest() {
        assertEquals(10, student.getECTSSum());
        assertNotNull(student.getECTSSum());
    }
}