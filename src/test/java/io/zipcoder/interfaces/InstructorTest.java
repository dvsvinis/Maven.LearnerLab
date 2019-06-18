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
        Student s1 = new Student(25, "John Lennon");
        Double numberOfHours = 4.8;
        s1.learn(numberOfHours);

        Double expected = 4.8;
        Double actual = s1.getTotalStudyTime();
        assertEquals(expected, actual, .01);
        System.out.println(s1.getTotalStudyTime());
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(5l, "Kris");
        Learner[] learners = new Learner[2];
        Student s1 = new Student(25, "John Lennon");
        Student s2 = new Student(15, "Abram C.");
        learners[0] = s1;
        learners[1] = s2;
        Double numberOfHours = 4.0;
        instructor.lecture(learners, numberOfHours);
        System.out.println(learners[0].getTotalStudyTime());
        Double expected = 2.0;  // 4 hours/2 students
        assertEquals(expected, s1.getTotalStudyTime());
    }
}


/*
Create a testTeach method that ensures when an Instructor invokes the teach method, a respective
student's totalStudyTime instance variable is incremented by the specified numberOfHours.
Create a testLecture method that ensures when an Instructor invokes the lecture method,
a respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
*/