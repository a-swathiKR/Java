package in.aswathi.filterandreduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple","banana","mango","cherry","coconut");
        System.out.println(fruits.size());

        System.out.println("Printing fruits normally");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Printing fruits using streams");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });

        System.out.println("using filter");
        fruits.stream()
                .filter(fruit ->fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));

    }

}
