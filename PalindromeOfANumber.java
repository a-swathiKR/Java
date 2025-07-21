import java.util.Scanner;

public class PalindromeOfANumber {

    public static boolean isPalindrome(int num){
        int reverse = 0;
        int temp = num;

        while (num > 0){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }

        if(temp == reverse){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println(num + " is Palindrome");
        }
        else {
            System.out.println(num + " is not Palindrome");
        }
    }
}
