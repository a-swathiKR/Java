import java.util.Scanner;

public class PatternsUsingLoop {
   public static void thirdPattern(int maxRows){
       int rows = 0;
       while(rows < maxRows)
       {
           System.out.print(" ");
           int i = maxRows;
           while(i >= 0)
           {
               if(i <= rows)
               {
                   System.out.print("* ");
               }

               else{
                   System.out.print("  ");
               }
               i--;
           }
           System.out.println();
           rows++;
       }
   }
    public static void secondPattern(int maxRows)
    {
          int rows = maxRows;
          while(rows >= 0){
              System.out.print("* ");
              int i= 0;
              while(i < rows){
                  System.out.print("* ");
                  i++;
              }
              System.out.println();
              rows--;
          }
    }


    public static void firstPattern(int maxrows){
        int rows = 0;
        while(rows < maxrows){
            System.out.print("* ");
            int i = 0;
            while(i < rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows++;
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows = sc.nextInt();

        firstPattern(rows);
        secondPattern(rows);
        thirdPattern(rows);


    }
}
