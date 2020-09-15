package ru.arsakhanov.impl;

import ru.arsakhanov.Person;
import ru.arsakhanov.Sort;

/**
 * класс, в котором реализуется пузырьковая сортировка
 * для класса Person с использованием компаратора для сравнения объектов
 * сначала проверяется меньший элемент, если он найдет
 * то он смещается на крайнюю левую позицию
 * и так, пока все элементы не будут отсортированы
 */
public class BubbleSortImpl implements Sort {

    /**
     * Пузырьковая сортировка
     * сортирует от меньшего к большему
     * сравнение происходит через компаратор
     *
     * @param persons массив объектов типа Person
     */

    public static void sort(Person[] persons) {
        long startTime = System.currentTimeMillis();
        int size = persons.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (persons[j].compareTo(persons[j + 1]) > 0) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }

            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время пузырьковой сортировки составляет составляет: "
                + (endTime - startTime) + " милисекунды");
    }
}

