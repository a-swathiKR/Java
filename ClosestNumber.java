public class ClosestNumber {

    public static void closestNumber(int n,int m){
        int temp1 = n,temp2 = n;
        int count1 = 0,count2 = 0;
        int inc,dec;

        while (true){
            if(temp1 % m == 0){
                inc = temp1;
                break;
            }

            count1++;
            temp1++;
        }
        while (true){
            if(temp2 % m == 0){
                dec = temp2;
                break;
            }

            count2++;
            temp2--;
        }

        if(count1 < count2){
            System.out.println(inc);
        } else if (count1 > count2) {
            System.out.println(dec);

        }else {
            System.out.println(Math.abs(inc) > Math.abs(dec) ? inc : dec);
        }
    }
    public static void main(String[] args) {

        int n = -15;
        int m = 6;

        closestNumber(n,m);
    }
}
