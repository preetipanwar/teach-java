package com.teachjava.labs;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileInfo {
    // 8. Write a program that read a file name from the user,
    // then displays the information about:
    // 1. whether the file exists,
    // 2. whether the file is readable,
    // 3. whether the file is writable, the
    // 4. type of file and the
    // 5. length of file in bytes.

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file name: ");
        String input = sc.nextLine();

        File file = new File("src/com/teachjava/files/" + input);


        String fileName = file.getName();               // get the file name
        int pos = fileName.indexOf(".");                // get the index of .
        String[] splitName = fileName.split("");  // split name to array

        // print file name
        // print file size
        // print if file found
        if (file.isFile()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println(file.getName() + " is a file");
        }else{
            System.out.println(input + " is not a file");
            System.exit(1);                             // stop the program execution
        }

        // check if file is readable
        if (file.canRead()) {
            System.out.println("File is readable");
        }else{
            System.out.println("File is not readable");
        }

        // check if file is writable
        if (file.canWrite()) {
            System.out.println("File is writable");
        }else{
            System.out.println("File is not writable");
        }

        // print file extension
        System.out.print("File extension is: ");
        for (int x = pos + 1; x < splitName.length; x++ ){
            System.out.print(splitName[x]);             // print letters
        }




    }
}
