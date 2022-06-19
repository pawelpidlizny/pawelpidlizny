package com.mytasks.inheritance.homework;

public class OperationSystemRunner {
    public static void main(String[] args) {

        OperatingSystem operatingSystem = new OperatingSystem(2009);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        MacOs macOs = new MacOs(2022);
        Windows windows = new Windows(2009);
        macOs.turnOn();
        windows.turnOff();
    }
}