import java.util.Scanner;

public class SumAndAverageArray {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no of rows and colomns");
//        int row = sc.nextInt();
//        int column = sc.nextInt();
//
//        int[][] arr = new int[row][column];
//
//        System.out.println("Enter the elements");
//        int i = 0;
//        while(i < arr.length){
//            int j = 0;
//            while(j < arr[i].length){
//                 arr[i][j] = sc.nextInt();
//                 j++;
//            }
//            i++;
//        }
//
//        int m = 0,sum = 0,count = 0;
//        while(m < arr.length){
//            int n = 0;
//            while(n < arr[m].length){
//                sum += arr[m][n];
//                count++;
//                n++;
//            }
//            m++;
//        }
//        int average = sum / count;
//        System.out.println("Sum is : " + sum);
//        System.out.println("Average is : " + average);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] arr = new int[size];

        int i = 0;
        while(i < arr.length){
            arr[i] = sc.nextInt();
            i++;
        }

        int j = 0,sum=0;
        while(j < arr.length){
            sum += arr[j];
            j++;
        }
        int average = sum / arr.length;

        System.out.println("Sum is : " + sum);
        System.out.println("Average is : " + average);
    }
    }


