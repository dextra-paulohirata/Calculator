import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final ICalculator calc = new Calculator();

    @Test
    public void sumOK() {
        Assertions.assertEquals(4, calc.sum(1d, 3d));
    }

    @Test
    public void sumWithNullValue() {
        Assertions.assertThrows(NullPointerException.class, () -> calc.sum(1d, null));
    }

    @Test
    public void subtractOK() {
        Assertions.assertEquals(2, calc.subtract(3d, 1d));
    }

    @Test
    public void subtractWithNullValue() {
        Assertions.assertThrows(NullPointerException.class, () -> calc.subtract(1d, null));
    }
}
