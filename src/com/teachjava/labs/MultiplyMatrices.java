package com.teachjava.labs;

// 3. Write a program to multiply two given matrices.
public class MultiplyMatrices {
    public static void main(String[] args) {

        int[][] m1 = {{1, 2}, {3, 4}};
        int[][] m2 = {{5, 6}, {7, 8}};
        int[][] m3 = new int[2][2];

//        1   2       5   6                1=[0][0]    2=[0][1]  |   5=[0][0]    6=[0][1]
//        3   4       7   8                3=[1][0]    4=[1][1]  |   7=[1][0]    8=[1][1]

//        (1, 2).(5, 7)   (1, 2).(6, 8)
//        (3, 4).(5, 7)   (3, 4).(6, 8)

//        (1x5 + 2x7)       (1x6 + 2x8)     [0][0]x[0][0]+[0][1]x[1][0]     [0][0]x[0][1]+[0][1]x[1][1]
//        (3x5 + 4x7)       (3x6 + 4x8)     [1][0]x[0][0]+[1][1]x[1][0]     [1][0]x[0][1]+[1][1]x[1][1]

//        Read more about matrices multiplication https://www.mathsisfun.com/algebra/matrix-multiplying.html

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m3[i][j] = 0;                           // initialize to zero every iteration to perform sum
                for(int k = 0; k < 2; k++ ){
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        System.out.println("-----------");
        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3.length; j++) {
                System.out.print(m3[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("-----------");
    }
}

