package lambdas;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LambdaChallenge {
    public static void main(String[] args) {
        Product p = new Product("iPad", 323509.89, 100.0);

        UnaryOperator<Double> sumTaxes = price -> {
            if(price < 2500) return price;
            return price + (price * (8.5 / 100));
        };

        UnaryOperator<Double> sumDeliveryCost = price -> {
            if(price < 3000) return price + 50;
            return price + 100;
        };

        Function<Double, String> getFormattedValue =
                value -> new DecimalFormat("#,##0.00").format(value);

        Function<String, String> addCurrency = value -> "R$" + value;

        String result = sumTaxes
                .andThen(sumDeliveryCost)
                .andThen(getFormattedValue)
                .andThen(addCurrency)
                .apply(p.getFinalPrice());

        System.out.println(result);
    }
}
