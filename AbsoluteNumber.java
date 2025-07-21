import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        int output = num < 0 ? Math.abs(num) : num;
        System.out.println(output);
    }
}
