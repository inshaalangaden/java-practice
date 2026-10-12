import java.util.Scanner;

public class VotingCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age below: ");
        int age = sc.nextInt();

        System.out.println("Do you have voter ID?");
        boolean id = sc.nextBoolean();

        boolean canVote = age >= 18;
        if(canVote && id){
            System.out.println("Congratulations, You can vote!");
        }else{
            System.out.println("Sorry, You can not vote");
        }
    }
}
