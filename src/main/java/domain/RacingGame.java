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

    public RoundResults play(Strategy strategy, RoundResults roundResults) {
        for (int i = 1; i <= round; i++) {
            cars.moveCars(strategy);
            roundResults.addRoundResult(i, cars);
        }
        return roundResults;
    }

    public List<String> findWinners() {
        List<Car> sortedCars = cars.getCars();
        sortedCars.sort(null);

        Car winningCar = getWinningCar(sortedCars);
        return sortedCars.stream()
                .filter(c -> c.isSamePosition(winningCar))
                .map(Car::getCarName)
                .collect(Collectors.toList());
    }

    private Car getWinningCar(List<Car> sortedCars) {
        return sortedCars.get(0);
    }


}
