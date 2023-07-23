package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> sum = (acc, n) -> acc + n;

        Integer result = nums.stream()
                .reduce(sum)
                .get();
        System.out.println(result);

        Integer result2 = nums.parallelStream().reduce(100, sum);
        System.out.println(result2);

        nums.stream()
                .filter(n -> n > 10)
                .reduce(sum)
                .ifPresent(System.out::println); // nada

        nums.stream()
                .filter(n -> n > 2)
                .reduce(sum)
                .ifPresent(System.out::println); // 42
    }
}
