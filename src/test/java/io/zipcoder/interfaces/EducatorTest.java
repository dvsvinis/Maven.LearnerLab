package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    @Test
    public void testInstructors() {
        Educator kris = Educator.KRIS;
        assertTrue(kris instanceof Teacher);
    }

    @Test
    public void getInstructor() {
    }

    @Test
    public void teach() {
    }

    @Test
    public void lecture() {
    }
}

/**
 Create a testInheritance method that asserts that a Instructor is an instanceof a Person.
 Create a testTeach method that ensures when an Instructor invokes the teach method, a respective
 student's totalStudyTime instance variable is incremented by the specified numberOfHours.
 Create a testLecture method that ensures when an Instructor invokes the lecture method, a
 respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
*/