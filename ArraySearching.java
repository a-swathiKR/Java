import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {278,90,56,87};

        System.out.println("Enter the number to be searched");
        int n = sc.nextInt();

        int i = 0,index = -1;
        while(i < arr.length){
            if(arr[i] == n){
                index = i;
                break;
            }
            i++;
        }
        if(index != -1){
            System.out.println(n + " is found on " + index);
        }

        else {
            System.out.println(n + " is not found on " + index);
        }

    }
}
