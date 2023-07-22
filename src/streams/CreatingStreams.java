package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        String[] moreLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };

        Stream.of(moreLangs).forEach(print);
        Arrays.stream(moreLangs).forEach(print);
        Arrays.stream(moreLangs, 1, 2).forEach(print); //Lisp

        List<String> otherLangs = Arrays.asList("\nC ", "PHP ", "Kotlin\n");
        otherLangs.stream().forEach(print);
        otherLangs.parallelStream().forEach(print);

        //Stream.generate(() -> "a").forEach(print);
        //Stream.iterate(0, n -> n + 1).forEach(println);
    }
}
