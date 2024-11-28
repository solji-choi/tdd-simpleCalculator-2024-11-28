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
}
