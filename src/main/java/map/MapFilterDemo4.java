package map;

import java.util.List;

class Employee {
    private Long id;
    private String name;
    private Double Salary;

    public Employee(Long id, String name, Double salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
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

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}

public class MapFilterDemo4 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1L, "samy", 1000.00),
                new Employee(2L, "samy", 2000.00),
                new Employee(3L, "samy", 3000.00),
                new Employee(4L, "samy", 4000.00),
                new Employee(5L, "samy", 5000.00),
                new Employee(6L, "samy", 6000.00),
                new Employee(7L, "samy", 7000.00),
                new Employee(8L, "samy", 8000.00),
                new Employee(9L, "samy", 9000.00),
                new Employee(10L, "samy", 10_000.00)
        );

        List<Double> salaries = employees.stream()
                .map(Employee::getSalary)
                .filter(salary -> salary >= 5000)
                .toList();

        salaries.forEach(System.out::println);
        System.gc();

    }
}
