package filter;

import java.util.List;

class Product {
    private Long id;
    private String name;
    private Double price;

    public Product(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class FilterDemo4 {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product(1L, "HP Laptop", 25_000.00),
                new Product(2L, "Dell Laptop", 35_000.00),
                new Product(3L, "Lenovo Laptop", 20_000.00),
                new Product(4L, "Apple Laptop", 55_000.00),
                new Product(5L, "Acer Laptop", 32_000.00)
        );

        products.stream()
                .filter(product -> product.getPrice() >= 30_000)
                .toList()
                .forEach(System.out::println);
    }
}
