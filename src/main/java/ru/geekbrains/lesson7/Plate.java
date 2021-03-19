package ru.geekbrains.lesson7;

import java.util.Scanner;

public class Plate {
    public int food;
    public int addedFood = 0;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }
    public void addFood(){
        System.out.println("Желаете доложить еды в миску?\nЕсли да, то сколько?\nЕсли нет, напишите 0. :)");
        Scanner scanner = new Scanner(System.in);
        int addedFood = scanner.nextInt();
        if(addedFood != 0){
            System.out.println("Спасибо, теперь в тарелке " + (food + addedFood) + " еды :)");
        }
        else {
            return;
        }
    }
}