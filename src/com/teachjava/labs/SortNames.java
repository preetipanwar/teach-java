package com.teachjava.labs;


import java.util.ArrayList;
import java.util.Collections;

//  6. Write a program for sorting a given list of names in ascending order.

public class SortNames {
    public static void main(String[] args) {
        // The java string compareTo() method compares the given string with current string lexicographically.
        // It returns positive number, negative number or 0. read more ..
        // https://www.javatpoint.com/java-string-compareto

        String[] names = {"basanta", "neil", "zayan", "kunnu", "yanna", "yashika", "wilmore", "anish"};
        String temp;

        for(int x = 0; x < names.length; x++){
            for(int y = x + 1; y < names.length; y++){
                int compare = names[x].compareTo(names[y]);         // compareTo returns integer value
                if (compare > 0){
                    temp = names[x];
                    names[x] = names[y];
                    names[y] = temp;
                }
            }
        }

        // print array
        for(int x = 0; x < names.length; x++){
            System.out.println(names[x]);
        }
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
