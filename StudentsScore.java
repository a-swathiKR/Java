import java.util.Scanner;

public class StudentsScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();

        String category = marks > 80 ? "High" : (marks > 50 ?"Moderate" : "Low");
        System.out.println(category);



    }
}
