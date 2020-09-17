package ru.arsakhanov;

/**
 * класс для генерирования рандомных объектов для массива типа Person
 */
public class RandomArray {

    private final int COUNT = 100; //количество сгенерированных объектов

    /**
     * метод генерирует рандомные объекты для Person и возвращает массив
     * @return возвращает массив типа Person[]
     */
    public Person[] createArrayRandom(){
        Person[] persons = new Person[COUNT];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
        }
        return persons;
    }

}
