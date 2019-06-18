package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getId1() {
        Person person = new Person(1l, "Abram C.");
        long expected = 1l;
        assertEquals(expected, person.getId());
        System.out.println(person.getId());
    }

    @Test
    public void getId2() {
        Person person = new Person(0, "Abram C.");
        long expected = 0;
        assertEquals(expected, person.getId());
        System.out.println(person.getId());
    }

    @Test
    public void getName() {
        Person person = new Person(1, "Abram C.");
        String expected = "Abram C.";
        assertEquals(expected, person.getName());
        System.out.println(person.getName());
    }

    @Test
    public void setName() {
        Person person = new Person(1, "Abram C.");
        System.out.println(person.getName());
        person.setName("Donna S.");
        String expected = "Donna S.";
        String actual = person.getName();
        assertEquals(expected, actual);
        System.out.println(person.getName());
    }
    @Test
    public void testConstructor(){
        //Given
        String expectedName = "Abram";
        long expectedId = 10l;

        //When
        Person person = new Person (expectedId, expectedName);

        //Then
        assertEquals(expectedId, person.getId());
        assertEquals(expectedName, person.getName());
    }

    @Test
    public void testSetName() {
        //Given
        Person person = new Person(0l, null);
        String expectedName = "Jonah";

        //When
        person.setName(expectedName);

        //Then
        assertEquals(expectedName, person.getName());
    }

}