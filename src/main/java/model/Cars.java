package model;

import model.exception.DuplicatedCarNameException;

import java.util.*;
import java.util.stream.Collectors;

public class Cars {
    private List<Car> cars;

    public Cars(final List<Car> cars) {
        if (cars.size() != new HashSet<>(cars).size()) {
            throw new DuplicatedCarNameException();
        }
        this.cars = cars;
    }

    public Cars moveCars(List<Integer> randomNumbers) {
        List<Car> movedCars = new ArrayList<>();

        for (int i = 0; i < randomNumbers.size(); i++) {
            movedCars.add(cars.get(i).move(randomNumbers.get(i)));
        }

        return new Cars(movedCars);
    }

    public List<Car> getWinners() {
        int maxPosition = cars.stream().map(Car::getPosition)
                .max(Integer::compareTo)
                .orElse(-1);

        return cars.stream()
                .filter(car -> car.isSamePosition(maxPosition))
                .collect(Collectors.toList());
    }

    public int getSize() {
        return cars.size();
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}
