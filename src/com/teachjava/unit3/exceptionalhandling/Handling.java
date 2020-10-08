package com.teachjava.unit3.exceptionalhandling;
import java.lang.Exception;

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
    }
}

class HandlingMultipleExceptions{
    public static void main(String[] args) {
        // Catching multiple exceptions

        // A try block can be followed by multiple catch blocks.
        // The syntax for multiple catch blocks looks like the following:

//        try {
//            Protected code
//        } catch (ExceptionType1 e) {
//            Catch block
//        } catch (ExceptionType2 e) {
//            Catch block
//        } catch (ExceptionType3 e) {
//            Catch block
//        }

//        You can have any number of catch blocks after a single try.
//        If an exception occurs in try block the consecutive catch block will try to handle it
//        one by one. If the above catch block cannot handle the exception the next catch block
//        will try to handle it, if not it will again pass it down to the next catch block.

        try{
            int num[]= {1, 2, 3, 4};
            num[5]=30/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurs");
        }
        catch(Exception e){
            System.out.println("Parent Exception occurs");
        }

//        In the example above 30/0 will result into Arithmetic Exception. To handle it the first
//        catch block will try to handle it, since it cannot deal with this exception it will pass
//        it down to the next catch block now this block can handle ArithmeticException and hence can
//        prevent the program from failing.
    }
}

