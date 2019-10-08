package domain;

import java.util.List;

public class RoundResult {
    private final int round;
    private final List<Car> cars;

    public RoundResult(int round, List<Car> cars) {
        this.round = round;
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }
}
