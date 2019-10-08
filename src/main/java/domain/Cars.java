package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cars {
    private Map<String, Car> cars = new HashMap<>();

    public Cars(List<String> carNames) {
        for (String name : carNames) {
            Car car = new Car(name);
            cars.put(name, car);
        }
    }

    public List<Car> moveCars(Strategy strategy) {
        List<Integer> r = strategy.createNumber(cars.size());
        ArrayList<Car> cars = new ArrayList<>(this.cars.values());

        for (int i = 0; i < r.size(); i++) {
            Car movedCar = cars.get(i).move(r.get(i));
            String carName = movedCar.getCarName();
            this.cars.put(carName, movedCar);
        }
        return cars;
    }

    public List<Car> getCars() {
        return new ArrayList<>(this.cars.values());
    }
}
