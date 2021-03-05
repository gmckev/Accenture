package FileSaveActivity;

import FirstActivity.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSaveActivity {
    public static void main(String[] args) {
        Employee gleb = new Employee("Gleb", "Mickevich", 27, "QA Lead", "Accenture", 3000);
        Employee john = new Employee("John", "Doe", 18, "QA Engineer", "Accenture", 1500);
        Employee alex = new Employee("Alex", "Smith", 30, "QA Automation Engineer", "Accenture", 2000);
        Employee bob = new Employee("Bob", "Turn", 50, "Junior QA", "Accenture", 500);

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(gleb);
        employeeList.add(john);
        employeeList.add(alex);
        employeeList.add(bob);

        try {
            saveListIntoFile("Employees.txt", employeeList);
            readFromFile("Employees.txt");
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }
    }

    public static void saveListIntoFile(String fileName, List<Employee> employeeList) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
        for (Employee employee : employeeList)
            pw.println(employee);
        pw.close();
    }

    public static void readFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();
    }

}
