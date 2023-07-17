package lambdas;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionImpl {
    public static void main(String[] args) {
        evenOrOddProcess();
    }

    public static void evenOrOddProcess() {
        Scanner sc = new Scanner(System.in);

        Function<Integer, String> evenOrOdd =
                num -> num % 2 == 0 ? "par" : "impar";

        System.out.println("Digite um número e descubra se é par ou impar!");

        Integer inputNumber = sc.nextInt();

        Function<String, String> resultText =
                value -> "Esse número é " + value;

        String resultadoFinal = evenOrOdd.andThen(resultText).apply(inputNumber);

        System.out.println(resultadoFinal);

        System.out.println("\nCaso queira sair, digite Q, caso não, digite qualquer outra letra e aperte enter");

        String prompt = sc.next();

        if(prompt.equalsIgnoreCase("q")) {
            return;
        } else {
            evenOrOddProcess();
        }
    }
}
