package Lesson9.PhoneBook;

import java.util.Objects;


class Person {
    final static Person[] persons = new Person[10];
    private final String name;
    private final String phone;
    private final String email;

    Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public static void initDB() {
        persons[0] = new Person("Юля", "89210000000", "Julia@yandex.com");
        persons[1] = new Person("Сергей", "777777", "borya@yandex.com");
        persons[2] = new Person("Друган", "23566777", "univer@yandex.com");
        persons[3] = new Person("EvilBoss", "456546546", "boss@yandex.com");
        persons[4] = new Person("Anna", "+79216661666", "mylove@yandex.com");
        persons[9] = new Person("777777", "123456789", "777777@yandex.com");
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

    // поиск человека

    public static Person findByName(String searchString, Person[] persons) {
        for (Person person : persons) {
            if (person == null) continue;
            if (searchString.equals(person.name)) return person;
        }
        System.out.println("нет такого человека");
        return null;
    }

    public static Person findByPhone(String searchString, Person[] persons) {
        for (Person person : persons) {
            if (person == null) continue;
            if (searchString.equals(person.phone)) return person;
        }
        System.out.println("нет такого человека");
        return null;
    }

    public static Person findByEmail(String searchString, Person[] persons) {
        for (Person person : persons) {
            if (person == null) continue;
            if (searchString.equals(person.email)) return person;
        }
        System.out.println("нет такого человека");
        return null;
    }

    public String toString() {
        return "\n\nName: " + this.name() + "\nPhone number: " + this.phone() + "\nEmail: " +
                this.email();
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

    public String name() {
        return name;
    }

    public String phone() {
        return phone;
    }

    public String email() {
        return email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, email);
    }


}


