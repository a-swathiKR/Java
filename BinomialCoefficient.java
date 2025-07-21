import java.util.Scanner;

public class BinomialCoefficient {

    public static int factorial(int num){

        int fact = 1;
        for (int i = 1;i <= num;i++){
            fact *= i;
        }

        return fact;
    }

    public static int binomialCoefficient(int n, int r){
        int result1 = factorial(n); //n!
        int result2 = factorial(r); //r!
        int result3 = factorial(n-r);//n-r!

        return result1 / (result2 * result3);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements and number of elements chosen");
        int n = sc.nextInt();
        int r = sc.nextInt();


        System.out.println(binomialCoefficient(n,r));
    }
}
