import model.Car;
import model.CarName;
import model.Cars;
import utils.RandomGenerator;
import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> carNames = InputView.inputCarNames();

        Cars cars = new Cars(carNames.stream()
                .map(CarName::new)
                .map(Car::new)
                .collect(Collectors.toList()));

        int count = InputView.inputCount();

        for (int i = 0; i < count; i++) {
            cars = cars.moveCars(RandomGenerator.generateRandomNumber(cars.getSize()));
            OutputView.printRoundResult(cars);
        }

        OutputView.printWinners(cars.getWinners());
    }
}
