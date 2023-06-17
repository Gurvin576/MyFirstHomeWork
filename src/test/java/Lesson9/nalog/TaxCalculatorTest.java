package Lesson9.nalog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TaxCalculatorTest {
    static String[] input;

    @BeforeAll
    static void prepare() {
        input=new String[]{};

    }


    @Test
    void calculateTaxPositive() {
        input = new String[]{"1", "100", "1000"};
        Double actual = TaxCalculator.calculateTax(input);
        Assertions.assertEquals(320.1,actual); // 1*0,1 + 100*0,2 + 1000*0,3 = 320.1
    }

    @Test
    void calculateTaxPositiveWithNegativeNumbers() {
        input = new String[]{"1","100","1000","-42"};
        Double actual = TaxCalculator.calculateTax(input);
        Assertions.assertEquals(320.1,actual); // 1*0,1 + 100*0,2 + 1000*0,3 = 320.1
    }
    @Test
    void calculateTaxPositiveWithIncorrectSymbols() {
        input = new String[]{"1","100","1000","хуй"};
        Double actual = TaxCalculator.calculateTax(input);
        Assertions.assertEquals(320.1,actual); // 1*0,1 + 100*0,2 + 1000*0,3 = 320.1
    }

    @Test
    void calculateTaxPositiveWithNumbersOutOfRange() {
        input = new String[]{"1","100","1000","100_000_000"};
        Double actual = TaxCalculator.calculateTax(input);
        Assertions.assertEquals(320.1,actual); // 1*0,1 + 100*0,2 + 1000*0,3 = 320.1
    }
}