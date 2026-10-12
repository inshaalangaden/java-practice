public class CastingDemo {
    static void main() {
        double price = 99.99;
        int roundDown = (int) price;
        System.out.println("round down = " + roundDown);

        int a = 7;
        int b = 2;
        System.out.println("wrong = " + a/ b);
        System.out.println("Right = "+ (double) a / b);

        char letter = 'A';
        int code = letter;
        System.out.println("code of the letter is "+ code);
    }
}
