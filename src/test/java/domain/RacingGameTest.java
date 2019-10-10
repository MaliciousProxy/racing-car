package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

class RacingGameTest {
    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars(Arrays.asList("a", "b", "c", "d"));
    }

    @Test
    void 우승자_구하기_한명() {
        RacingGame racingGame = new RacingGame(cars, 1);
        racingGame.play((car) -> Arrays.asList(5, 1, 1, 1), new RoundResults());

        assertThat(racingGame.findWinners()).isEqualTo(Collections.singletonList("a"));
    }

    @Test
    void 우승자_구하기_여러명() {
        RacingGame racingGame = new RacingGame(cars, 1);
        racingGame.play((car) -> Arrays.asList(5, 5, 5, 1), new RoundResults());

        assertThat(racingGame.findWinners()).isEqualTo(Arrays.asList("a", "b", "c"));
    }
}