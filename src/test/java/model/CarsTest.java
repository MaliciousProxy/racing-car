package model;

import model.exception.DuplicatedCarNameException;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarsTest {
    @Test
    void 생성_테스트() {
        assertDoesNotThrow(() -> new Cars(Arrays.asList(new Car("a"), new Car("b"), new Car("c"))));
    }

    @Test
    void 생성_이름_중복_예외_테스트() {
        assertThrows(DuplicatedCarNameException.class, () -> new Cars(Arrays.asList(new Car("a"), new Car("a"), new Car("c"))));
    }

    @Test
    void 자동차_움직임_테스트() {
        Cars cars = new Cars(Arrays.asList(new Car("a"), new Car("b")));

        Cars movedCars = cars.moveCars(Arrays.asList(3, 4));

        assertThat(movedCars.getCars().get(0).isSamePosition(0)).isTrue();
        assertThat(movedCars.getCars().get(1).isSamePosition(1)).isTrue();
    }

    @Test
    void 우승자_1명_구하기_테스트() {
        Cars cars = new Cars(Arrays.asList(new Car("a"), new Car("b")));
        List<Integer> randoms = Arrays.asList(3, 4);
        cars = cars.moveCars(randoms);

        assertThat(cars.getWinners()).isEqualTo(Collections.singletonList(new Car("b")));
    }

    @Test
    void 우승자_2명_구하기_테스트() {
        Cars cars = new Cars(Arrays.asList(new Car("a"), new Car("b")));
        List<Integer> randoms = Arrays.asList(4, 4);
        cars = cars.moveCars(randoms);

        assertThat(cars.getWinners()).isEqualTo(Arrays.asList(new Car("a"), new Car("b")));
    }
}