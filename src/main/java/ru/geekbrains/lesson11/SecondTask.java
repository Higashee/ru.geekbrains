package ru.geekbrains.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondTask {
    public static void main(String[] args) {

        String[] array1 = new String[]{"Кот", "Пёс", "Котопёс"};
        System.out.println(Arrays.toString(array1));
        System.out.println(ArrayListing(array1));

        Integer[] array2 = new Integer[]{1, 2, 3};
        System.out.println(Arrays.toString(array2));
        System.out.println(ArrayListing(array2));


    }


    private static <A> ArrayList<A> ArrayListing(A[] array) {
        ArrayList<A> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, array);
        return arrayList;
    }
}
