import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number a = ");
        double a = sc.nextDouble();

        System.out.print("Enter the second number b = ");
        double b = sc.nextDouble();

        double add = a + b;
        double subtr = a - b;
        double mult = a * b;
        double div = a / b;
        double rem = a % b;

        System.out.println("Sum of two numbers = "+add);
        System.out.println("Difference of two numbers = "+subtr);
        System.out.println("Product of two numbers = "+mult);
        System.out.printf("Division of two numbers = %.2f%n",div);
        System.out.printf("Remainder of two numbers = %.2f%n",rem);

        sc.close();

    }
}
