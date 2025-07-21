import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to driving licence portal");
        System.out.println("Please enter your age");
        int age = sc.nextInt();

        if(age >= 18)
        {
            System.out.println("You are eligible to drive");
        }
        else
        {
            System.out.println("Beta,Cycle chalao");
        }
    }
}
