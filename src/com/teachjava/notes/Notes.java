package com.teachjava.notes;

import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {

        int[][] array = {{1,2},{3,4}};

        for (int i=0; i < 2; i++){
            for(int j=0; j < 2; j++){
                System.out.println("array[" + i + "][" + j + "] = " + array[i][j]);
            }
        }

        // i=0 j=0 --> 1
        // i=0 j=1 --> 2
        // i=1 j=0 --> 3
        // i=1 j=1 --> 4

    }

    public static class Primitive {
        public static void main(String[] args) {

            // popular primitive data types

            int     age     = 12;       // whole number
            double  value   = 13.5;     // decimal number
            char    initial = 'A';      // single character
            boolean isNight = true;     // true or false value

            System.out.println(age);
            System.out.println(value);
            System.out.println(initial);
            System.out.println(isNight);

        }
    }

    public static class ReferenceTypes {
        public static void main(String[] args) {

            // String is the most popular Reference type datatype

            // Syntax: String StringName = GiveValueinQuotes;

            String firstName        = "Jacob";
            String lastName         = "Black";

            System.out.println(firstName);
            System.out.println(lastName);

            // charAt(index) method is used to get a character out of a string
            char   firstNameInitial = firstName.charAt(0);
            char   lastNameInitial  = lastName.charAt(0);

            System.out.println(firstNameInitial);
            System.out.println(lastNameInitial);

            // concatenation
            System.out.println("The full name is " + firstName + " " + lastName);

            // inputs through command line
            System.out.println("Enter your name: ");
            Scanner input = new Scanner(System.in);

            // read input
            System.out.println(input.nextLine());
        }
    }
}
