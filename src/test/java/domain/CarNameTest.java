package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarNameTest {

    @Test
    void 차_이름_길이_5_테스트_성공_ver() {
        assertDoesNotThrow(() -> new CarName("aaaaa"));
    }

    @Test
    void 차_이름_길이_6_테스트_실패_ver() {
        assertThrows(IllegalArgumentException.class, () -> new CarName("aaaaaa"));
    }

    @Test
    void 차_이름_공백_테스트_실패_ver() {
        assertThrows(IllegalArgumentException.class, () -> new CarName(""));
    }

    @Test
    void 차_이름_널_테스트_실패_ver() {
        assertThrows(IllegalArgumentException.class, () -> new CarName(null));
    }
}
