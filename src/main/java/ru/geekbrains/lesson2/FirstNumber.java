package ru.geekbrains.lesson2;

public class FirstNumber {
    public static void main(String[] args) {
    int i;
    int[]arr = {1, 0, 1, 0, 0, 1, 0, 0, 1, 0};

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }

    }

