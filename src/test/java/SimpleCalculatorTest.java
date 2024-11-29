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
}
