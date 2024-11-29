import com.ll.SimpleCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleCalculatorTest {
    private final SimpleCalculator simpleCalculator = new SimpleCalculator();

    @Test
    @DisplayName("2 + 5 = 7")
    public void t1() {
        int result = simpleCalculator.plus(2, 5);

        assertThat(result).isEqualTo(7);
    }

    @Test
    @DisplayName("11 + 131 = 142")
    public void t2() {
        int result = simpleCalculator.plus(11, 131);

        assertThat(result).isEqualTo(142);
    }

    @Test
    @DisplayName("6 - 2 = 4")
    public void t3() {
        int result = simpleCalculator.minus(6, 2);

        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("3 - 9 = -6")
    public void t4() {
        int result = simpleCalculator.minus(3, 9);

        assertThat(result).isEqualTo(-6);
    }

    @Test
    @DisplayName("6 * 8 = 48")
    public void t5() {
        int result = simpleCalculator.multifly(6, 8);

        assertThat(result).isEqualTo(48);
    }

    @Test
    @DisplayName("12 * 24 = 288")
    public void t6() {
        int result = simpleCalculator.multifly(12, 24);

        assertThat(result).isEqualTo(288);
    }

    @Test
    @DisplayName("8 * 4 = 2")
    public void t7() {
        int result = simpleCalculator.divide(8, 4);

        assertThat(result).isEqualTo(2);
    }
}
