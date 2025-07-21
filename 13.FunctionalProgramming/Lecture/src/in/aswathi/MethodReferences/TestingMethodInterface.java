package in.aswathi.MethodReferences;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingMethodInterface {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,10,4,5);

        numbers.stream()
                .filter(number->number % 2 == 1)
                .forEach(System.out::println);

       int newSum2 = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.printf("\nResult is %d",newSum2);
}


}
