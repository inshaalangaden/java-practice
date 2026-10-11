import java.util.Scanner;

public class SubtractTwoNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int diff = a - b;
        System.out.println("Difference between two numbers is: "+ diff);

        sc.close();
    }
}
