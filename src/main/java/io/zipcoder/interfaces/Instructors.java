package io.zipcoder.interfaces;

public class Instructors extends People {
    private static final Instructors instance = new Instructors();

    private Instructors() {
        Instructor s1 = new Instructor(100, "Kris");
        Instructor s2 = new Instructor(150, "Wilhem");
        Instructor s3 = new Instructor(200, "Dolio");
        this.personAdd(s1);
        this.personAdd(s2);
        this.personAdd(s3);
    }

    public static Instructors getInstance() {
        return instance;
    }
}