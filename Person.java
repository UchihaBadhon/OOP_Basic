package org.example;

public class Person {
    private int age;
    private String name;
     String getName(){
        return name;
    }
    int getAge(){
         return age;
    }
    void setInfo(int age, String name){
        this.age = age;
        this.name = name;
    }
    void display(){
        System.out.println("Age is: " + age);
        System.out.println("Name is: " +name);
    }
}
