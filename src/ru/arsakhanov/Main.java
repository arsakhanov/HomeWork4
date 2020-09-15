package ru.arsakhanov;

import ru.arsakhanov.impl.BubbleSortImpl;
import ru.arsakhanov.impl.InsertionSortImpl;

public class Main {

    public static void main(String[] args) {
        Person[] person = new Person[100];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
        }
        BubbleSortImpl.sort(person);
        System.out.println("Пузырьковая сортировка");
        for (Person value : person) {
            System.out.println(value);
        }
        System.out.println("=======================================================================================");
        /*Создаю новые объекты, чтобы сортировка вставками использовала новый массив, а не уже отсортированный
        пузырьковой сортировкой */
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
        }
        InsertionSortImpl.sort(person);
        System.out.println("Сортировка вставками");
        for (Person value : person) {
            System.out.println(value);
        }
        System.out.println("=======================================================================================");


    }
}