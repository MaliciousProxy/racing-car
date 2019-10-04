package model;

import java.util.Objects;

public class Car {
    private final String carName;
    private int position;

    public Car(final String carName) {
        this(carName, 0);
    }

    private Car(String carName, int position) {
        if (carName.length() > 5 || carName.length() <= 0) {
            throw new IllegalArgumentException();
        }
        this.carName = carName;
        this.position = position;
    }

    public Car move(int number) {
        if (number >= 4) {
            return new Car(this.carName, ++this.position);
        }
        return this;
    }

    public boolean isSamePosition(int position) {
        return this.position == position;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return carName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carName.equals(car.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }
}
