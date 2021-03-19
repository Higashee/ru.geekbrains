package ru.geekbrains.lesson6;

public class Cat extends Animal{
    public static int numb = 0;
    public Cat(int distance, String name, int rundist){
        this.distance = distance;
        this.name = name;
        this.rundist = rundist;
        numb++;
    }
    public void swim(){
        if(distance != 0){
            System.out.println(name + " - кот, а котики не умеют плавать :(");
        } else if(distance == 0){
            System.out.println(name + " благодарен за то, что вы не отправили его плавать :)");
        }

    }
    public void run(){
        if(rundist <= 200 && rundist > 0){
            System.out.println(name + " пробежал " + rundist + " м.");

        } else if(rundist > 200){
            System.out.println(name + " не может столько бегать! Ему нужен отдых после 200 метров...");

        }
    }
    public static int counter(){
        return numb;
    }

}
