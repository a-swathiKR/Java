import java.util.Scanner;

public class SortedArray {

    public static boolean isIncreasing(int arr[]){
        int i = 1;

        while(i < arr.length){
            if(arr[i - 1] > arr[i]){
                return false;
            }
            i++;
        }
        return true;

    }

    public static boolean isDecreasing(int arr[]){
        int i = 1;

        while(i < arr.length){
            if(arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements");
        int i = 0;
        while(i < arr.length){
            arr[i] = sc.nextInt();
            i++;
        }

        isIncreasing(arr);
        isDecreasing(arr);

        if(isIncreasing(arr) || isDecreasing(arr)){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}
