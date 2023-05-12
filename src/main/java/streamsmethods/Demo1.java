package streamsmethods;

/*

 *** non terminal methods ***
 distinct()
 limit()
 sorted()

 *** terminal methods ***
 count()
 forEach()
 min()
 max()
 reduce()
 AllMatch()
 AnyMatch()
 NonMatch()
 findAny()
 findOne()
 */


import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<String> vehicles = List.of("bus", "car", "bicycle", "bus", "car", "car", "bike");

        List<String> distinctVehicles = vehicles.stream()
                .distinct()
                .toList();
        System.out.println(distinctVehicles);

        long vehiclesCount = vehicles.stream().distinct().count();
        System.out.println(vehiclesCount);

        List<String> limitedVehicles = vehicles.stream().limit(3).toList();
        System.out.println(limitedVehicles);


    }
}
