package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void 차_생성_이름_5자_통과() {
        assertDoesNotThrow(() -> new Car("aaaaa"));
    }

    @Test
    void 차_생성_이름_6자_예외() {
        assertThrows(IllegalArgumentException.class, () -> new Car("aaaaaa"));
    }

    @Test
    void 차_생성_이름_0자_예외() {
        assertThrows(IllegalArgumentException.class, () -> new Car(""));
    }

    @Test
    void 차_움직임_3일_때_테스트() {
        assertThat(new Car("a").move(3).getPosition()).isEqualTo(0);
    }

    @Test
    void 차_움직임_4일_때_테스트() {
        assertThat(new Car("a").move(4).getPosition()).isEqualTo(1);
    }
}