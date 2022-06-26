package com.mytasks.abstracts.homework;

public class Person {

    private final String firstName;
    private final int age;
    private final int salary;

    public Person (String firstName,int age,int salary){
        this.firstName = firstName;
        this.age= age;
        this.salary= salary;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }
}