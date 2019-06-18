package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    public Instructor() {}     //?? should we have this

    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);

    }

    public void lecture(Learner[] learners, double numberOfHours) {

        for (Learner each: learners){
           each.learn(numberOfHours);    //??this needs to be a total
        }
        double numberofHoursPerLearner = numberOfHours/learners.length;
    }

}

/* Instructor is a subclass of Person
Instructor implements the Teacher interface
Instructor should have a concrete implementation of the teach method which invokes the learn method
on the specified Learner object.
Instructor should have a concrete implementation of the lecture method which invokes the learn method
on each of the elements in the specified array of Learner objects.
numberOfHours should be evenly split amongst the learners.
double numberOfHoursPerLearner = numberOfHours / learners.length;
*/