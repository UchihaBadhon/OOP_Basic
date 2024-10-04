package org.example;

public class Teacher extends Person {
    //age, name of Person class is imported and hidden here.
    double cg;
    void display2(){
        display();
        System.out.println("CG is: " +cg);
    }
}
