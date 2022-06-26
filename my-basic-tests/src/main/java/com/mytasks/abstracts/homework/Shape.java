package com.mytasks.abstracts.homework;

public  abstract class Shape {

    static  final  double PI = 3.1415927;
    private double r;

    public Shape(double r){
        this.r=r;
    }
    public double circleArea(){
        return PI * r * r;
    }
    public double circleCircumference(){
        return 2 * PI * r;
    }
    public abstract void textCircle();
}