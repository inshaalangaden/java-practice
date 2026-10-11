import java.util.Scanner;

public class CircleArea {
    static void main() {
        System.out.println("*****CIRCLE AREA*****");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextInt();

        double area = Math.PI * r * r;

        System.out.printf("Area of the circle is: %.2f%n", area);

        sc.close();
    }
}
