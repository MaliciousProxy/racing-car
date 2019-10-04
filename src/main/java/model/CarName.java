package model;

import model.exception.CarNameLengthException;

import java.util.Objects;

public class CarName {
    private final String name;

    public CarName(final String name) {
        if (name.length() > 5 || name.length() <= 0) {
            throw new CarNameLengthException();
        }
        this.name = name;
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
