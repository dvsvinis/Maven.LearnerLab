package io.zipcoder.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;



public class InstructorTest {

    @Test
    public void testImplimentation(){
        Instructor instructor = new Instructor(10L, "Donna");
        assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(22L, "Jacob");

        assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Student studentJL = new Student(25, "John Lennon");
        double numberOfHours = 4.8;
        studentJL.learn(numberOfHours);

        double expected = 4.8;
        double actual = studentJL.getTotalStudyTime();
        assertEquals(expected, actual, .01);
        System.out.println(studentJL.getTotalStudyTime());
    }

    //?????
    @Test
    public void testLecture() {
        double resultTotalStudyTime = 0.0;
        Instructor instructor = new Instructor();
  //      instructor.lecture();         //I don't know how to get the numberofHours

    }
}


/*
Create a testTeach method that ensures when an Instructor invokes the teach method, a respective
student's totalStudyTime instance variable is incremented by the specified numberOfHours.
Create a testLecture method that ensures when an Instructor invokes the lecture method,
????a respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
*/