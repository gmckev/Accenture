package SecondActivity;

import java.util.Scanner;

public class CalculatorImplementation {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("----------------");
            System.out.println("If you want to use calculator press - 1");
            System.err.println("If you want to exit press - 0");

            int decision = scanner.nextInt();

            if(decision==0) {
                break;
            } else {
                System.out.println("Enter first number:");
                int a = scanner.nextInt();
                System.out.println("Enter second number:");
                int b = scanner.nextInt();

                System.out.println("----------------");
                System.out.println("Select operation");
                System.out.println("----------------");
                System.out.println("Sum - press 1");
                System.out.println("Subtraction - press 2");
                System.out.println("Multiplication - press 3");
                System.out.println("Division - press 4");
                System.out.println("----------------");

                int operation = scanner.nextInt();

                switch(operation) {
                    case 1:
                        System.out.println("Sum result: " + calculator.getSum(a,b));
                        break;
                    case 2:
                        System.out.println("Subtraction result: " + calculator.getSubtraction(a,b));
                        break;
                    case 3:
                        System.out.println("Multiplication result: " + calculator.getMultiplication(a,b));
                        break;
                    case 4:
                        System.out.println("Division result: " + calculator.getDivision(a,b));
                        break;
                    default:
                        System.out.println("No such operation. Try again.");
                        break;
                }
            }

        }
    }
}
