package map;

import java.util.List;

public class MapDemo2 {
    public static void main(String[] args) {
        List<String> vehicles = List.of("car", "bus", "train", "plain", "bicycle", "metro");

        vehicles.stream()
                .map(String::length)
                .toList()
                .forEach(System.out::println);
    }
}
