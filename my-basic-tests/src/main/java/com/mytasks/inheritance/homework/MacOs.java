package com.mytasks.inheritance.homework;

public class MacOs extends OperatingSystem {

    public MacOs (int publicationYear){
        super(publicationYear);
    }

    public void turnOn() {
        System.out.println(" Urochamiamy MacOs");
    }
}