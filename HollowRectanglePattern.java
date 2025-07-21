import java.util.Scanner;

public class HollowRectanglePattern {

    public static void hollowRectangle(int totalRows,int totalColumns){

              for(int i = 1;i <= totalRows;i++){
                  for (int j = 1;j <= totalColumns;j++){
                      if(i == 1 || j == 1 || i == totalRows || j == totalColumns){
                          System.out.print("*");
                      }
                      else {
                          System.out.print(" ");
                      }
                  }
                  System.out.println();
              }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of rows and columns");
        int totalRows = sc.nextInt();
        int totalColumns = sc.nextInt();

        hollowRectangle(totalRows,totalColumns);
    }
}
