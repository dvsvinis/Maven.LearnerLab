package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstructorsTest {

    @Test
    public void testInstructors() {
        Instructors test = Instructors.getInstance();
        Integer expected = 3;
        assertEquals(expected, test.countList());
        System.out.println(test.countList());
    }

    @Test
    public void testInstructors2() {
        Instructors test = Instructors.getInstance();
        Instructor s3 = new Instructor(200, "Dolio");
        test.findById(200l);
        String expected = "Dolio";
        assertEquals(expected, test.findById(200).getName());
        System.out.println(test.findById(200).getName());
    }

}
