package com.mytasks.abstracts.homework;

public class ShapeChild1 extends Shape{

    public ShapeChild1 (){
        super(9);
    }
    @Override
    public void textCircle() {
        System.out.println("Obliczenie pole");
        System.out.println(circleArea());
    }
}
