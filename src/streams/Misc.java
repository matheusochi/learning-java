package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * This one is for adding some other methods that have not been used throughout the course, but
 * that doesn't mean I'm using ALL other methods from stream api. I'm using the common ones here.
 * I'm assuming that if I need to create a specific solution in the future, I'm gonna search
 * the methods that meet my need.
 */
public class Misc {
    public static void main(String[] args) {
        Student s1 = new Student("Ana", 7.1);
        Student s2 = new Student("Gabi", 6.1);
        Student s3 = new Student("Gui", 8.1);
        Student s4 = new Student("Rafa", 10);
        Student s5 = new Student("Lucas", 5.3);
        Student s6 = new Student("Jose", 8.5);
        Student s7 = new Student("Bia", 9.24);
        Student s8 = new Student("Will", 3.5);
        Student s9 = new Student("Will", 3.5);

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9);

        System.out.println("distinct");
        students.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        students.stream()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\ntakeWhile");
        students.stream()
                .takeWhile(s -> s.grade >= 7)
                .forEach(System.out::println);
    }
}
