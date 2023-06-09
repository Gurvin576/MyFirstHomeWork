package Lesson9.PhoneBook;

import Lesson9.PhoneBook.Person;

import java.util.Scanner;

import static Lesson9.PhoneBook.Person.initDB;

class SearchType {
    public static Scanner in = new Scanner(System.in);

    public SearchType() {

        initDB();
        while (!in.nextLine().equals("exit")) {
            System.out.println("Спасибо что воспользовались нашим справочником! ");

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

            System.out.println(Person.find(searchString, Person.persons));
            System.out.println("Введите 'exit' чтобы выйти или продолжите поиск");
        }
        System.out.println("Спасибо что воспользовались нашим справочником! ");
    }
}