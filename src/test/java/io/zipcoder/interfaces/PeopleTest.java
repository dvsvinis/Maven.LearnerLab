package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeopleTest {

    @Test
    public void testAdd(){
        People people = new People();
        //Given
        Person person1 = new Person(11l, "John");
        Person person2 = new Person(22l, "Steve");

        //When
        people.personAdd(person1);
        people.personAdd(person2);

        //Then
        Boolean expected = true;
        Assert.assertEquals(expected, people.containsName(person1));
    }

    @Test
    public void testAdd2(){
        People people = new People();
        //Given
        Person person1 = new Person(11l, "John");
        Person person2 = new Person(22l, "Steve");

        //When
        people.personAdd(person1);

        //Then
        Boolean expected = false;
        Assert.assertEquals(expected, people.containsName(person2));
    }

    @Test
    public void testRemove(){
        People people = new People();
        //Given
        Person person1 = new Person( 11l, "Rob");
        Person person2 = new Person(22l, "Bob");
        Person person3 = new Person(33l, "Job");
        people.personAdd(person1);
        people.personAdd(person2);
        people.personAdd(person3);

        //When
        people.removeId(33l);

        //Then
        String expected = null;
        Assert.assertEquals(expected, people.findById(33l));
    }

    @Test
    public void testFindById(){
        People people = new People();
        //Given
        Person person1 = new Person( 11l, "Rob");
        Person person2 = new Person(22l, "Bob");
        Person person3 = new Person(33l, "Job");
        people.personAdd(person1);
        people.personAdd(person2);
        people.personAdd(person3);

        //When
        System.out.println(people.findById(33l));

        //Then
        Person expected = person1;
        Assert.assertEquals(expected, people.findById(11l));
    }


}