package io.zipcoder.interfaces;

public class Person {
  private final long id;
  private String name;


    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
/*Create a testConstructor method which ensures that a Person object's id and name field are being set upon construction.
Create a testSetName method which ensures that a Person object's name variable is being set by invoking the .setName method.
*/