import java.util.Scanner;

public class FloydsTriangle {


    public static void pattern(int n){
        int counter = 0;
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                counter++;
                System.out.print(counter + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        pattern(n);
    }
}
