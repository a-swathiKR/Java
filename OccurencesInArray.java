import java.util.Scanner;

public class OccurencesInArray {
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

        System.out.println("Enter the element");
        int n = sc.nextInt();

        int j = 0,count = 0;
        while(j < arr.length){
            if(arr[j] == n){
                count++;
            }
            j++;
        }
        System.out.println("No of occurences of " + n + " is " + count);



    }
}
