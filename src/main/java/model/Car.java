package model;

import java.util.Objects;

public class Car {
    private static final int MOVE_POINT = 4;

    private final CarName carName;
    private final CarPosition position;

    public Car(final CarName carName) {
        this(carName, new CarPosition());
    }

    private Car(CarName carName, CarPosition position) {
        this.carName = carName;
        this.position = position;
    }

    public Car move(int number) {
        if (number >= MOVE_POINT) {
            return new Car(this.carName, this.position.plus());
        }
        return this;
    }

    public boolean isSamePosition(int position) {
        return this.position.isSamePosition(new CarPosition(position));
    }

    public int getPosition() {
        return position.getPosition();
    }

    public String getName() {
        return carName.getName();
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

    @Override
    public String toString() {
        return "Car{" +
                "carName=" + carName +
                ", position=" + position +
                '}';
    }
}
