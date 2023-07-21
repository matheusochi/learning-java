package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorImpl {
    public static void main(String[] args) {
        BinaryOperator<Double> average =
                (Double n1, Double n2) -> (n1 + n2) / 2;
        System.out.println(average.apply(9.8, 5.7));

        /*
        BiFunction<Double, Double, String> result = (n1, n2) -> {
            double notaFinal = ((n1 + n2) / 2);
            return notaFinal  >= 7 ? "Aprovado" : "Reprovado";
        };


        System.out.println(result.apply(9.7, 4.1));

        */

        Function<Double, String> result =
                m -> m >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(average.andThen(result).apply(9.7, 4.1));
    }
}
