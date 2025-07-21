package binarydecimalconversion;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void binary2Decimal(int binary){

        int decimal = 0,power = 0;
        while (binary > 0){
            int rem = binary % 10;
            decimal = decimal + (rem * (int)(Math.pow(2,power)));
            power++;
            binary = binary / 10;
        }

        System.out.println(decimal);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int binary = sc.nextInt();

        binary2Decimal(binary);
    }
}
