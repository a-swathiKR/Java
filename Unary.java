public class Unary {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        int z = -y;
        System.out.println(y);
        System.out.println(z);

        int a = 5;
        System.out.println(++a);
        System.out.println(a);

        System.out.println(a++);
        System.out.println(a);

        int b = 5;
        System.out.println(--b);
        System.out.println(b);

        System.out.println(b++);
        System.out.println(b);

    }
}
