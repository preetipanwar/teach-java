package com.teachjava.labs;

public class PrimeNumber {
    public static void main(String[] args) {

//        int dividend = 10;
//        int divisor = 17;
//
//        int quotient = dividend / divisor;
//        int remainder = dividend % divisor;
//
//        System.out.println(quotient);
//        System.out.println(remainder);


        int dividend = 7;

        for (int divisor = 2; divisor <= dividend; divisor++){
            System.out.println("divisor " + divisor);
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            if (quotient > 1 && remainder == 0) {
                // it means dividends has factors
                break;          // break the loop and go to next number
                }

                System.out.println(dividend);




            }

        }


}
