package Lesson9.PhoneBook;
import java.util.Objects;
import java.util.Scanner;

import static Lesson9.PhoneBook.Person.*;
import static Lesson9.PhoneBook.SearchType.*;
//import static Lesson9.PhoneBook.Person.initBD;

public class PhoneBook {

    public static void main(String[] args) {


        initBD();
        do new SearchType(); while (!in.nextLine().equals("exit"));
        System.out.println("Спасибо что воспользовались нашим справочником! ");
    }
}

class SearchType {
    public static Scanner in = new Scanner(System.in);
    public SearchType() {
        System.out.print("Для поиcка по Имени введите 1, по номеру 2, по email 3: \n");
        String searchType = in.nextLine();

        switch (searchType) {
            case "1" -> System.out.print("Введите Имя для поиска: \n");
            case "2" -> System.out.print("Введите номер для поиска: \n");
            case "3" -> System.out.print("Введите email для поиска: \n");
            default -> {
            }
        }
        String searchString = in.nextLine();

        findPerson(searchType, searchString);
        System.out.println("Введите 'exit' чтобы выйти или продолжите поиск");
    }
}




record Person(String name, String phone, String email) {
    private final static Person[] persons = new Person[10];

    public static void initBD() {
        persons[0] = new Person("Юля", "89210000000", "Julia@yandex.com");
        persons[1] = new Person("Сергей", "777777", "borya@yandex.com");
        persons[2] = new Person("Друган", "23566777", "univer@yandex.com");
        persons[3] = new Person("EvilBoss", "456546546", "boss@yandex.com");
        persons[4] = new Person("Anna", "+79216661666", "mylove@yandex.com");
    }

    public String toString() {
        return "\n\nName: " + this.name() + "\nPhone number: " + this.phone() + "\nEmail: " +
                this.email();
    }

    // поиск человека
    public static void findPerson(String searchType, String searchString) {

        switch (searchType) {
            case "1" ->
                //по имени
                    System.out.println(find(searchString, persons));
            case "2" ->
                //по телефону
                    System.out.println(find(searchString, persons));
            case "3" ->
                // по почте
                    System.out.println(find(searchString, persons));
            default -> {
            }
        }
    }

    public static Person find(String searchString, Person[] persons) {
        for (Person person : persons) {
            if (person == null) continue;
            if (searchString.equals(person.name)) {
                return person;
            } else if (searchString.equals(person.phone)) {
                return person;
            } else if (searchString.equals(person.email)) {
                return person;

            }

        }
        System.out.println("нет такого человека");
        return null;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Person) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.phone, that.phone) &&
                Objects.equals(this.email, that.email);
    }

}