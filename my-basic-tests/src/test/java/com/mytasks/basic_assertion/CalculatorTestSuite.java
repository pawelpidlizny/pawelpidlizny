package com.mytasks.basic_assertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTestSuite{
    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        Assertions.assertEquals (13,sumResult);
    }
    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        int x = 5;
        int y = 8;
        int sumResult = calculator.subtract (x,y);
        Assertions.assertEquals(-3,sumResult);
    }
    @Test
    public void  testPower(){
        Calculator calculator = new Calculator();
        int z = 8;
        int sumResult = calculator.power(z);
        Assertions.assertEquals(64,sumResult);
    }
}