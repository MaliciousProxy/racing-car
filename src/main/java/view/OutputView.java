package view;

import domain.Car;

import java.util.List;

public class OutputView {
    private static final String HYPHEN = "-";

    public static void printPositionByRound(List<Car> cars) {
        for (Car car : cars) {
            printCarStatus(car);
        }
        System.out.println();
    }

    private static void printCarStatus(Car car) {
        System.out.printf("%s  ", car.getCarName());
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print(HYPHEN);
        }
        System.out.println();
    }

    public static void printWinners(List<String> winners) {
        String outputWinners = String.join(",", winners);
        System.out.println(outputWinners + "가 최종 우승했습니다.");
    }
}
