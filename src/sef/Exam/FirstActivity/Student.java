package FirstActivity;

public class Student extends Human {
    private String schoolName;

    public Student() {
        this.schoolName = "No school name";
    }

    public Student(String firstName, String lastName, int age, String schoolName) {
        super(firstName, lastName, age);
        this.schoolName = schoolName;
    }

    @Override
    void introduce() {
        System.out.println("My name is " + super.getFirstName() + " " + super.getLastName() +
                ". I study at " + this.schoolName + ".");
    }

    @Override
    public String toString() {
        return "My name is " + super.getFirstName() + " " + super.getLastName() +
                ". I study at " + this.schoolName + ".";
    }

    public String getSchoolName() {
        return schoolName;
    }
}
