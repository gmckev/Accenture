package FirstActivity;

public abstract class Human {
    private String firstName;
    private String lastName;
    private int age;

    public Human() {
        this.firstName = "No name";
        this.lastName = "No surname";
    }

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    abstract void introduce();

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String name) throws NoNumbersException {
        if(name.matches(".*\\d.*")) {
            throw new NoNumbersException();
        } else {
            this.firstName = name;
        }
    }

    public void setLastName(String surname) throws NoNumbersException {
        if(surname.matches(".*\\d.*")) {
            throw new NoNumbersException();
        } else {
            this.firstName = surname;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }
}
