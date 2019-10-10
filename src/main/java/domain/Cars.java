package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {
    private List<Car> cars = new ArrayList<>();

    public Cars(List<String> carNames) {
        validate(carNames);

        for (String name : carNames) {
            cars.add(new Car(name));
        }
    }

    private void validate(List<String> carNames) {
        Set<String> unDuplicatedCarNames = new HashSet<>(carNames);
        if (carNames.size() != unDuplicatedCarNames.size()) {
            throw new IllegalArgumentException("차 이름은 중복될 수 없습니다.");
        }
    }

    public void moveCars(Strategy strategy) {
        int countOfCars = cars.size();
        List<Integer> movingConditions = strategy.createNumbers(countOfCars);
        List<Car> movedCars = new ArrayList<>();

        for (int i = 0; i < countOfCars; i++) {
            Car movedCar = cars.get(i).move(movingConditions.get(i));
            movedCars.add(movedCar);
        }

        this.cars = movedCars;
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }
}
