package dz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SummaTest {


    @Test
    void summaDvuhChisel() {
        final int[] strings = {1, 2, 3,4, 5};
        int summa = Summa.summaVsehChisel(strings);
        Assertions.assertEquals(15,summa);
    }
}