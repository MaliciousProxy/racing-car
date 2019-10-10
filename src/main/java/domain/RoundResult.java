package domain;

import java.util.Objects;

public class RoundResult {
    private final int round;
    private final Cars cars;

    public RoundResult(int round, Cars cars) {
        this.round = round;
        this.cars = cars;
    }

    public Cars getCars() {
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
