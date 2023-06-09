package Lesson9.nalog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {

    @Test
    void calculateTaxPositive() {
        String[] input ={"1","100","1000"};
        Double actual = TaxCalculator.calculateTax(input);
        Assertions.assertEquals(320.1,actual); // 1*0,1 + 100*0,2 + 1000*0,3 = 320.1
    }

    @Test
    void calculateTaxPositiveWithNegativeNumbers() {
        String[] input ={"1","100","1000","-42"};
        Double actual = TaxCalculator.calculateTax(input);
        Assertions.assertEquals(320.1,actual); // 1*0,1 + 100*0,2 + 1000*0,3 = 320.1
    }
    @Test
    void calculateTaxPositiveWithIncorrectSymbols() {
        String[] input ={"1","100","1000","хуй"};
        Double actual = TaxCalculator.calculateTax(input);
        Assertions.assertEquals(320.1,actual); // 1*0,1 + 100*0,2 + 1000*0,3 = 320.1
    }

    @Test
    void calculateTaxPositiveWithNumbersOutOfRange() {
        String[] input ={"1","100","1000","100_000_000"};
        Double actual = TaxCalculator.calculateTax(input);
        Assertions.assertEquals(320.1,actual); // 1*0,1 + 100*0,2 + 1000*0,3 = 320.1
    }
}