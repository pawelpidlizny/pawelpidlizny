package com.mytasks.collections.interfaces.homework;
import java.util.Objects;

public class Opel implements Car{

    private double speed;

    public Opel (double Opel){
        this.speed = Opel;
    }
    public int getSpeed(){
        return 0;
    }

    public double increaseSpeed(){
        return speed *2;
    }

    public double decreaseSpeed(){
        return speed /2;
    }

    @Override
    public boolean equals (Object o){
        if (this == o ) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed;
    }

    @Override
    public int hashCode(){
        return Objects.hash(speed);
    }

    @Override
    public String toString() {
        return "Opel {" + "speed=" + speed + '}';
    }
}