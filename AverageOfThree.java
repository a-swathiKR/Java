import java.util.Scanner;

public class AverageOfThree {

    public static int average(int a,int b,int c){
        int sum =  a + b + c;

        return sum / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println(average(num1,num2,num3));

    }
}
