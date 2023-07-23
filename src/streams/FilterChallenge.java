package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterChallenge {
    // Criar duas expressoes lambda, ambas para filtrar
    // map no final

    public static void main(String[] args) {
        Car c1 = new Car("Chevrolet", "Monza", "branco", 1996, 200134.6);
        Car c2 = new Car("Volkswagen", "Gol", "cinza", 2006, 142879.2);
        Car c3 = new Car("Chevrolet", "Opala", "prata", 1986, 250764.8);
        Car c4 = new Car("Honda", "Civic", "preto", 2023, 0.0);
        Car c5 = new Car("Mitsubishi", "Lancer", "amarelo", 2007, 592729.3);
        Car c6 = new Car("Hyundai", "HB20", "preto", 2018, 85739.0);
        Car c7 = new Car("Fiat", "Uno", "branco", 2015, 120743.2);
        Car c8 = new Car("Volkswagen", "Polo", "prata", 2020, 93000.0);

        Predicate<Car> isRecent = car -> car.year > 2013;
        Predicate<Car> isBlack = car -> car.color.equals("preto");

        List<Car> cars = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8);
        cars.stream()
                .filter(isRecent)
                .filter(isBlack)
                .map(car -> "O carro " + car.model + " bate com seus filtros!")
                .forEach(System.out::println);

    }
}
