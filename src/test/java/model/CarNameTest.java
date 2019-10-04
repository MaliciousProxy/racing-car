package model;

import model.exception.CarNameLengthException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarNameTest {
    @Test
    void 차_생성_이름_5자_통과() {
        assertDoesNotThrow(() -> new CarName("aaaaa"));
    }

    @Test
    void 차_생성_이름_6자_예외() {
        assertThrows(CarNameLengthException.class, () -> new CarName("aaaaaa"));
    }

    @Test
    void 차_생성_이름_0자_예외() {
        assertThrows(CarNameLengthException.class, () -> new CarName(""));
    }

}