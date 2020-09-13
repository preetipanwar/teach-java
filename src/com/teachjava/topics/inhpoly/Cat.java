package com.teachjava.topics.inhpoly;

public class Cat extends Dog{

    // overriding speak method
    void speak(){
        System.out.println("Meow Meow");
    }

    public static void main(String[] args) {
        Cat kitty = new Cat();
        kitty.speak();
    }
}

