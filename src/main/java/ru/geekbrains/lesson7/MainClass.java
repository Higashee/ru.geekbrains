package ru.geekbrains.lesson7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] catArr = new Cat[5];
        catArr[0] = new Cat("Барсик", 10);
        catArr[1] = new Cat("Снежок", 8);
        catArr[2] = new Cat("Пьер", 5);
        catArr[3] = new Cat("Жан", 20);
        catArr[4] = new Cat("Дио", 15);
        Plate plate = new Plate(40);
        plate.info();
        catArr[0].eat(plate);
        catArr[1].eat(plate);
        catArr[2].eat(plate);
        catArr[3].eat(plate);
        catArr[4].eat(plate);
        plate.info();
        plate.addFood();
//
    }


}
