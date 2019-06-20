package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {

    protected List<E> personList = new ArrayList<E>();

    public People() {
        this.personList = new ArrayList<E>();
    }

    public void personAdd(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E person : personList) {
            if (person.getId() == id)
                return person;
        }
        return null;
    }

    public Boolean containsName(E person) {
        return (personList.contains(person));
    }

    public Boolean remove(E person) {
        return (personList.remove(person));
    }

    public Boolean removeId(long id) {
        for (E person : personList) {
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

//    abstract public E[] toArray();

    public Iterator<E> iterator() {
        return this.iterator();
    }
}

/* xxParameterize the People signature to enforce that it is a container for objects of type
E such that E is a subclass of Person.
xxModify the class signature to declare this class abstract.
An abstract class cannot be instantiated; Its concrete implementation is deferred to its subclass.
xxModify people field to enforce that is a container of objects of type E.
xxModify the add method to ensure that it handles object of type E.
xxModify the findById method to ensure that it returns an object of type E.
xxModify the getArray method signature by declaring it abstract of return tyoe E.
An abstract method is a subclass's contractual agreement to the deferment of an implementation of a respective method.









XX The class should instantiate a List field of Person objects named personList.
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
