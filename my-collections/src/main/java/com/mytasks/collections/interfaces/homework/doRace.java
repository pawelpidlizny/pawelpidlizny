package com.mytasks.collections.interfaces.homework;

public class doRace implements Car {

    private final double getSpeed;
    private final double increaseSpeed;
    private final double decreaseSpeed;

    public doRace (double getSpeed,double increaseSpeed,double decreaseSpeed){
        this.getSpeed = getSpeed;
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public double increaseSpeed() {
        return
        increaseSpeed * decreaseSpeed / 2;
    }

    @Override
    public double decreaseSpeed() {
        return
        increaseSpeed + decreaseSpeed + getSpeed;
    }
}