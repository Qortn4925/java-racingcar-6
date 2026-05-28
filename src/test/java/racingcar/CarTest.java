package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    RacingCar racingCar;

    @BeforeEach
    void init() {
        racingCar = new RacingCar();
    }

    @Test
    void 사_보다_큰_값이_들어오면_position이_1_증가한다() {
        // given (숫자 4가 주어지고)
        int movementValue = 4;

        // when (그 값으로 이동을 시도했을 때)
        racingCar.improvePosition(movementValue);

        // then (위치가 1이 되었는지 검증)
        assertThat(racingCar.getPosition()).isEqualTo(1);
    }

    @Test
    void 삼_이하의_값이_들어오면_position은_그대로다() {
        // given (숫자 3이 주어지고)
        int movementValue = 3;

        // when (그 값으로 이동을 시도했을 때)
        racingCar.improvePosition(movementValue);

        // then (위치가 전진하지 않고 0인지 검증)
        assertThat(racingCar.getPosition()).isEqualTo(0);
    }
}