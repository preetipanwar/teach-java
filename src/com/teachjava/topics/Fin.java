package com.teachjava.topics;

public class Fin {
    // finalize class
    // finalize variable
    // finalize method

    final String name = "bohemian";

    final void bark(){
        System.out.println("woof woof!!");
    }

    public static void main(String[] args) {
        Fin object = new Fin();

        System.out.println(object.name);
    }
}
