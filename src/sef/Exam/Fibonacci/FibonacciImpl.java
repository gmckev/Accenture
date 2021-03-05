package Fibonacci;

public class FibonacciImpl {
    public static void main(String[] args) {
        printFibonacci(7);
        System.out.println("");
        printFibonacci(10);
    }
    public static void printFibonacci(int number) {
        int num = number, neighbor1 = 0, neighbor2 = 1;
        System.out.print(num + " Fibonacci numbers: ");

        for (int i = 1; i <= num; ++i)
        {
            System.out.print(neighbor1 + " ");

            int sum = neighbor1 + neighbor2;
            neighbor1 = neighbor2;
            neighbor2 = sum;
        }
    }
}
