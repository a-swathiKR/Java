import java.util.Scanner;

public class Break {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter the number");
            n = sc.nextInt();

            if(n % 10 == 0){
                break;
            }

            System.out.println(n);
        }while (n > 0);

        System.out.println("You entered a number which is multiplied by 10");
    }
}
