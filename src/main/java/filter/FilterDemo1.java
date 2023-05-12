package filter;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30);
        List<Integer> evenNumbers = new ArrayList<>();

        /* without streams */
        long start1 = System.currentTimeMillis();
        for (Integer number : numbers) {
            if (number % 2 == 0)
                evenNumbers.add(number);
        }
        for (Integer number : evenNumbers) {
            System.out.println(number);
        }
        System.out.println(System.currentTimeMillis()-start1);

        /* using streams */
        System.out.println("With Streams ");

        long start2 = System.currentTimeMillis();
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList()
                .forEach(System.out::println);
        System.out.println(System.currentTimeMillis()-start2);
    }
}
