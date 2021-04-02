package ru.geekbrains.lesson11;

public class Application {
    public static void main(String[] args) {
        app();
    }
    public static void app(){
        Box<Apple> appleBox = new Box<>("A");
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.printf("%s вес %f\n", appleBox, appleBox.getWeight());

        Box<Orange> orangeBox = new Box<>("B");
        orangeBox.add(new Orange());
        System.out.printf("%s вес %f\n", orangeBox, orangeBox.getWeight());

        Box<Apple> appleBox2 = new Box<>("C");
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());
        System.out.printf("%s вес %f\n", appleBox2, appleBox2.getWeight());
        System.out.printf("Сравниваем %s и %s, вышло: %b\n", appleBox, appleBox2, appleBox.compare(appleBox2));
        System.out.printf("Сравниваем %s и %s, вышло: %b\n", appleBox, orangeBox, appleBox.compare(orangeBox));

        appleBox.pourTo(appleBox2);
        System.out.printf("Пересыпаем %s -> %s получилось %s %s\n", appleBox.getName(), appleBox2.getName(), appleBox, appleBox2);

    }
}

