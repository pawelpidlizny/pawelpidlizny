package com.mytasks.inheritance.homework;

public class OperatingSystem {
    private final int publicationYear;

    public OperatingSystem (int publicationYear){
        this.publicationYear = publicationYear;
    }

    public void turnOn(){
        System.out.println(" Urochamia system operacyjny");
    }
    public void turnOff(){
        System.out.println(" Wyłacza system operacyjny");
    }
}