package flatmap;

import java.util.Collection;
import java.util.List;

public class FlatMapDemo2 {
    public static void main(String[] args) {

        List<List<String>> teams = List.of(
                List.of("Ahmed Mostafa", "Samy", "Al Hassan"),
                List.of("Adham", "Ahmed Adel", "Mostafa Tarek"),
                List.of("Youssef", "Mostafa Tamer", "Ahmed Wael")
        );

        List<String> players = teams.stream()
                .flatMap(Collection::stream)
                .toList();
        players.forEach(System.out::println);
    }
}
