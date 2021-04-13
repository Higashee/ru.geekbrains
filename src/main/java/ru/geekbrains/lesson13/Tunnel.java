package ru.geekbrains.lesson13;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {

    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }

    Semaphore semaphore = new Semaphore(MainClass.CARS_COUNT / 2);

    @Override
    public void go(Car car) {
        try {
            try {
                System.out.println(car.getName() + " готовится к этапу(ждет): " + description);
                semaphore.acquire();
                System.out.println(car.getName() + " начал этап: " + description);
                Thread.sleep(length / car.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(car.getName() + " закончил этап: " + description);
                semaphore.release();
            }
        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }
}