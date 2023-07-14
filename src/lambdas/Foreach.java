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

        System.out.println("Better");
        approved.forEach((name) -> {
            System.out.println(name + "!!!");
        });
    }
}
