import java.util.Scanner;

public class TernaryOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        boolean result = num % 2 == 0 ? true : false;
        if(true){
            System.out.println(num + " is an even number");
        }
        else{
            System.out.println(num + " is not an even number");
        }

    }
}
