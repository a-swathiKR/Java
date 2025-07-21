import java.util.Scanner;

public class InvertedPyramidNumbers {

    public static void pattern(int rows){

      for(int i = 1;i <= rows;i++){
          for(int j = 1;j <= (rows - i + 1);j++){
              System.out.print(j);
          }
          System.out.println();
      }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of rows");
        int rows = sc.nextInt();

        pattern(rows);
    }
}
