package domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarsTest {

    @Test
    void 생성() {
        Cars cars = new Cars(Arrays.asList("a", "b", "c"));

        assertThat(cars).isInstanceOf(Cars.class);
    }

    @Test
    void 생성_에러() {
        assertThrows(IllegalArgumentException.class, () -> new Cars(Collections.singletonList("aaaaaa")));
    }

    @Test
    void 움직임_테스트() {
        Cars cars = new Cars(Arrays.asList("a", "b", "c"));
        cars.moveCars((countOfCars) -> Arrays.asList(1));
// TODO: 2019-10-08 getter issue
        assertThat(cars);
    }
}
