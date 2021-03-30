package ru.geekbrains.lesson10;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {

        countWords();


    }

    static void countWords() {
        String[] myArray = {"ложка", "кружка", "дерево", "кружка", "ложка", "растение", "домик", "кружка", "домик", "дерево", "ложка", "яблоко", "компот"};

        System.out.println("Начальный массив: " + Arrays.toString(myArray) + " .");

        Arrays.sort(myArray);
        ArrayList<String> collection = new ArrayList<>((Arrays.asList(myArray)));
        String pw = "";
        for (String str : collection) {
            if (pw == str) {
                continue;
            }

            Stream stream = collection.stream();

            long test = stream.filter(p -> p.equals(str)).count();

            if (test == 1) {
                System.out.printf("Cлово %s уникальное и встречается единожды.\n", str);
            } else {
                System.out.printf("Слово %s встречается %d раза.\n", str, test);
            }
            pw = str;
        }


    }
}


