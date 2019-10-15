package model;

import model.exception.WrongPositionException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarPositionTest {
    @Test
    void 값_0일_때_생성_테스트() {
        assertDoesNotThrow(() -> new CarPosition(0));
    }

    @Test
    void 값_0보다_작을_때_생성_테스트() {
        assertThrows(WrongPositionException.class, () -> new CarPosition(-1));
    }

    @Test
    void plus() {
        assertThat(new CarPosition(0).plus()).isEqualTo(new CarPosition(1));
    }

    @Test
    void 값이_같은_경우_테스트() {
        assertThat(new CarPosition(0).isSamePosition(new CarPosition(0))).isTrue();
    }

    @Test
    void 값이_다른_경우_테스트() {
        assertThat(new CarPosition(0).isSamePosition(new CarPosition(1))).isFalse();
    }
}