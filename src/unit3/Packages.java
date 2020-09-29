package unit3;

//    A package in Java is used to group related classes.
//    Think of it as a folder in a file directory.
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
    // import package.name.*                    // imports the whole package
    import java.util.*;

public class Packages {

    Scanner input = new Scanner(System.in);        // use Scanner
    //Collection;     // java.util.*

}
