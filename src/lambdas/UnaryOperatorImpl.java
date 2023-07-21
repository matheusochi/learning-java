package lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorImpl {
    public static void main(String[] args) {
        UnaryOperator<Integer> plusTwo = n -> n + 2;
        UnaryOperator<Integer> timesTwo = n -> n * 2;
        UnaryOperator<Integer> square = n -> n * n;

        int result = plusTwo
                .andThen(timesTwo)
                .andThen(square)
                .apply(0);
        System.out.println(result);

        int result2 = square
                .compose(timesTwo)
                .compose(plusTwo)
                .apply(2);

        System.out.println(result2);
    }
}
