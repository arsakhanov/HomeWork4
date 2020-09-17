package ru.arsakhanov;

import java.util.Random;

/**
 * Класс sex(пол)
 * в основном предназначен для возвращения случайного пола
 * для поля sex в классе Person
 */
public class Sex implements Comparable<Sex> {
    public static final String MAN = "MAN";
    public static final String WOMAN = "WOMAN";

    public static final String[] VALUES = {MAN, WOMAN};
    public static final int SIZE = VALUES.length;
    public static final Random RANDOM = new Random();

    public String getMAN() {
        return MAN;
    }

    public String getWOMAN() {
        return WOMAN;
    }

    /**
     * генерирует массив из двух элементов типа String MAN и WOMAN
     *
     * @return возращает одно значение типа String
     */
    public static String randomSex() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }

    /**
     * Проверяет константы MAN и WOMAN
     * положительное значение если WOMAN слева
     * отрицательное, если MAN слева
     * и 0, если объекты равны
     *
     * @param o объекты типа Sex
     * @return возращает число типа int
     */
    @Override
    public int compareTo(Sex o) {
        int result;
        result = getMAN().compareTo(o.getWOMAN());
        return result;
    }
}
