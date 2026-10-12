import java.util.Scanner;

public class EvenOdd {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt();

        boolean evenOdd = number % 2 == 0;

        if (evenOdd){
            System.out.println("Entered number is even");
        }else{
            System.out.println("Entered number is odd");
        }
    }
}
