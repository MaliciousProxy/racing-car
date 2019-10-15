package view;

import model.Car;
import model.Cars;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    public static void printRoundResult(Cars cars) {
        cars.getCars().forEach(car -> System.out.printf("%s : %s\n", car.getName(), getPositionLine(car.getPosition())));
        System.out.println();
    }

    private static String getPositionLine(int position) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < position; i++) {
            stringBuilder.append("-");
        }

        return stringBuilder.toString();
    }

    public static void printWinners(List<Car> winners) {
        System.out.println("우승자는 " + winners.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", ")) + " 입니다.");
    }
}
