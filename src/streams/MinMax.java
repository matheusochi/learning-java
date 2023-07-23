package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Student s1 = new Student("Ana", 7.1);
        Student s2 = new Student("Gabi", 6.1);
        Student s3 = new Student("Gui", 8.1);
        Student s4 = new Student("Rafa", 10);

        List<Student> students = Arrays.asList(s1, s2, s3, s4);

        /* this next lambda can be replaced with Double.compare
         * but for the sake of the example, I'm gonna keep it the way it is.
         */
        Comparator<Student> bestGrade = (p, n) -> {
            if(p.grade > n.grade) return 1;
            if(n.grade > p.grade) return -1;
            return 0;
        };

        System.out.println(students.stream().max(bestGrade).get());
        System.out.println(students.stream().min(bestGrade).get());
    }
}
