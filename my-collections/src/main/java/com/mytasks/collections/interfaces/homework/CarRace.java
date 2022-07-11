package com.mytasks.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(2);
        System.out.println(ford.getSpeed());
        System.out.println(ford.increaseSpeed());
        System.out.println(ford.decreaseSpeed());

        Opel opel = new Opel(4);
        System.out.println(opel.getSpeed());
        System.out.println(opel.increaseSpeed());
        System.out.println(opel.decreaseSpeed());

        doRace doRace = new doRace(150,100,200);
    }
}