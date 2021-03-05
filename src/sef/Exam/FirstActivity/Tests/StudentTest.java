package FirstActivity.Tests;

import FirstActivity.Student;
import junit.framework.TestCase;
import org.junit.Test;

public class StudentTest extends TestCase {

    private Student student;

    protected void setUp() throws Exception {
        super.setUp();
        student = new Student("Gleb", "Mickevich", 27, "RTU");
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testFirstName() {
        assertEquals("Gleb", student.getFirstName());
    }

    @Test
    public void testLastName() {
        assertEquals("Mickevich", student.getLastName());
    }

    @Test
    public void testAge() {
        assertEquals(27, student.getAge());
    }

    @Test
    public void testSchoolName() {
        assertEquals("RTU", student.getSchoolName());
    }
}
