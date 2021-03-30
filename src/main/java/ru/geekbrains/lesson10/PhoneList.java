package ru.geekbrains.lesson10;

import java.util.*;

public class PhoneList {

    private TreeMap<String , List<String>> list;

    public PhoneList() {
        list = new TreeMap<>();
    }

    void add(String name, List<String> ls){

        list.put(name, ls);
    }

    List<String> get(String familia){
        return list.get(familia);
    }
    void viewAll(){
        System.out.println("Справочник целиком: ");
        for(Map.Entry<String , List<String>> entry : list.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}

