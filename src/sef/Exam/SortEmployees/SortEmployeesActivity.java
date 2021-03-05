package SortEmployees;

import FirstActivity.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployeesActivity {
    public static void main(String[] args) {
        Employee gleb = new Employee("Gleb", "Mickevich", 27, "QA Lead", "Accenture", 3000);
        Employee gleb2 = new Employee("Gleb", "Dylan", 27, "QA Lead", "Accenture", 3000);
        Employee john = new Employee("John", "Doe", 18, "QA Engineer", "Accenture", 1500);
        Employee alex = new Employee("Alex", "Smith", 30, "QA Automation Engineer", "Accenture", 2000);
        Employee alex2 = new Employee("Alex", "Bronson", 30, "QA Automation Engineer", "Accenture", 2000);
        Employee bob = new Employee("Bob", "Turn", 50, "Junior QA", "Accenture", 500);

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(gleb);
        employeeList.add(gleb2);
        employeeList.add(john);
        employeeList.add(alex);
        employeeList.add(alex2);
        employeeList.add(bob);

        // Sorting by first name and last name
        Collections.sort(employeeList);

        for(Employee e:employeeList) {
            System.out.println(e.getFirstName() + " " + e.getLastName());
        }

    }
}
