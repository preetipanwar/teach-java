package com.teachjava.topics;

public class Overloading {

    int a;
    int b;
    String name;

    // constructor overloading
    Overloading(){
    }

    Overloading(int a, int b, String name){
        this.a = a;
        this.b = b;
        this.name = name;
    }

    Overloading(int a, int b){
        this.a = a;
        this.b = b;
    }

    // method overloading
    int sum(int x, int y){
        return x + y;
    }

    int sum(int x, int y, int z){
        return x + y + z;
    }

    public static void main(String[] args) {
        Overloading obj1 = new Overloading();

        System.out.println(obj1.sum(2,3));
        System.out.println(obj1.sum(2,3, 7));
    }
}
