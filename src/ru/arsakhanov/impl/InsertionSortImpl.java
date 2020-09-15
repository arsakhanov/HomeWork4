package ru.arsakhanov.impl;

import ru.arsakhanov.Person;
import ru.arsakhanov.Sort;

/**
 * класс для реализации алгоритма сортировки вставками
 * Каждый проход выбирать самый минимальный элемент и смещать его в начало.
 * При этом каждый новый проход начинать сдвигаясь вправо,
 * то есть первый проход — с первого элемента, второй проход — со второго
 */
public class InsertionSortImpl implements Sort {

    /**
     * Сортировка вставками
     * сравнение происходит через коспаратор класса Person
     *
     * @param persons массив объектов типа Person
     */
    public static void sort(Person[] persons) {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < persons.length; i++) {
            Person current = persons[i];
            int j = i - 1;
            while (j >= 0 && (current.compareTo(persons[j]) < 0)) {
                persons[j + 1] = persons[j];
                j--;
            }
            persons[j + 1] = current;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время работы сортировки вставками составляет составляет: "
                + (endTime - startTime) + " милисекунды");

    }
}