package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void 차_움직임_3일_때_테스트() {
        assertThat(new Car(new CarName("a")).move(3).getPosition()).isEqualTo(0);
    }

    @Test
    void 차_움직임_4일_때_테스트() {
        assertThat(new Car(new CarName("a")).move(4).getPosition()).isEqualTo(1);
    }
}