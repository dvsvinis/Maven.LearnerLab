package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private Double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
        this.totalStudyTime = 0.0;
    }

    public void learn(Double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}

/* Student is a subclass of Person
Student implements the Learner interface
Student should have an instance variable totalStudyTime of type double
Student should have a concrete implementation of the learn method which increments the totalStudyTime variable
by the specified numberOfHours argument.
Student should have a getTotalStudyTime() method which returns the totalStudyTime instance variable.


 */
