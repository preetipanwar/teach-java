package com.teachjava.topics.inhpoly;

public class Dog extends Animal{

    void speak(){
        System.out.println("woof woof");
    }

    public static void main(String[] args) {
        Dog jack = new Dog();
        jack.walk();
    }
}
