public class StringFormat {
    public static void main(String[] args) {
        String name = "Sandeep";
        int marks = 45765;
        System.out.println("Hello, "+ name + "Your  marks are " + marks);

        System.out.printf("Hello %-10S Your  marks are : %0,5d ",name,marks);
    }
}
