package com.teachjava.labs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IntegerSum {
    // 4. Write a program that reads a line of integers, and then displays each integers
    // and then sum of all the integers.(using StringTokenizer class from java.util)
    public static void main(String[] args) {

        System.out.println("Enter a bunch of integers after adding space between them: ");
        Scanner input = new Scanner(System.in);     // prepare for input
        String line = input.nextLine();             // read line
        int total = 0;                              // initialize total

        StringTokenizer read = new StringTokenizer(line);

        while(read.hasMoreTokens()){
            String token = read.nextToken();
            System.out.println(token);
            total += Integer.parseInt(token);       // convert String to Integer and add to total
        }
        System.out.println("\n Total: " + total);

    }
}
