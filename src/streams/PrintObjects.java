package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintObjects {
    public static void main(String[] args) {

        List<String> approved = Arrays.asList(
            "Manuel",
            "Blue Pen",
            "Gomes",
            "Joseph"
        );

        System.out.println("Not good");
        for (int i = 0; i < approved.size(); i++) {
            System.out.println(approved.get(i));
        }

        System.out.println("\nSeems wrong");
        for (String name: approved) {
            System.out.println(name);
        }

        System.out.println("\nIterator :) (not yet)");
        Iterator<String> iterator = approved.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nhttps://www.youtube.com/watch?v=M6PbdJiAK84&ab_channel=Jarz");
        Stream<String> stream = approved.stream();
        stream.forEach(System.out::println);
    }
}
