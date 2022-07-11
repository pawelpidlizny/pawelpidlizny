package com.mytasks.collections.interfaces;

public class Circle implements Shape {
    private double radios;
    public Circle (double radios){
        this.radios = radios;
    }
    public double getArea(){
        return Math.PI * radios * radios;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radios;
    }
}
