package com.teachjava.labs;
import java.util.Scanner;

public class PrimeNumberInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Print prime numbers up-to: ");
        int lastDividend =  input.nextInt();

        // loop through all the dividends
        for (int dividend = 2; dividend <= lastDividend; dividend++){

            // Check if a dividend is Prime
            for (int divisor = 2; divisor <= dividend; divisor++){
                int quotient = dividend / divisor;
                int remainder = dividend % divisor;

                // check if the dividend has factors
                // formula: dividend    = divisor   x quotient  + remainder
                // e.g   :     12          = 2         x 6         + 0
                // Here quotient is greater than 1 hence the number 12 can be
                // divided into smaller parts (factors)

                if (remainder == 0 && quotient > 1){
                    // Not prime break the loop and go to the next dividend
                    break;
                }

                // if dividend cannot be divided into any factors and loop
                // reaches the final value which will surely divide the number
                // by itself, then its a Prime number.
                if (divisor == dividend){
                    System.out.println(dividend + " is Prime");
                }
            } // end internal loop
        } // end for loop for looping all the divisors one by one


    } // end main()
} // end Class