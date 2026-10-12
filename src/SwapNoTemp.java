import java.util.Scanner;

public class SwapNoTemp {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number:");
        int a = sc.nextInt(); // 10

        System.out.println("enter the second number:");
        int b = sc.nextInt(); // 20

        System.out.println("Before swapping : a = " + a + " b = "+ b);

        a = a + b; // 30
        b = a - b; //10;
        a = a - b; //20;

        System.out.println("After swapping : a = " + a + " b = "+ b);


    }
}
