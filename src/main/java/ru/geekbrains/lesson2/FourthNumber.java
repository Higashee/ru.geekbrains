package ru.geekbrains.lesson2;

import java.util.Arrays;

public class FourthNumber {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int i,j;
        for (i = 0; i < arr.length; i++)
            for (j = 0; j < arr.length; j++) {

                if(i == j) {
                    arr[i][j] = 1;
                }

                System.out.println("arr[" + i + j + "] = " + arr[i][j]);

            }
    }
}
