import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

//        int greaterNumber;
//        if(num1 > num2){
//            greaterNumber = num1;
//
//        }
//        else {
//            greaterNumber = num2;
//
//        }
//
//        System.out.println(greaterNumber + " is the gratest");

        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the greatest");
    }
}
