package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    private final static Random RANDOM = new Random();
    private final static int MAX_BOUND = 10;

    public static List<Integer> generateRandomNumber(int countOfCars) {
        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < countOfCars; i++) {
            randomNumbers.add(RANDOM.nextInt(MAX_BOUND));
        }

        return randomNumbers;
    }
}
