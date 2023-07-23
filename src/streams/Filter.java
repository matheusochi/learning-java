package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Student s1 = new Student("Ana", 7.8);
        Student s2 = new Student("Bia", 5.8);
        Student s3 = new Student("Dani", 9.8);
        Student s4 = new Student("Gui", 6.3);
        Student s5 = new Student("Maria", 7.1);
        Student s6 = new Student("Joel", 8.8);

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6);

        Predicate<Student> approved = student -> student.grade >= 7;

        students.stream()
                .filter(approved)
                .map(student -> "Parabéns " + student.name + "! Você foi aprovado!")
                .forEach(System.out::println);

    }
}
