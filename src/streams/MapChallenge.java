package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapChallenge {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
         * Challenge:
         * 1. Convert number to binary string (6 => "110")
         * 2. Invert the string ("110" => "011")
         * 3. Convert to integer again ("011" => 3)
         */

        Function<Integer, String> convertToBinaryString = Integer::toBinaryString;
        UnaryOperator<String> invertString =
                value -> new StringBuilder(value).reverse().toString();
        Function<String, Integer> convertToInteger = value -> Integer.parseInt(value, 2);

        nums.stream()
                .map(convertToBinaryString)
                .map(invertString)
                .map(convertToInteger)
                .forEach(System.out::println);
    }
}
