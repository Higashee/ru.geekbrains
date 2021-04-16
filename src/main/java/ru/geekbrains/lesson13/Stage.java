package ru.geekbrains.lesson13;

public abstract class Stage {
    protected int length;
    protected String description;

    protected Stage() {
    }

    public String getDescription() {
        return description;
    }

    public abstract void go(Car car);
}