package io.zipcoder.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestPerson {
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
