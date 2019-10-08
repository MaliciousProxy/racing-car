package domain;

import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {
    private Cars cars;
    private int round;

    public RacingGame(Cars cars, int round) {
        this.cars = cars;
        this.round = round;
    }

    public RoundResults play(Strategy strategy) {
        RoundResults roundResults = new RoundResults();

        for (int i = 1; i <= round; i++) {
            roundResults.addRoundResult(i, cars.moveCars(strategy));
        }
        return roundResults;
    }

    public List<String> findWinner() {
        List<Car> sortedCars = cars.getCars();
        sortedCars.sort(null);

        Car car = sortedCars.get(0);
        return sortedCars.stream()
                .filter(c -> c.isSamePosition(car))
                .map(Car::getCarName)
                .collect(Collectors.toList());
    }
}
