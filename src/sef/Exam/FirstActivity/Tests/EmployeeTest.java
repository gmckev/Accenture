package FirstActivity.Tests;

import FirstActivity.Employee;
import junit.framework.TestCase;
import org.junit.Test;

public class EmployeeTest extends TestCase {

    private Employee employee;

    protected void setUp() throws Exception {
        super.setUp();
        employee = new Employee("Gleb", "Mickevich", 27, "QA Lead", "Accenture", 3000);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testFirstName() {
        assertEquals("Gleb", employee.getFirstName());
    }

    @Test
    public void testLastName() {
        assertEquals("Mickevich", employee.getLastName());
    }

    @Test
    public void testAge() {
        assertEquals(27, employee.getAge());
    }

    @Test
    public void testSalary() {
        assertEquals(3000, employee.getSalary());
    }

    @Test
    public void testJobTitle() {
        assertEquals("QA Lead", employee.getJobTitle());
    }

    @Test
    public void testCompany() {
        assertEquals("Accenture", employee.getCompany());
    }

}
