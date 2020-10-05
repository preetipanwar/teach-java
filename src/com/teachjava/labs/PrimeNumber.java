package com.teachjava.labs;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        int divisor = 2;        // initial value

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to see if its Prime:  ");
        int dividend = input.nextInt();

        while (divisor <= dividend){
            int quotient = dividend / divisor;  // 5
            int remainder = dividend % divisor; // 0
            // dividend = divisor x quotient + remainder

            // check if the dividend has factors
            if (remainder == 0 && quotient > 1){
                // thus is not prime break the loop
                System.out.println(dividend + " is not a prime number");
                break;
            }

            // check if loop reached the last number
            if (divisor == dividend){
                System.out.println(divisor + " is Prime");
            }
            divisor++;              // check for the next divisor
        }
    }
}




// dividend 6
// divisor 2

// quotient 3
// remainder 0

// dividend = divisor x quotient + remainder
// 6 = 2 x 3 + 0
// 8 = 2 x 2 + 0
// 11 = 2 x 5 + 1
// 11 = 11 x 1 + 0
// 13 = 3 x 4 + 1

// Prime - divisible by self and 1
// Factor
