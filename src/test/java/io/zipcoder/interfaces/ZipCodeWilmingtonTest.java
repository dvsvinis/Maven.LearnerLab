package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLecture() {
        Instructor instructor = new Instructor(5l, "Kris");
        Students test = Students.getInstance();
        Double numberOfHours = 6.0;
        instructor.lecture((Learner[])test.getStudentArray(), numberOfHours);
        Double expected = 2.0;
        Double actual = test.getStudentArray()[0].getTotalStudyTime();
        assertEquals(expected, actual);

    }

    @Test
    public void hostLecture2() {
    }

    @Test
    public void getStudyMap() {
    }
}

/*Create a testHostLecture method which ensures that each of the Student's totalStudyTime
instance variable is incremented by the specified numberOfHours upon invoking the hostLecture method.

 */