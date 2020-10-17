package com.teachjava.labs;

public class Palindrome {

    // 5. Write a program that checks weather a given String is a Palindrome or not.

    // A palindrome is a word, phrase, or sentence reads the same backward or forward
    //  Palindrome Examples:
    //    pop
    //    deed
    //    kayak
    //    civic
    //    radar
    //    level
    //    deified
    //    rotator
    
    public static void main(String[] args) {

        String word = "madam";
        String reverse = "";

        // reversing the word to form the String reverse
        for( int counter = word.length() - 1; counter >= 0; counter-- ){
            reverse += word.charAt(counter);
        }

        // check if reverse == word
        if ( reverse.equals(word)){
            System.out.println(word + " is a palindrome");
        }
        else{
            System.out.println(word + " is not a palindrome");
        }
    }
}
