package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void testStudents() {
        Students test = Students.getInstance();
        Integer expected = 3;
        assertEquals(expected, test.countList());
        System.out.println(test.countList());
    }

    @Test
    public void testStudents2() {
        Students test = Students.getInstance();
        Student s3 = new Student(20, "Mickey Mouse");
        test.findById(20l);
        String expected = "Mickey Mouse";
        assertEquals(expected, test.findById(20).getName());
        System.out.println(test.findById(20).getName());
    }

}