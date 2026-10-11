import java.util.Scanner;

public class SwapNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number and second number: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Numbers are: "+ a + " and " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Numbers after swapping = " + a + " and " + b);


    }
}
