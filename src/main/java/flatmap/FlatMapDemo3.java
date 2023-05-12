package flatmap;

import java.util.Collection;
import java.util.List;

class Student {
    private Long id;
    private String name;
    private Double grade;

    public Student(Long id, String name, Double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

public class FlatMapDemo3 {
    public static void main(String[] args) {
        List<List<Student>> departments = List.of(
                List.of(
                        new Student(1L, "Samy Mohsen", 80.00),
                        new Student(2L, "Ahmed Mostafa", 90.00)
                ),
                List.of(
                        new Student(3L, "Ahmed Wael", 99.00),
                        new Student(4L, "Mohamed Abd El aziz", 99.00)
                ),
                List.of(
                        new Student(5L, "Mostafa Tarek", 80.00),
                        new Student(6L, "Mostafa Tamer", 80.00),
                        new Student(7L, "Youssef Hammam", 80.00),
                        new Student(8L, "Adham", 80.00),
                        new Student(9L, "Ahmed Adel", 80.00),
                        new Student(10L, "Mahmoud Osama", 80.00),
                        new Student(11L, "Ahmed Sobhy", 80.00)
                )
        );

        departments.stream()
                .flatMap(Collection::stream)
                .map(Student::getName)
                .toList()
                .forEach(System.out::println);
    }
}
