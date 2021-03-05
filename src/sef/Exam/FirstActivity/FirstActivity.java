package FirstActivity;

import java.util.*;

public class FirstActivity {
    public static void main(String[] args) {
        Employee gleb = new Employee("Gleb", "Mickevich", 27, "QA Lead", "Accenture", 3000);
        Employee john = new Employee("John", "Doe", 18, "QA Engineer", "Accenture", 1500);
        Employee alex = new Employee("Alex", "Smith", 30, "QA Automation Engineer", "Accenture", 2000);
        Employee bob = new Employee("Bob", "Turn", 50, "Junior QA", "Accenture", 500);

        List<Employee> salaryList = new ArrayList<>();

        salaryList.add(gleb);
        salaryList.add(john);
        salaryList.add(alex);
        salaryList.add(bob);

        // Sort by salary
        salaryList.sort(new SalarySorter().reversed());

        for(Employee e:salaryList) {
            System.out.println(e.getFirstName() + " " + e.getSalary());
        }
    }
}
