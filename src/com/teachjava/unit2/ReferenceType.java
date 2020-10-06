package com.teachjava.unit2;

public class ReferenceType {
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
        //Scanner input = new Scanner(System.in);

        // read input
        //System.out.println(input.nextLine());
    }
}
