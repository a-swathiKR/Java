import java.util.Scanner;

public class userinput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//object declaration
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("welcome " + name);
        System.out.println(name + " also enter you age");
        int age = sc.nextInt();
        System.out.println("Age: " + age);
    }
}
