package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {

    private Students cohort = Students.getInstance();
    Instructors mentors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {

        ((Instructor)teacher).lecture(((Learner[])cohort.toArray()), numberOfHours);
    }

    public void hostLecturer(long id, double numberOfHours){
        Teacher test;
        test = (Teacher)(mentors.findById(id));
        test.lecture(cohort.toArray(), numberOfHours);
    }

    public Map<Student,Double> getStudyMap (){
        Map<Student, Double> studyMap = new HashMap<Student, Double>();
        Student[] studentArray = (Student[])(cohort.toArray());
        for (Student student : studentArray){
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }

}


/* The class should declare a field that references the instance of Students called students.
The class should declare a field that references the instance of Instructors called instructors.
The class should define a method hostLecture which makes use of a Teacher teacher,
double numberOfHours parameter to host a lecture to the composite personList field in the students reference.

The class should define a method hostLecture which makes use of a long id, double numberOfHours parameter to
identify a respective Instructor to host a lecture to the composite personList field in the cohort reference.

The class should define a method getStudyMap which returns a new instance of a mapping from Student
objects to Double objects, representative of each respective student's totalStudyTime.


 */
