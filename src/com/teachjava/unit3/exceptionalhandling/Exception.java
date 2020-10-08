package com.teachjava.unit3.exceptionalhandling;

public class Exception {
//    An exception is a problem that arises during the execution of a program.
//    When an Exception occurs the normal flow of the program is disrupted and
//    the program/Application terminates abnormally.

//    This is crashing of the application is to be prevented hence exceptions should
//    be handled.

//    An exception can occur for many different reasons. Following are some
//    scenarios where an exception occurs.
//
//    1. A user has entered an invalid data.
//    2. A file that needs to be opened cannot be found.
//    3. A network connection has been lost in the middle of communications or
//    the JVM has run out of memory.

    public static void main(String[] args) {
        // Types of exceptions:
        // 1. Checked exceptions
        // 2. Unchecked exceptions
        // 3. Errors

        // 1. Checked exceptions: Checked exceptions also called Compile time exceptions
        // are those exceptions that are checked by the compiler at compilation-time.
        //  example:

        // uncomment the line below and run the program to see the exception
//         Scanner input = new Scanner(System.in);

        // 2. Unchecked exceptions: Unchecked exception also called Runtime Exception
        // occurs at the time of execution. The reason of these exceptions can be logic erros
        // or improper use of API.

        // For example, if you have declared an array of size 5 in your program, and trying to
        // call the 6th element of the array then an ArrayIndexOutOfBoundsExceptionexception occurs.

        int num[] = {1, 2, 3, 4, 5};

//        uncomment line below to see the error
//        System.out.println(num[6]);

        // 3. Errors − These are not exceptions at all, but problems that arise beyond the control of
        // the user or the programmer. Errors are typically ignored in your code because you can rarely
        // do anything about an error. For example, if a stack overflow occurs, an error will arise.
    }
}

