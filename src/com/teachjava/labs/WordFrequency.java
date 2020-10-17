package com.teachjava.labs;

import java.util.ArrayList;

//  7. Write a program to make frequency count of words in a text.

public class WordFrequency {

    // method to add a word to an array of String
    // arguments required --> (array, word)
    static String[] addWord(String[] arr, String word){
        String[] printedWordArray = new String[arr.length + 1];

        // copy every element of arr to printedWordArray
        for(int x=0; x < arr.length; x++){
            printedWordArray[x] = arr[x];
        }
        // add the word to the last position
        printedWordArray[arr.length] = word;
        return printedWordArray;                // return new array
    }

    public static void main(String[] args) {
        String paragraph =
                "Nory was a Catholic because her mother was a Catholic " +
                "and Nory’s mother was a Catholic because her father was a Catholic " +
                "and her father was a Catholic because his mother was a Catholic or had been";

        // convert paragraph to para (array), split the words with whitespace.
        String[] para = paragraph.split(" ");
        String printedWordArray[] = new String[1];      // holding 1 word to for loop initially

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
            for (int j=0; j < printedWordArray.length; j++){
                // if same word is found in array then word count is already printed
                // break since we don't want to print the word count again
                if(word.equals(printedWordArray[j])){
                    break;
                }
                // if the word is not found in array print it and add it to printedWord array
                if (j == printedWordArray.length - 1){
                    System.out.println(word + ": " + count);
                    printedWordArray = WordFrequency.addWord(printedWordArray, word);
                }
            }
            count = 0;              // reset count for the next word
        }
    }
}
// We went through all this hassle of creating a new function to add a word to an an array
// by replacing it with new array because in Java arrays cannot be edited and it size once
// initialized cannot be changed.
// A dynamic style of Array in java is called ArrayList<>, read more online about it, it allows
// addition of new elements, modification in size and has many useful features.
// Below I have used ArrayList<> to solve the same problem.

 class WordFrequencyAlternative {
        // replacing for with for-each loop
        // which is easier to read
     public static void main(String[] args) {
         String paragraph =
                 "Nory was a Catholic because her mother was a Catholic " +
                 "and Nory’s mother was a Catholic because her father was a Catholic " +
                 "and her father was a Catholic because his mother was a Catholic or had been";

         // convert paragraph to para (array), split the words with whitespace.
         String[] para = paragraph.split(" ");

         // make a dynamic array, which will keep track of printed words
         ArrayList<String> printedWord = new ArrayList<String>();
         printedWord.add("");

         String word;        // initialize word variable
         int count = 0;      // initialize counter

         for (String x : para) {
             word = x;
             for (String y : para) {
                 if (word.equals(y)) {
                     count++;
                 }
             }
             for (int j = 0; j < printedWord.size(); j++) {
                 if (word.equals(printedWord.get(j))) {
                     break;
                 }
                 // if the word is not found in array print it and add it to printedWord array
                 if (j == printedWord.size() - 1) {
                     System.out.println(word + ": " + count);
                     printedWord.add(word);
                 }
             }
             count = 0;              // reset count for the next word
         }
     }
 }