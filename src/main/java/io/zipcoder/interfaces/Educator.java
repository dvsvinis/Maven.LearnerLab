package io.zipcoder.interfaces;

public enum Educator implements Teacher{



    KRIS(new Instructor(100, "Kris"), 10.0),
    WILHEM(new Instructor( 150, "Wilhem"), 15.0),
    DOLIO(new Instructor(200, "Dolio"), 20.0);

    private final Instructor instructor;
    private final Double timeWorked;

    Educator(Instructor instructor, Double timeWorked) {
        this.instructor = instructor;
        this.timeWorked = timeWorked;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void teach(Learner learner, Double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, Double numberOfHours) {
        this.instructor.lecture(learners, numberOfHours);
    }

}


/**The enum should implement Teacher.
        The enum should have an enumeration for each of the instructors represented in the Instructors class.
        Upon construction each enumeration of the enum should instantiate a respective Instructor and assign
 it to a final instructor field upon construction. The instructor should be added to the Instructors singleton.
        Calls to the teach and lecture method should be deferred to the composite instructor reference.
        The enum should have a double timeWorked field which keeps track of the hours that the Educator has taught.
        */