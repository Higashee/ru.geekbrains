package ru.geekbrains.lesson6;

public class Dog extends Animal{
    public static int numb = 0;
    public Dog(int distance, String name, int rundist){
        this.distance = distance;
        this.name = name;
        this.rundist = rundist;
        numb++;
    }
    public void swim(){
        if(distance > 0 && distance <= 10){
            System.out.println(name + " проплыл " + distance + " м.");
        } else if(distance == 0){
            System.out.println(name + " благодарен за то, что вы не отправили его плавать :)");
        }
        else{
            System.out.println(name + " не может столько плавать, ему нужно немного подсушиться после 10 метров :)");
        }

    }
    public void run(){
        if(rundist <= 500 && rundist > 0){
            System.out.println(name + " пробежал " + rundist + " м.");

        } else if(rundist > 500){
            System.out.println(name + " не может столько бегать! Ему нужен отдых после 500 метров...");

        }
    }
    public static int counter(){
        return numb;
    }
}