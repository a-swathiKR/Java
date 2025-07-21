import java.util.Scanner;

public class InvertedAndRotatedHalfPyramid {

   public static void invertedAndRotated(int n){

       //spaces
       for(int i = 1;i <= n;i++){
           for (int j = 1; j <= (n - i);j++){
               System.out.print(" ");
           }

       //stars
           for (int j = 1; j <= i;j++){
               System.out.print("*");
           }

           System.out.println();
       }

   }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of rows");
        int n = sc.nextInt();


        invertedAndRotated(n);

    }
}
