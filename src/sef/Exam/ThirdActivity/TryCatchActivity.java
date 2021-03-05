package ThirdActivity;

import FirstActivity.NoNumbersException;
import FirstActivity.Person;

public class TryCatchActivity {
    public static void main(String[] args) {
        Person person = new Person("Gleb", "Mickevich", 27);
        try {
            person.setFirstName("Gle1b");
        } catch (NoNumbersException e) {
            System.out.println("You cannot put numbers in first name");
            System.err.println(e.toString());
        }

        try {
            person.setLastName("Mick1evich1");
        } catch (NoNumbersException e) {
            System.out.println("You cannot put numbers in last name");
            System.err.println(e.getMessage());
        }
    }
}
