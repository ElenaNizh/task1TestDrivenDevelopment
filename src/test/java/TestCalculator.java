import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {
    private final int sum = 800000;
    private final double rate = 7.5;
    private final int period = 36;

    CreditCalculator calculator = new CreditCalculator();

    @Test
    void testSumPerMonth() {
        int expected = 24884;
        int actual = calculator.sumPerMonth(sum, rate, period);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testFullSumReturn() {
        int expected = 895859;
        int actual = calculator.fullSumReturn(sum, rate, period);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testOverPaySum() {
        int expected = 95859;
        int actual = calculator.overPaySum(sum, rate, period);
        Assertions.assertEquals(expected, actual);
    }
}