package com.mytasks.abstracts.homework;

public class Abstract {
    public Abstract (){
    }
    public static void main(String[] args) {
        Doctor doctor = new Doctor( 5000,"Irena",22);
        Nurse nurse = new Nurse( 4000," Dawid ",36);

        System.out.println("Doctor");
        System.out.println(doctor.toString());
        doctor.responsibilities();
        doctor.process();

        System.out.println("Nurse");
        System.out.println(nurse.toString());
        nurse.responsibilities();
        nurse.process();
    }
}
