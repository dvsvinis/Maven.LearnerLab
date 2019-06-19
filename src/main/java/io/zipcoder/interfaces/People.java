package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class People implements Iterable<Person>{

    public List<Person> personList = new ArrayList<Person>();


    public void personAdd(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person person : personList) {
            if (person.getId() == id)
                return person;
        }
        return null;
    }

    public Boolean containsName(Person person) {
        return (personList.contains(person));
    }

    public Boolean remove(Person person) {
        return (personList.remove(person));
    }

    public Boolean removeId(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                personList.remove(person);
                return true;
            }
        }
        return false;
    }

    public void clearList() {
        personList.clear();
    }

    public Integer countList() {
        return personList.size();
    }

    public Person[] toArray() {
        Person[] output = new Person[personList.size()];
        return personList.toArray(output);
    }

    public Iterator<Person> iterator() {
        return this.iterator();
    }
}

/* XX The class should instantiate a List field of Person objects named personList. 
XX The class should define a method named add which adds a Person to the personList.
xxThe class should define a method named findById which makes use of a long id parameter to return a
Person object with the respective id field.
xxThe class should define a named contains which makes use of a Person person parameter to return true
if the personList contains the respective Person object.
xxThe class should define a method named remove which makes use of a Person person parameter to remove a respective Person object.

xxThe class should define a method named remove which makes use of a long id parameter to remove a Person object with the respective id field.
xxThe class should define a named removeAll which clears our personList field.
xxThe class should define a method named count which returns the size of personList.
XXThe class should define a method named toArray which returns an array representation of the personList field.
The class should implement Iterable<E> and define a method named iterator which makes use of the personList field to generate a new a Iterator<E>.

*/
