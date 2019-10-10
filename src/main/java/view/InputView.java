package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static List<String> readCarNames() {
        System.out.println("이름을 입력해 주세요");
        String carNames = SCANNER.nextLine();
        return Arrays.asList(carNames.split(","));
    }

    public static int readRound() {
        System.out.println("라운드 수를 입력해 주세요");
        return Integer.parseInt(SCANNER.nextLine());
    }
}
