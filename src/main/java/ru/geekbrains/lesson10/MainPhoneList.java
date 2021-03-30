package ru.geekbrains.lesson10;

import java.util.Arrays;

public class MainPhoneList {
    public static void main(String[] args) {
        PhoneList tl = new PhoneList();
        tl.add("Бастрыкин", Arrays.asList("89148501232"));
        tl.add("Васильченко", Arrays.asList("89273211193"));
        tl.add("Паралеллограмов", Arrays.asList("89021478963"));
        tl.add("Расторгуев", Arrays.asList("89148721134"));
        tl.add("Брынза", Arrays.asList("88129238813"));
        tl.add("Кубатович", Arrays.asList("84918238383"));

        tl.viewAll();
        System.out.println("<<Номер по запросу>>");

        System.out.println(tl.get("Паралеллограмов"));

    }
}