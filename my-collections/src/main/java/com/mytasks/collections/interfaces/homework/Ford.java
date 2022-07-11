package com.mytasks.collections.interfaces.homework;
import java.util.Objects;

public class Ford implements Car {

    private double speed;

    public Ford (int Ford){
        this.speed = Ford;
    }

    public int getSpeed(){
        return 0;
    }

    public double increaseSpeed(){
        return speed *3;
    }

    public double decreaseSpeed(){
        return speed /3;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed;
    }
    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
    @Override
    public String toString() {
        return "Ford{" + "speed=" + speed + '}';
    }
}