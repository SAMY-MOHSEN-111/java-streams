package filter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FilterDemo3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("sky", null, "cat", "bat", "mat", "hat", null, null);
        words.stream()
                .filter(Objects::nonNull)
                .toList()
                .forEach(System.out::println);
    }
}
