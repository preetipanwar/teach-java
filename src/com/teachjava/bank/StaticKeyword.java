package com.teachjava.bank;

public class StaticKeyword {

    // static fields
    static double pi = 3.14;
    static double interest = 5;
    static String name = "Catty";

    // static methods
    public static void printPi(){
        System.out.println(pi);
    }

    public static void printInterest(){
        System.out.println(interest);
    }

    public static void printName(){
        System.out.println(name);
    }


    public static void main(String[] args) {

        // Class.properties
        // Class.method()
        StaticKeyword.printPi();
        StaticKeyword.printInterest();
        StaticKeyword.printName();

    }

}

