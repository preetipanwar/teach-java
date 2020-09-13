package com.teachjava.topics;

// Types of constructors
public class ConstructorTypes {

    // 1. Default constructor
    // 2. No-args
    // 3. Parameterized constructor

    int number;

    // 1. Giving no default constructor


    // 2. No-args
    public ConstructorTypes(){
        System.out.println("Hello world");
    }

    // 3. Parameterized
    public ConstructorTypes(int number){
     this.number = number;
    }


    public static void main(String[] args) {

    }
}
