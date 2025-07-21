import java.util.Scanner;

public class PriceAndBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of each item");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float totalCost = pencil + pen + eraser;

        float newCost = totalCost + (0.18f * totalCost);
        System.out.println("Total cost : " + totalCost);

        //int $ = 24;


    }

}
