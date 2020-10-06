package com.teachjava.unit2.inheripolymor;

public class Dog extends Animal{

    // inherited
//    void walk(){
//        System.out.println("walk walk");
//    }

    void speak(){
        System.out.println("woof woof");
    }

    public static void main(String[] args) {
        Dog jack = new Dog();
        jack.walk();        // inherited from Animal
    }
}
