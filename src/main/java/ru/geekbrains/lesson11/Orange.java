package ru.geekbrains.lesson11;

public class Orange extends Fruit {

    private static final float W_ORANGE = 1.5f;

    @Override
    public float getWeight() {
        return W_ORANGE;
    }

    @Override
    public String toString() {
        return "Апельсин{ "+ super.getId() +" }";
    }
}