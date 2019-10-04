package model;

import model.exception.CarNameLengthException;

import java.util.Objects;

public class CarName {
    private static final int MIN_NAME_LENGTH = 0;
    private static final int MAX_NAME_LENGTH = 5;

    private final String name;

    public CarName(final String name) {
        checkNameLength(name);
        this.name = name;
    }

    private void checkNameLength(String name) {
        if (name.length() > MAX_NAME_LENGTH || name.length() <= MIN_NAME_LENGTH) {
            throw new CarNameLengthException();
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName = (CarName) o;
        return name.equals(carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "CarName{" +
                "name='" + name + '\'' +
                '}';
    }
}
