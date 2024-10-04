package org.example;

public class Teacher extends Person {
    //age, name of Person class is imported and hidden here.
    private double cg;
    void setCg(double cg){
        this.cg = cg;
    }
    double getCg(){
        return cg;
    }
    void display2(){
        display();
        System.out.println("CG is: " +cg);
    }
}
