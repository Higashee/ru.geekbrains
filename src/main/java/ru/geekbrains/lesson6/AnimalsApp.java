package ru.geekbrains.lesson6;

public class AnimalsApp {
    public static void main(String[] args) {
        Cat cat = new Cat(10, "Малыш", 200);
        Dog snezhok = new Dog(8, "Снежок", 400);
        Dog boy = new Dog(7, "Мальчик", 10);
        cat.swim();
        cat.run();
        boy.swim();
        boy.run();
        snezhok.swim();
        snezhok.run();
        System.out.println("Всего было " + Dog.numb + " собаки :>");
        System.out.println("И " + Cat.numb + " кошки :)");
        System.out.println("И суммарно " + Animal.numb + " зверька.");
    }
}
