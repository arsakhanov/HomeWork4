package ru.arsakhanov;


/**
 * Класс для создания методов вывода на экран массива Person
 */
public class ShowPersons {

    /**
     * метод для вывода всех элементов массива Person на экран
     *
     * @param people массива типа Person[]
     */
    public void showArray(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
