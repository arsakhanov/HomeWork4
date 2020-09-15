package ru.arsakhanov;

import ru.arsakhanov.exceptions.SameNameAndAgeException;

import java.util.Random;

public class Person implements Comparable<Person> {
    private final int age;
    private final String sex;
    private final String name;

    public Person() {
        this.age = (int) (Math.random() * 100);
        this.name = getNames();
        this.sex = Sex.randomSex();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    //Имена для поля name
    private static final String[] NAMES = {"Joe", "Donna", "Ronald", "Sarah", "David", "Courtney", "Irwin", "Linda", "Michael",
            "Cindy", "Tom", "Rebekah", "Todd", "Tracy", "Peter", "Nicole", "Marcelo", "Jennifer", "Rick",
            "Andrea", "Bruce", "Jaclyn", "Doug", "Shirley", "Steve", "Liz", "Waldo", "Theresa", "Scott",
            "Colby", "Beth", "Larry", "Emily", "Paul", "Kate", "Sam", "Dianne", "Dustin", "Alethea", "Wayne",
            "Kristina", "Christian", "Danny", "Breya", "Andrew", "Alison", "Tim", "Mary", "Chris", "Susie",
            "Jeremy", "Willy", "Jessica", "Marcus", "Kelly", "Kyle", "Stephanie", "Isaiah", "Hillary", "Eric",
            "Julia", "Donald", "Meredith", "Kevin", "Leslie", "Blake", "Angela", "Cliff", "Debbie", "Dylan",
            "Erin", "Alex", "Monica", "Nathan", "Wendy", "Josh", "Megan", "Adam", "Michelle", "Carey", "Ashley",
            "Brian", "Jason", "Melanie", "Jim", "Monica", "Jamie", "Rhonda", "Steven", "Perry", "Byron", "Laura",
            "Harry", "Brooke", "Drew", "Vicki", "Gary", "Anita", "Felipe", "Josie"};
    private static final int SIZEOFNAMES = NAMES.length;
    private static final Random RANDOM = new Random();

    /**
     * генерирует случайное имя из массива NAMES
     *
     * @return возвращает элемент типа String из массива NAMES
     */
    public String getNames() {
        return NAMES[RANDOM.nextInt(SIZEOFNAMES)];
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * Переопределенный метод compareTo
     * сначала сравнивает по полю sex
     * потом по полю age
     * если у двух объектов поля age совпадают, то сравнивает по имени
     * и возвращает результат
     *
     * @param o объект типа Person для сравнения
     * @return возвращает положительное число если левый объект больше правого
     * отрицательное, если левый меньше правого
     * и 0 если объекты равны
     * @throws SameNameAndAgeException исключение, которое происходит, если у двух объектов совпрадают age и name
     */
    @Override
    public int compareTo(Person o) throws SameNameAndAgeException {
        int result;
        result = sex.compareTo(o.sex);
        if (result != 0) {
            return result;
        }
        result = Integer.compare(getAge(), o.getAge());
        if (result != 0) {
            return result * -1;
        } else {
            result = getName().compareTo(o.getName());
            if (result == 0) {
                throw new SameNameAndAgeException("Возраст и имя одинаковые", getAge(), getName());
            }
        }
        result = getName().compareTo(o.getName());
        return result;
    }
}
