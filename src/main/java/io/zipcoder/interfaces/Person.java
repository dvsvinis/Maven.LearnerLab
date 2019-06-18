package io.zipcoder.interfaces;

import static java.lang.Long.MIN_VALUE;

public class Person {
  private final long id;
  private String name;

  public Person(){};   //??should we have this

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
