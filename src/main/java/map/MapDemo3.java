package map;

import java.util.List;

public class MapDemo3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> multiplyiedList = numbers.stream()
                .map(number -> number * 5)
                .toList();

        multiplyiedList.forEach(System.out::println);
    }
}
