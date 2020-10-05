package com.teachjava.labs;
import java.util.Scanner;

public class PrimeNumberInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Print prime numbers upto: ");
        int searchLimit =  input.nextInt();

        for (int dividend = 2; dividend <= searchLimit; dividend++){
            int divisor = 2;

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
                divisor++;              // check for the next
            }
        }
    }
}

