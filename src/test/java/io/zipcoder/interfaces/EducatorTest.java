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
    public void testImplementation() {
        assertTrue(Educator.DOLIO instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        assertTrue(Educator.KRIS.getInstructor() instanceof Person);
    }

    @Test
    public void teach() {
        Student s3 = new Student(20, "Mickey Mouse");
        Double expected = 6.0;
        Educator.DOLIO.teach(s3,expected);
        Double actual = s3.getTotalStudyTime();
        assertEquals(expected, actual);
    }

    @Test
    public void lecture() {
        Student s1 = new Student(10, "John A.");
        Student s2 = new Student(15, "Alex B.");
        Student s3 = new Student(20, "Mickey Mouse");
        Learner[] students = new Student[]{s1, s2, s3};
        Double expected = 2.0;
        Educator.KRIS.lecture(students,expected * 3);
        Double actual = s1.getTotalStudyTime();
        assertEquals(expected, actual);
        actual = s2.getTotalStudyTime();
        assertEquals(expected, actual);
        actual = s3.getTotalStudyTime();
        assertEquals(expected, actual);
    }

}

/**
 Create a testInheritance method that asserts that a Instructor is an instanceof a Person.
 Create a testTeach method that ensures when an Instructor invokes the teach method, a respective
 student's totalStudyTime instance variable is incremented by the specified numberOfHours.
 Create a testLecture method that ensures when an Instructor invokes the lecture method, a
 respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
*/
