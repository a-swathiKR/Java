import java.util.Scanner;

public class MinimumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int min = num1 < num2 ? num1 : num2;
        System.out.println(min + " is the minimum number");
    }

}
