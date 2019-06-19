package io.zipcoder.interfaces;

public enum Educator implements Teacher{

    KRIS(new Instructor(100, "Kris")),
    WILHEM(new Instructor( 150, "Wilhem")),
    DOLIO(new Instructor(200, "Dolio"));

    private final Instructor instructor;

    Educator(Instructor instructor) {
        this.instructor = instructor;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void teach(Learner learner, Double numberOfHours) {

    }

    public void lecture(Person[] learners, Double numberOfHours) {

    }
}


/**The enum should implement Teacher.
        The enum should have an enumeration for each of the instructors represented in the Instructors class.
        Upon construction each enumeration of the enum should instantiate a respective Instructor and assign
 it to a final instructor field upon construction. The instructor should be added to the Instructors singleton.
        Calls to the teach and lecture method should be deferred to the composite instructor reference.
        The enum should have a double timeWorked field which keeps track of the hours that the Educator has taught.
        */