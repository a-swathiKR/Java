import java.util.Scanner;


public class Return {
    public static void greet()
    {
        System.out.println("Welcome to calculator");
    }

    public static int userInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number");
        int num = sc.nextInt();

        return num;
    }
    public static void sum(int num1,int num2){//num1 and num2 - parameters
        int sum = num1 + num2;
        System.out.println(sum);
    }

    public static void sub(int num1,int num2){
        int sub = num1 - num2;
        System.out.println(sub);

    }

    public static void multiply(int num1,int num2){
        int multiply = num1 * num2;
        System.out.println(multiply);
    }

    public static void divide(int num1,int num2){
        int divide = num1 / num2;
        System.out.println(divide);;
    }

    public static void main(String[] args) {

        greet();
        int num1 = userInput();
        int num2 = userInput();

        sum(num1,num2);//num1 and num2 - arguments
        sub(num1,num2);
        multiply(num1,num2);
        divide(num1,num2);

    }
}
