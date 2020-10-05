package com.teachjava.labs;

public class PrimeNumber {
    public static void main(String[] args) {

        int divisor = 2;
        int dividend = 6;

        while (divisor <= dividend){
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            // check if the dividend has factors
            if (remainder == 0 && quotient > 1){
                // thus is not prime break the loop
                System.out.println(dividend + " is not a prime number");
                break;
            }

            if (divisor == dividend){
                System.out.println(divisor + " is Prime");
            }
            divisor++;              // check for the next divisor
        }
    }
}
