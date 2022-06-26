package com.mytasks.abstracts.homework;

public class Nurse extends Job {

    public Nurse (int salary, String firstName, int age){
        super(salary,firstName,age);
    }
    @Override
    public String toString(){
        return "Name" + firstName + "\n " + "Salary" + salary + " \n " + "Age" + age + "\n ";
    }
    @Override
    public void process (){
        System.out.println("Pielęgniarka powinna zrobić pacjentowi zastrzyk");
    }
    @Override
    public void responsibilities(){
        System.out.println("On pomaga chorym ");
    }
}