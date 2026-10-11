import java.util.Scanner;

public class TemperatureConverter {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in celsius: ");

        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9.0 / 5 + 32;

        System.out.println(celsius + " C = "+ fahrenheit+" F ");
    }
}
