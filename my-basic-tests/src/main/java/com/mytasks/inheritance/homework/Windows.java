package com.mytasks.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows (int publicationYear){
        super(publicationYear);
    }

    @Override
    public void turnOn(){
        System.out.println("Urochamiam system Windows");
    }
}