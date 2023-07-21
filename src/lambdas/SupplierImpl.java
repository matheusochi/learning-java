package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierImpl {
    public static void main(String[] args) {
        Supplier<List<String>> aList =
                () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println(aList.get());
    }
}
