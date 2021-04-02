package ru.geekbrains.lesson11;

public class Apple extends Fruit {

    private static final float W = 1.0f;

    @Override
    public float getWeight() {
        return W;
    }

    @Override
    public String toString() {
        return "Яблоко{ " + super.getId() + " }";
    }
}