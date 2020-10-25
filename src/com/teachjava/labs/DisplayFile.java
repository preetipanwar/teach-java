package com.teachjava.labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayFile {
    // 9. Write a program that reads a file and displays the
    // file on screen with a line number before each line.

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/com/teachjava/files/lyrics.txt"));

        int count = 1;
        String line;

        while ((line = reader.readLine()) != null ) {       // while there is line
            System.out.println(count + ". " + line);        // print line with line no.
            count++;                                        // increment counter
        }
    }

}
