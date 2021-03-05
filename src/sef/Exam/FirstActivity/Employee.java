package FirstActivity;

public class Employee extends Human implements Comparable<Employee> {
    private String jobTitle;
    private String company;
    private int salary;

    public Employee() {
        this.jobTitle = "No title";
        this.company = "No company";
        this.salary = 0;
    }

    public Employee(String jobTitle, String company, int salary) {
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.company = company;
    }

    public Employee(String firstName, String lastName, int age, String jobTitle, String company, int salary) {
        super(firstName, lastName, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    @Override
    public void introduce() {
        System.out.println("My name is " + super.getFirstName() + " " + super.getLastName() +
                ". I am " + super.getAge() + " years old." + " I work as " + this.jobTitle + " in a company " + this.company + ".");
    }
    @Override
    public String toString() {

        return "My name is " + super.getFirstName() + " " + super.getLastName() +
                ". I am " + super.getAge() + " years old." + " I work as " + this.jobTitle + " in a company " + this.company + ".";
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public int compareTo(Employee employee) {
        return (super.getFirstName() + super.getLastName()).compareTo(employee.getFirstName() + employee.getLastName());
    }
}
