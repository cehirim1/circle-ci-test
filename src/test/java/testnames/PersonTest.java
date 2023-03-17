package testnames;

import org.example.names.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testConstructor() {

        Person testMe = new Person("James", "Smith");
        assertAll(
                ()->assertEquals("James", testMe.getFirst()),
                ()->assertEquals("Smith", testMe.getLast()),
                ()->assertNull(testMe.getTitle()),
                ()->assertSame('\u0000', testMe.getMiddle())
        );
    }

}