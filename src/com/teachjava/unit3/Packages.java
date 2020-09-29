package com.teachjava.unit3;

//    A package in Java is used to group related classes.
//    Think of it as a folder.
//    We use packages to write a better maintainable code and avoid name conflicts,
//    Packages are divided into two categories:
//
//    1. Built-in Packages (packages from the Java API)
//    2. User-defined Packages (create your own packages)


    // 1. Built-in Packages:
    // The Java API is a library of pre-written classes, that are free to use,
    // included in the Java Development Environment. The library is divided into packages and classes.
    // Meaning you can either import a single class , or a whole package that contain all the classes
    // that belong to the specified package.

    // To use a class of package from the library you need to use import keyword:
    // import package.name.Class                // imports a single Class
    import java.util.Scanner;
    import java.util.*;                    // imports the whole package

    // 2. User-defined Packages (create your own packages)
    import com.teachjava.miniprograms.Movie;
    import com.teachjava.miniprograms.Account;

public class Packages {

//    Scanner input = new Scanner(System.in);        // use Scanner
    //Collection;     // java.util.*

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your age is " + age);

        Movie dangal = new Movie("aamir", "nitesh");
        dangal.printDetails();
    }
}
