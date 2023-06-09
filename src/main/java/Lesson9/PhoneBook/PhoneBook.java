package Lesson9.PhoneBook;

import java.util.Scanner;

import static Lesson9.PhoneBook.Person.initDB;

public class PhoneBook {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        PhoneBook.runPhoneBook();
    }

    public static void runPhoneBook() {

        initDB();

        while (!in.nextLine().equals("exit")) {
            System.out.println("Спасибо что воспользовались нашим справочником! ");

            System.out.print("Для поиcка по Имени введите 1, по номеру 2, по email 3, по всем полям 4: \n");
            String searchType = in.nextLine();

            String searchString;

            switch (searchType) {
                case "1" -> {
                    System.out.print("Введите имя для поиска: \n");
                    searchString = in.nextLine();
                    System.out.println(Person.findByName(searchString, Person.persons));
                }
                case "2" -> {
                    System.out.print("Введите номер для поиска: \n");
                    searchString = in.nextLine();
                    System.out.println(Person.findByPhone(searchString, Person.persons));
                }
                case "3" -> {
                    System.out.print("Введите email для поиска: \n");
                    searchString = in.nextLine();
                    System.out.println(Person.findByEmail(searchString, Person.persons));
                }
                case "4" -> {
                    System.out.print("Введите что-то для поиска: \n");
                    searchString = in.nextLine();
                    System.out.println(Person.find(searchString, Person.persons));
                }
                default -> System.out.print("Ввели хуйню, поэтому ничего не ищем: \n");
            }

            System.out.println("Введите 'exit' чтобы выйти или продолжите поиск");
        }
        System.out.println("Спасибо что воспользовались нашим справочником! ");
    }
}




