package ru.geekbrains.lesson13;

public class Finish extends Stage {
    private int finishLine = 1;

    @Override
    public void go(Car car) {
        if (finishLine == 0) {
            System.out.println("[Время: " + System.currentTimeMillis() + "] " + car.getName() + " -> Финишировал");
        } else {
            finishLine--;
            System.out.println("[Время: " + System.currentTimeMillis() + "] " + car.getName() + " -> Финишировал первым!");
            System.out.println("\nПОБЕДИТЕЛЬ [" + car.getName() + "]\n");

        }
    }
}