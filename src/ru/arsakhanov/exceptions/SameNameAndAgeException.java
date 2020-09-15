package ru.arsakhanov.exceptions;

/**
 * класс для пользавательского исключения
 * исключение выбрасывается, когда в коспаратов в классе Person
 * генерирует одинаковые age и name у нескольких объектов
 */
public class SameNameAndAgeException extends NullPointerException {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    /**
     * Пользовательсое исключение для компаратора класса Person
     *
     * @param message строка типа String
     * @param age     возраст типа int
     * @param name    имя типа String
     */
    public SameNameAndAgeException(String message, int age, String name) {
        super(message);
        this.age = age;
        this.name = name;
    }
}
