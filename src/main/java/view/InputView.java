package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static List<String> inputCarNames() {
        System.out.println("경주할 자동자 이름을 입력하세요. (이름은 ,로 구분)");
        return Arrays.asList(SCANNER.nextLine().split(","));
    }

    public static int inputCount() {
        System.out.println("실행할 회수는?");
        return SCANNER.nextInt();
    }
}
