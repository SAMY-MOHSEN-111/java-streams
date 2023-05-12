package parallelstreams;

import java.util.List;
import java.util.Optional;

class Student {
    String name;
    double Score;

    public Student(String name, double score) {
        this.name = name;
        Score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Score=" + Score +
                '}';
    }
}

public class Demo1 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("samy", 90),
                new Student("ahmed", 95),
                new Student("mahmoud", 94),
                new Student("wael", 98),
                new Student("mostafa", 91),
                new Student("tamer", 96),
                new Student("adham", 99)
        );

        // let's measure the performance

        /* 1. on streams */
        long start1 = System.currentTimeMillis();
        double totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.getScore();
        }
        System.out.println(totalMarks);
        System.out.println(System.currentTimeMillis() - start1);


        /* 2. using streams  */
        long start2 = System.currentTimeMillis();
        Optional<Double> reduce = students.stream().map(Student::getScore).reduce(Double::sum);
        System.out.println(reduce.get());
        System.out.println(System.currentTimeMillis() - start2);

        /* 3. using parallel streams */
        long start3 = System.currentTimeMillis();
        Optional<Double> reduce1 = students.parallelStream().map(Student::getScore).reduce(Double::sum);
        System.out.println(reduce1.get());
        System.out.println(System.currentTimeMillis() - start3);
    }
}
