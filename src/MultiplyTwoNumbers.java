import java.util.Scanner;

public class MultiplyTwoNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int product = a * b;
        System.out.println("Product of two numbers is: "+ product);

        sc.close();
    }
}
