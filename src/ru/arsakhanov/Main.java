package ru.arsakhanov;

import ru.arsakhanov.impl.BubbleSortImpl;
import ru.arsakhanov.impl.InsertionSortImpl;

public class Main {

    public static void main(String[] args) {
        RandomArray randomArray = new RandomArray();
        ShowPersons showPersons = new ShowPersons();
        Person[] person;

        person = randomArray.createArrayRandom();
        Sort sorting = new BubbleSortImpl();
        Person[] sortingPersons = sorting.sort(person);
        System.out.println("Пузырьковая сортировка");
        showPersons.showArray(sortingPersons);
        System.out.println("=======================================================================================");

        /*Создаю новые объекты, чтобы сортировка вставками использовала новый массив, а не уже отсортированный
        пузырьковой сортировкой */
        person = randomArray.createArrayRandom();
        sorting = new InsertionSortImpl();
        sortingPersons = sorting.sort(person);
        System.out.println("Сортировка вставками");
        showPersons.showArray(sortingPersons);
        System.out.println("=======================================================================================");


    }
}