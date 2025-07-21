import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int sum = A + B + C;
        int average = sum / 3;

        System.out.println("Sum: " + sum);
        System.out.println("Average:  " + average);

    }
}
