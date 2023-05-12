package streamsmethods;

import java.util.List;
import java.util.Optional;

public class Demo3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Optional<Integer> reduce = numbers.stream().reduce((current, accumulated) -> current * accumulated);
        System.out.println(reduce.get());
    }
}
