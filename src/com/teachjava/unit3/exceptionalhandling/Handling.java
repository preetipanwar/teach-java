package com.teachjava.unit3.exceptionalhandling;

public class Handling {


    public static void main(String[] args) {

        // Exceptions can be handled using a try/catch block

//        try {
                // try block
//            // some operation
//        } catch (ExceptionName e) {
                // catch block
//            // catch if exception
//        }

        // If there is an exception in try block the catch block will catch
        // the exception and prevent the program/application from abruptly stopping.

        try{
            int num[] = {1, 2, 3, 4, 5};
            System.out.println(num[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: " + e);
        }

        System.out.println("\nProgram is still running...");

        // Run the program, the exception will be printed from catch block
        // and the program will keep on running.

        // ---------------------------------------------------------------- //


    }
}

