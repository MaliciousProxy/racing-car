package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void 움직임_4_테스트() {
        Car car = new Car("aaaaa");
        assertThat(car.move(4)).isEqualTo(new Car(new CarName("aaaaa"), 1));
    }

    @Test
    void 움직임_3_테스트() {
        Car car = new Car("aaaaa");
        assertThat(car.move(3)).isEqualTo(car);
    }
}