package streamsmethods;

import java.util.Comparator;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 5, 2, 6, 1, 9, 6, 0, 9);
        List<Integer> sortedNumbers = numbers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedNumbers);

        List<String> names = List.of("samy", "ahmed", "wael", "mostafa", "mahmoud", "adham", "adel", "sobhy", "azoz");
        List<String> sortedNames = names.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedNames);

        List<Integer> evenNumbers = List.of(2, 4, 6, 8, 10);
        boolean allMatch = evenNumbers.stream().allMatch(number -> number % 2 == 0);
        boolean anyMatch = evenNumbers.stream().anyMatch(number -> number % 2 == 0);
        boolean noneMatch = evenNumbers.stream().noneMatch(number -> number % 2 == 0);


        System.out.println(allMatch);
        System.out.println(anyMatch);
        System.out.println(noneMatch);

    }
}
