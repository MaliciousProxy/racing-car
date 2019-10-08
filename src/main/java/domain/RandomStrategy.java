package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStrategy implements Strategy {
    private static final Random RANDOM = new Random();

    @Override
    public List<Integer> createNumber(int countOfCars) {
        List<Integer> randoms = new ArrayList<>();

        for (int i = 0; i < countOfCars; i++) {
            randoms.add(RANDOM.nextInt(10));
        }

        return randoms;
    }
}
