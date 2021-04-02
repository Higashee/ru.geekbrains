package ru.geekbrains.lesson11;

import java.util.Arrays;

public class FirstTask {
    public static void main(String[] args) {
    swapper();
    }
    public static void swapper(){
        String[] array1 = new String[]{"Кот", "Собака", "Хомячок"};
        System.out.println(Arrays.toString(array1));
        swap(array1, 0, 2);
        System.out.println(Arrays.toString(array1));
        Integer[] array2 = new Integer[]{1, 2, 3};
        System.out.println(Arrays.toString(array2));
        swap(array2, 0, 2);
        System.out.println(Arrays.toString(array2));
    }


    private static <A> void swap(A[] array, int id1, int id2){
        if (array.length < 2 || id1 < 0 || id2 < 0){
            return;
        } else {
            A empElement = array[id1];
            array[id1] = array[id2];
            array[id2] = empElement;
        }

    }

}
