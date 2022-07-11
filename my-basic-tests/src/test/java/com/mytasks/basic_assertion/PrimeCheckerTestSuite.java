package com.mytasks.basic_assertion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PrimeCheckerTestSuite {
    private  static int count = 0;

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber(){
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(14);
        count++;
        System.out.println("Test number " + count);
        assertFalse(result);
    }
    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber(){
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(13);
        checker.incrementCount();
        System.out.println("Count:" + checker.getCount());
        assertTrue(result);
    }
    @Test
    public void shouldReturnTrueWhenPassingTwo(){
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(2);
        checker.incrementCount();
        System.out.println("Count: "  + checker.getCount());
        assertTrue(result);
    }
    @Test
    public void shouldReturnFalseWhenPassingOne(){
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(1);
        checker.incrementCount();
        System.out.println("Count:" + checker.getCount());
        assertFalse(result);
    }
    @Test
    public void shouldReturnFalseWhenPassingZero(){
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(0);
        checker.incrementCount();
        System.out.println("Count:" + checker.getCount());
        assertFalse(result);
    }
    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber(){
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(-6);
        checker.incrementCount();
        System.out.println("Count:" + checker.getCount());
        assertFalse(result);
    }
}