package com.teachjava.topics.inhpoly;

public class Cat extends Dog{

//    inherited
//    void walk(){
//        System.out.println("walk walk");
//    }

//    void speak(){
//        System.out.println("woof woof");
//    }

    // overriding speak method
    void speak(){
        System.out.println("Meow Meow");
    }

    public static void main(String[] args) {
        Cat kitty = new Cat();
        kitty.speak();
    }
}

