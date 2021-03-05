package FirstActivity;

public class Person extends Human {

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }
    @Override
    void introduce() {
        System.out.println("My name is " + super.getFirstName() + " " + super.getLastName() + ". I am " + super.getAge() + " years old.");
    }

    @Override
    public String toString() {
        return "My name is " + super.getFirstName() + " " + super.getLastName() + ". I am " + super.getAge() + " years old.";
    }
}
