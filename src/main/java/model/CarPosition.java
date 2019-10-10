package model;

import model.exception.WrongPositionException;

import java.util.Objects;

public class CarPosition {
    private final int position;

    public CarPosition() {
        this(0);
    }

    public CarPosition(int position) {
        checkPosition(position);
        this.position = position;
    }

    private void checkPosition(int position) {
        if (position < 0) {
            throw new WrongPositionException();
        }
    }

    public CarPosition plus() {
        return new CarPosition(position + 1);
    }

    public boolean isSamePosition(CarPosition carPosition) {
        return this.position == carPosition.position;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarPosition that = (CarPosition) o;
        return position == that.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public String toString() {
        return "CarPosition{" +
                "position=" + position +
                '}';
    }
}
