package org.example;

public class Employee extends Person {

    @Override
    void role() {
        System.out.println("Every employee is also a person and has different duties.");
    }
}
