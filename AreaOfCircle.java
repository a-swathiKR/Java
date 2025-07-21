import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int r = sc.nextInt();

        int area =  (int)((int) Math.PI * Math.pow(r,2));
        System.out.println(area);

//        char ch = 'a';
//        int num = ch;
//        System.out.println(num);
    }
}
