package com.mytasks.abstracts.homework;

public class ShapeChild2 extends Shape {

    public ShapeChild2 (){
        super(9);
    }
    @Override
    public void textCircle() {
        System.out.println("Oblicz obwód");
        System.out.println(circleCircumference());
    }
}
