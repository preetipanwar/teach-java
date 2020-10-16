package com.teachjava.labs;

import java.util.ArrayList;

public class WordFrequency {
    public static void main(String[] args) {
        String paragraph = "Nory was a Catholic because her mother was a Catholic " +
                "and Nory’s mother was a Catholic because her father was a Catholic " +
                "and her father was a Catholic because his mother was a Catholic or had been";

        // convert paragraph to para (array), split the words with whitespace.
        String[] para = paragraph.split(" ");

        // make a dynamic array, which will keep track of printed words
        ArrayList<String> printedWord = new ArrayList<String>();
        printedWord.add("");

        String word;        // initialize word variable
        int count = 0;      // initialize counter

        for(int x=0; x < para.length; x++){
            word = para[x];                             // pick a word on each iteration
            for ( int y = 0; y < para.length; y++){
                if (word.equals(para[y])){              // if picked word found again
                    count++;                            // increase the counter
                }
            }
            // traverse through array to see if the word is already printed before
            for (int j=0; j < printedWord.size(); j++){
                // if same word is found in array then word count is already printed
                // break since we don't want to print the word count again
                if(word.equals(printedWord.get(j))){
                    break;
                }
                // if the word is not found in array print it and add it to printedWord array
                if (j == printedWord.size() - 1){
                    System.out.println(word + ": " + count);
                    printedWord.add(word);
                }
            }
            count = 0;              // reset count for the next word
        }
    }
}
