package com.mytasks.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult =calculator.sum(a,b);
        boolean correctSum = ResultChecker.assertEquals(13,sumResult);

        if (correctSum){
            System.out.println("Metoda sum działa poprawnie dlia liczb"  +  a + " i " + b);
        }else{
            System.out.println("Metoda sum działa poprawnie dlia liczb"  +  a + " i " + b);
        }
        int x = 5;
        int y = 8;
        int subResult = calculator.subtract(x,y);
        boolean correctSub = ResultChecker.assertEquals(3,subResult);

        if (correctSub){
            System.out.println("Metoda sum dziła poprawnie dlia liczb"  +  x  + " i " + y);

        }else {
            System.out.println("Metoda sum dziła poprawnie dlia liczb"  +  x  + " i " + y);
        }
        int z = 8;
        int powerResult = calculator.power(z);
        boolean correctPower = ResultChecker.assertEquals(64,powerResult);

        if (correctPower){
            System.out.println("Metoda sum dziła poprawnie dlia liczb"  +  z);
        }else {
            System.out.println("Metoda sum dziła poprawnie dlia liczb"  +  z);
        }
    }
}