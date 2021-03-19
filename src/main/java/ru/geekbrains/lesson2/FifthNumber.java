package ru.geekbrains.lesson2;

import java.util.Arrays;
import java.util.OptionalInt;

public class FifthNumber {
    public static void main(String[] args) {
        int i;

        int[]arr = {11, 7, 5, 12, 100, 20, 1, 4, 9, 44};
        OptionalInt max = Arrays.stream(arr).max();
        System.out.println("Максимальное значение в массиве равно: " + max.getAsInt());
        OptionalInt min = Arrays.stream(arr).min();
        System.out.println("Минимальное значение в массиве равно: " + min.getAsInt());
    }
}
