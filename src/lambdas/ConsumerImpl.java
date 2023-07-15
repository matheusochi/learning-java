package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpl {
    public static void main(String[] args) {
        Consumer<Product> print = p -> System.out.println(p.name + ", " + p.getFinalPrice());

        Product product1 = new Product("Patinete", 200, 0);
        Product product2 = new Product("Fraldas", 25000, 0);
        Product product3 = new Product("Fone de ouvido", 100, 0);
        Product product4 = new Product("Filme fotografico", 360.99, 20);

        List<Product> productList = Arrays.asList(product1, product2, product3, product4);
        System.out.println("Produtos selecionados:");
        productList.forEach(print);
    }
}
