public class GCD {

    public static void calculateGcd(int a,int b){

//        int result = Math.min(a,b);
//
//        while (result > 0){
//            if((a % result == 0) && (b % result == 0)){
//                break;
//            }
//            result--;
//        }
//
//        System.out.println(result);

        //Eucledian approach
//        while (b != a){
//            if(a > b){
//                a = a - b;
//            }
//            if(b > a){
//                b = b - a;
//            }
//        }
//        System.out.println(a);
    }

    public static int optimised(int a,int b){
        if(b == 0){
            return a;
        }

        return optimised(b,a%b);
    }
    public static void main(String[] args) {
        int a = 36;
        int b = 60;

        calculateGcd(a,b);
        System.out.println(optimised(a,b));
    }
}
