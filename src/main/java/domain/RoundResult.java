package domain;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoundResult that = (RoundResult) o;
        return round == that.round;
    }

    @Override
    public int hashCode() {
        return Objects.hash(round);
    }
}
