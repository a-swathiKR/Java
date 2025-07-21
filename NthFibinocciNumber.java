import java.util.Scanner;

public class NthFibinocciNumber {

    public static int fibannoci(int n){

        if(n == 1){
            return 1;
        }

        else if(n == 2){
            return 1;
        }

        else {
            int a = 1,b = 1;
           for (int i = 3;i <= n;i++){
               int temp = a + b;
               a = b;
               b = temp;
           }
           return b;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int nthNumber = fibannoci(n);
        System.out.println(nthNumber);

    }
}
