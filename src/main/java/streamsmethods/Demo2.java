package streamsmethods;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long count = numbers.stream().filter(number -> number % 2 == 0).count();

        Optional<Integer> min = numbers.stream().min(Comparator.comparingInt(num -> num));
        Optional<Integer> max = numbers.stream().max(Comparator.comparingInt(num -> num));

        System.out.printf("# of even numbers is: %d%n", count);

        min.ifPresent(number -> System.out.printf("minimum number is %d%n", number));
        max.ifPresent(number -> System.out.printf("maximum number is %d%n", number));


    }
}
