package map;

import java.util.ArrayList;
import java.util.List;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> vehicles = List.of("car", "bus", "train", "plain", "bicycle", "metro");
        /* without streams */
        List<String> res1 = new ArrayList<>();

        for(String vehicle : vehicles){
            res1.add(vehicle.toUpperCase());
        }

        for(String vehicle : res1){
            System.out.println(vehicle);
        }

        System.out.println("*** Using Streams ***");
        vehicles.stream()
                .map(String::toUpperCase)
                .toList()
                .forEach(System.out::println);
    }
}
