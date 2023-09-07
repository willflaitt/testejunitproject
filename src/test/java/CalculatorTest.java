import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        //assertEquals(10, Calculator.add(3, 2, 5));
        assertAll(() -> assertEquals(10.49, Calculator.add(3.1, 2.34, 5.05)),
                () -> assertEquals(0, Calculator.add(2, -2)),
                () -> assertEquals(-4, Calculator.add(-2, -2)),
                () -> assertEquals(1, Calculator.add(1, 0)));
    }

    @Test
    void multiply() {
        assertAll(() -> assertEquals(36.6327, Calculator.multiply(3.1, 2.34, 5.05)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }
}