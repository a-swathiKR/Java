import java.util.Scanner;

public class Recursion {

    public static long factorialIterative(int num){
        int result = 0;
        for(int i = 1;i<=num;i++);
        result += num;

        return result;
    }

    public static long factorial(int num){
        if(num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
//        long fact = factorialIterative(num);
        long fact = factorial(num);
        System.out.println(fact);
    }
}
