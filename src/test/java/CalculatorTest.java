import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void additional(){
        assertEquals(4, calculator.add(1, 3));
    }
    @Test
    void difference(){
        assertEquals(5, calculator.sub(8, 3));
    }
    @Test
    void composition(){
        assertEquals(8, calculator.multi(4, 2));
    }
    @Test
    void theMeaningOfThePrivate(){
        assertEquals(6, calculator.div(60, 10));
    }
}
