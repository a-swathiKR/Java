public class ForEachLoop {
    public static void printForEachArray(String[] array){
        for(String name : array){
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        String[] name = new String[]{
                "Ram","Geeta","Sita","Mohan","Shyam"
        };
        //printArray(name);
        printForEachArray(name);
    }

    public static void printArray(String[] array){
        for(int i = 0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
