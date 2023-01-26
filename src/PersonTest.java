import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1;


    @BeforeEach
    void setUp()  {
        p1 = new Person("John", "Smith", "000001", "Mr.", 2000);

    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        p1.setFirstName("Mike");
        assertEquals("Mike", p1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        p1.setLastName("Jeff");
        assertEquals("Jeff", p1.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setID() {
        p1.setID("000002");
        assertEquals("000002", p1.getID());

    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        p1.setTitle("Lord");
        assertEquals("Lord", p1.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setBirthYear() {
        p1.setBirthYear(1990);
        assertEquals(1990, p1.getBirthYear());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("Person{firstName='John', lastName='Smith', ID='000001', title='Mr.', birthYear=2000}", p1.toString());
    }

    @org.junit.jupiter.api.Test
    void toCVSRecord() {
        assertEquals("000001,John, Smith, Mr., 2000\n", p1.toCVSRecord());
    }
}