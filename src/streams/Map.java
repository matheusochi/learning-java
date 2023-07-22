package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> brands = Arrays.asList("BMW ", "Audi ", "Honda ");
        brands.stream()
            .map(b -> b.toUpperCase())
            .forEach(print);

        print.accept("\n");

        UnaryOperator<String> uppercase = String::toUpperCase;
        UnaryOperator<String> firstLetter = n -> n.charAt(0) + "";
        UnaryOperator<String> scream = n -> n + "!!!\n";

        brands.stream()
                .map(uppercase)
                .map(firstLetter)
                .map(scream)
                .forEach(print);
    }
}
