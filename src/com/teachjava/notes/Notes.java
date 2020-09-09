package com.teachjava.notes;

public class Notes {
    public static void main(String[] args) {

        int[][] array = {{1,2},{3,4}};

        for (int i=0; i < 2; i++){
            for(int j=0; j < 2; j++){
                System.out.println("array[" + i + "][" + j + "] = " + array[i][j]);
            } // break
        }

        // i=0 j=0 --> 1
        // i=0 j=1 --> 2
        // i=1 j=0 --> 3
        // i=1 j=1 --> 4

    }
}
