package io.zipcoder.interfaces;


public class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
//        Educator.DOLIO.getInstructor();
//        Educator.KRIS.getInstructor();
//        Educator.WILHEM.getInstructor();

//        Instructor s1 = new Instructor(100, "Kris");
//        Instructor s2 = new Instructor(150, "Wilhem");
//        Instructor s3 = new Instructor(200, "Dolio");
        this.personAdd(Educator.DOLIO.getInstructor());
        this.personAdd(Educator.KRIS.getInstructor());
        this.personAdd(Educator.WILHEM.getInstructor());
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        return (Instructor[]) super.personList.toArray(new Instructor[personList.size()]);
    }

}