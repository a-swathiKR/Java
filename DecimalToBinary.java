package binarydecimalconversion;

import java.util.Scanner;

public class DecimalToBinary {

       public static void decimalToBinary(int num){
           int power = 0;
           int binary = 0;
           while(num > 0){
               int rem = num % 2;
               binary = binary + (rem * (int) (Math.pow(10,power)));
               power++;
               num = num / 2;
           }

           System.out.println(binary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        decimalToBinary(num);
    }
}
