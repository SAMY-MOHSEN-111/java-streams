package flatmap;

import java.util.List;

public class FlatMapDemo1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /*numbers.stream()
                .map(number -> number + 1)
                .toList()
                .forEach(System.out::println);*/

        List<List<Integer>> complexStructure = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6),
                List.of(7, 8),
                List.of(9, 10)
        );

        List<Integer> processedNumbers = complexStructure.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(processedNumbers);
    }
}
