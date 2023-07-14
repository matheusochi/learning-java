package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> approved = Arrays
                .asList("Joseph", "Martinhos", "Carlotas", "Rafaelo");

        System.out.println("Old way");
        for(String name: approved) {
            System.out.println(name);
        }

        System.out.println("\nBetter");
        approved.forEach((name) -> {
            System.out.println(name + "!!!");
        });

        System.out.println("\nMethod reference");
        approved.forEach(System.out::println);

        System.out.println("\nUsing custom method");
        approved.forEach((name) -> print(name));

        System.out.println("\nUsing custom method + method reference");
        approved.forEach(Foreach::print);
    }

    static void print(String nome) {
        System.out.println("Oi! Meu nome é " + nome);
    }
}
