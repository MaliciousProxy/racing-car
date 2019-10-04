package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static List<String> readCarNames() {
        String carNames = SCANNER.nextLine();
        return Arrays.asList(carNames.split(","));
    }
}
