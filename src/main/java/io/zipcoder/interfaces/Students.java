package io.zipcoder.interfaces;


public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students() {
        Student s1 = new Student(10, "John A.");
        Student s2 = new Student(15, "Alex B.");
        Student s3 = new Student(20, "Mickey Mouse");
        this.personAdd(s1);
        this.personAdd(s2);
        this.personAdd(s3);
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    public Student[] getStudentArray(){
       return this.personList.toArray(new Student[personList.size()]);
    }

    @Override
    public Student[] toArray(){
        return super.personList.toArray(new Student[personList.size()]);
    }


}

/*
The class should be an unextendable subclass of the People class.
The class should statically instantiate a final field named INSTANCE of type Students.
The class should define a private nullary constructor which populates the INSTANCE field with
respective Student representations of your colleagues.
Each student should have a relatively unique id field.
The class should define a getInstance method which returns the INSTANCE field.
 */