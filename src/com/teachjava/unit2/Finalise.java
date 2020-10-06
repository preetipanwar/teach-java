package com.teachjava.unit2;

public class Finalise {
    // finalize class
    // finalize variable
    // finalize method

    final String name = "bohemian";

    final void bark(){
        System.out.println("woof woof!!");
    }

    public static void main(String[] args) {
        Finalise object = new Finalise();

        System.out.println(object.name);
    }
}
