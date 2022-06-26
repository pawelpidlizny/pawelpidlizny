package com.mytasks.abstracts.homework;

public class Doctor extends Job {

    public Doctor(int salary,String firstName,int age){
        super( salary,firstName,age);
    }
    @Override
    public String toString(){
        return "Name " + firstName + " \n " + "Salary" + salary + " \n " + " Age" + age + "\n " ;
    }
    @Override
    public void responsibilities() {
    }
    @Override
    public void process() {
    }
}