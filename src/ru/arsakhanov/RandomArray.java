package ru.arsakhanov;

public class RandomArray {

    private final int COUNT = 100;

    public Person[] createArrayRandom(){
        Person[] persons = new Person[COUNT];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
        }
        return persons;
    }

}
