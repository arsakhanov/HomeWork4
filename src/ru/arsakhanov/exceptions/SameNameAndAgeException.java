package ru.arsakhanov.exceptions;

/**
 * класс для пользавательского исключения
 * исключение выбрасывается, когда в коспаратов в классе Person
 * генерирует одинаковые age и name у нескольких объектов
 */
public class SameNameAndAgeException extends NullPointerException {

    /**
     * Пользовательсое исключение для компаратора класса Person
     *
     * @param message строка типа String
     */
    public SameNameAndAgeException(String message) {
        super(message);

    }
}
