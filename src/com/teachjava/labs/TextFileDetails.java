package com.teachjava.labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileDetails {
    // 10. Write a program that displays the

    // 1. number of characters,
    // 2. lines and
    // 3. words in a text file.

    public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new FileReader("src/com/teachjava/files/lyrics.txt"));

            int countLines = 0;
            int countWords = 0;
            String lines = "";

            String line;
            while ((line = reader.readLine()) != null){
                countLines++;                                       // increment count on every iteration
                lines += line;                                      // save each line to lines String
                String[] wordsPerLine = line.split(" ");      // split each line to count words
                countWords += wordsPerLine.length;                  // count length of array and add to counter
            }

        System.out.println("1. Total lines: " + countLines);
        System.out.println("2. Total words: " + countWords);
        System.out.println("3. Total characters: " + lines.length());  // calculate all characters
    }
}
