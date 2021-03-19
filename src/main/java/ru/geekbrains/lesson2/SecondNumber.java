package ru.geekbrains.lesson2;

public class SecondNumber {
    public static void main(String[] args) {
        int[] arr = new int[9];
        int i;

        for (i = 0; i < arr.length; i++) {

            arr[i + 1] = arr[i] + 3;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }

}
