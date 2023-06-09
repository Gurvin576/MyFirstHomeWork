package Lesson9.PhoneBook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PersonTest {

    Person[] persons = new Person[10];

    @BeforeAll
    void prepare () {
        persons[0] = new Person("Юля", "89210000000", "Julia@yandex.com");
        persons[1] = new Person("Сергей", "777777", "borya@yandex.com");
        persons[2] = new Person("Друган", "23566777", "univer@yandex.com");
        persons[9] = new Person("777777", "123456789", "777777@yandex.com");
    }

    @Test
    void findByNameTest() {
        Person actual = Person.findByName("777777", persons);
        Assertions.assertEquals(new Person("777777", "123456789", "777777@yandex.com"),actual);
    }

    @Test
    void findByPhoneTest() {
        Person actual = Person.findByPhone("89210000000", persons);
        Assertions.assertEquals(new Person("Юля", "89210000000", "Julia@yandex.com"),actual);
    }
    @Test
    void findByEmailTest() {
        Person actual = Person.findByEmail("univer@yandex.com", persons);
        Assertions.assertEquals(new Person("Друган", "23566777", "univer@yandex.com"),actual);
    }

    @Test
    void findByAnythingTest() {
        Person actual = Person.find("777777", persons);
        Assertions.assertEquals(new Person("Сергей", "777777", "borya@yandex.com"),actual);
    }

    @Test
    void findByNameNegativeTest() {
        Person actual = Person.find("друган", persons);
        assertNull(actual);
    }
}