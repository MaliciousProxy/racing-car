package model;

public class Car {
    private final String carName;

    public Car(final String carName) {
        if (carName.length() > 5 || carName.length() <= 0) {
            throw new IllegalArgumentException();
        }
        this.carName = carName;
    }
}
