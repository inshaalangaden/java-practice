import java.util.Scanner;

public class AddTwoNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum of the two numbers is: " + sum);

        sc.close();
    }
}
