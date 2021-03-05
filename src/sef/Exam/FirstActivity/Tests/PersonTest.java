package FirstActivity.Tests;

import FirstActivity.Person;
import junit.framework.TestCase;
import org.junit.Test;

public class PersonTest extends TestCase {

    private Person person;

    protected void setUp() throws Exception {
        super.setUp();
        person = new Person("Gleb", "Mickevich", 27);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testFirstName() {
        assertEquals("Gleb", person.getFirstName());
    }

    @Test
    public void testLastName() {
        assertEquals("Mickevich", person.getLastName());
    }

    @Test
    public void testAge() {
        assertEquals(27, person.getAge());
    }
}
