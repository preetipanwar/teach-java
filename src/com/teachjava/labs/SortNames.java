package com.teachjava.labs;


import java.util.ArrayList;
import java.util.Collections;

//  6. Write a program for sorting a given list of names in ascending order.

public class SortNames {
    public static void main(String[] args) {

        System.out.println("znkit".compareTo("Vibha"));

    }
}


class SortNameAlternative{
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Sam");
        names.add("Vibha");
        names.add("Zain");
        names.add("Yanna");
        names.add("Bikram");
        names.add("Anafi");

        Collections.sort(names);

        // using for-each to print array
        for(String name: names){
            System.out.println(name);
        }
    }
}
