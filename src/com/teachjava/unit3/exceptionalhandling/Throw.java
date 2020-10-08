package com.teachjava.unit3.exceptionalhandling;

import java.io.IOException;

public class Throw {
    public static void main(String[] args) {

        // throw is used to explicitly throw and exception
        int x = 10;
        if (x < 20){
            throw new ArithmeticException();
        }
    }
}

class Throws{
    // throws is used when programmer doesn't want to use try catch but still
    // looks for some potential exceptions that can occur in the program.
    // The method must declare it using the throws keyword.
    // The throws keyword appears at the end of a method's signature.
    public static void main(String[] args) throws ArithmeticException, IOException {

        // program ....

    }
}
