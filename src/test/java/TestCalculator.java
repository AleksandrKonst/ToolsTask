import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    Calculator calculator = new Calculator();

    @Test
    void additionalSum(){
        assertEquals(2, calculator.Sum(1,1));
    }

    @Test
    void additionalSub(){
        assertEquals(2, calculator.Sub(4,2));
    }

    @Test
    void additionalMul(){
        assertEquals(4, calculator.Mul(2,2));
    }

    @Test
    void additionalDiv(){
        assertEquals(2, calculator.Div(4,2));
    }
}
