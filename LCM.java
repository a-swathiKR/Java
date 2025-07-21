public class LCM {

    public static int calculateLCM(int a,int b){
        int g = Math.max(a,b);
        int s = Math.min(a, b);

        for(int i=g;i <= a*b;i+=g){
            if(i % s == 0){
                return i;
            }
        }
        return a * b;
    }
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(calculateLCM(a,b));
    }
}
