package domain;

import java.util.Objects;

public final class Car implements Comparable<Car> {
    private static final int INIT_POSITION = 0;
    private static final int MOVING_CONDITION = 4;
    private static final int MOVE_AMOUNT = 1;

    private CarName name;
    private int position;

    public Car(String name) {
        this(new CarName(name), INIT_POSITION);
    }

    public Car(CarName name, int position) {
        this.name = name;
        this.position = position;
    }

    public Car move(int condition) {
        if (condition >= MOVING_CONDITION) {
            return new Car(name, position + MOVE_AMOUNT);
        }
        return this;
    }

    boolean isSamePosition(Car car) {
        return this.position == car.position;
    }

    public String getCarName() {
        return name.getName();
    }

    public int getPosition() {
        return position;
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(car.position, this.position);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
