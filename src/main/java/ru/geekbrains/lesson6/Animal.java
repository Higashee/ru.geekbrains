package ru.geekbrains.lesson6;

public class Animal {
    int distance, rundist;
    String name;
    public static int numb = 0;
    public Animal(){
        numb++;
    }
    public Animal(int distance, String name, int rundist){
        this.distance = distance;
        this.name = name;
        this.rundist = rundist;
    }
    public void swim(){
        System.out.println(name + " проплыл " + distance + " м.");
    }
    public void run(){
        System.out.println(name + " пробежал " + rundist + " м.");
    }
    public static int counter(){
        return numb;
    }
}
