package filter;

import java.util.List;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> names = List.of("samy", "mostafa", "ahmed", "mahmoud", "youssef", "nelson");
        names.stream()
                .filter(str -> str.length() > 4 && str.length() <= 8)
                .toList()
                .forEach(System.out::println);
    }
}
