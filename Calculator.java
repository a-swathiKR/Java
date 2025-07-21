import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers");
        int num1 = sc.nextInt();
        int num2  = sc.nextInt();

        System.out.println("Enter the operation");
        System.out.println("1.Addition\n2.Subtraction\n3.Mutiplication\n4.Division\n5.Modulo");
        int operation = sc.nextInt();

        switch (operation){
            case 1 :
                System.out.println("Sum is " + (num1 + num2));
                break;

            case 2 :
                System.out.println("Difference is " + ((num1 > num2) ? (num1 - num2) : (num2 - num1)));
                break;

            case 3 :
                System.out.println("Multiplication is  " + (num1 * num2));
                break;

            case 4 :
                System.out.println("Division is " + ((int)(num1 / num2)));
                break;

            case 5 :
                System.out.println("Modulo is " + ((int)(num1 % num2)));
                break;
        }

    }
}
