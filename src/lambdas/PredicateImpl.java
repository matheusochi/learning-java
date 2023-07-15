package lambdas;

import java.util.function.Predicate;

public class PredicateImpl {
    public static void main(String[] args) {
        Predicate<Product> hasDiscount = (product -> product.discount > 0);

        Product product = new Product("Skate", 2400, 0);
        System.out.println(hasDiscount.test(product));

        Product product1 = new Product("Notebook", 5789,2);
        System.out.println(hasDiscount.test(product1));
    }
}
