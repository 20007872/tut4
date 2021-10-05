package cathy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest{


    @Test
    public void addtest() {
        assertEquals(15,Calc.add(5,10));

    }
    @Test
    public void subtracttest() {
       assertEquals(2,Calc.subtract(5,4));

    }
}
