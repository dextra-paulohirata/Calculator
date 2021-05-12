import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final ICalculator calc = new Calculator();

    @Test
    public void sumOK() {
        Assertions.assertEquals(4, calc.sum(1d, 3d));
        Double result = calc.sum(2d, 1.4d);
        Assertions.assertEquals(3.4d, Math.floor(result * 100) / 100);
    }

    @Test
    public void sumWithNullValue() {
        Assertions.assertThrows(NullPointerException.class, () -> calc.sum(1d, null));
    }

    @Test
    public void subtractOK() {
        Assertions.assertEquals(2, calc.subtract(3d, 1d));
        Double result = calc.subtract(2d, 1.4d);
        Assertions.assertEquals(0.6d, Math.floor(result * 100) / 100);
    }

    @Test
    public void subtractWithNullValue() {
        Assertions.assertThrows(NullPointerException.class, () -> calc.subtract(1d, null));
    }


}
