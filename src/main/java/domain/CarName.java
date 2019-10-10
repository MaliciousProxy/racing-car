package domain;

import java.util.Objects;

public final class CarName {
    private static final int MIN_LENGTH = 0;
    private static final int MAX_LENGTH = 5;

    private final String name;

    public CarName(final String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if (Objects.isNull(name) || validateNameLength(name)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean validateNameLength(String name) {
        return name.length() == MIN_LENGTH || name.length() > MAX_LENGTH;
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
