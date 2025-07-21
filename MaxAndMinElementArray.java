import java.util.Scanner;

public class MaxAndMinElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements");
        int i=0;
        while(i < arr.length){
            arr[i] = sc.nextInt();
            i++;
        }

        int j = 0,max = 0,min = 999;
        while(j < arr.length){
            if(arr[j] > max){
                max = arr[j];
            }
            if(arr[j] < min){
                min = arr[j];
            }
            j++;
        }

        System.out.println("Maximum element is " + max);
        System.out.println("Minimum element is  "+ min);

    }
}
