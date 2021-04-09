package ru.geekbrains.lesson12;

import java.util.Arrays;

public class HomeTask {
    private static final int SIZE = 10000000;
    private static final int HALF = SIZE / 2;
    private boolean done1;
    private boolean done2;
    float[] arr = new float[SIZE];

    public static void main(String[] args) {

        HomeTask speedTest = new HomeTask();
        speedTest.method1();
        speedTest.method2();

    }

    public void arrayCalc(float[] arr, int cshift) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (float) (i + cshift) / 5) * Math.cos(0.2f + (float) (i + cshift) / 5) * Math.cos(0.4f + (float) (i + cshift) / 2));
        }
    }

    public synchronized void notifier() {
        if (done1 && done2) {
            notify();
        }
    }

    public void method1() {
        System.out.println("Первый метод начал работу.");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

        }
        System.currentTimeMillis();
        System.out.println("Метод 1 был выполнен за " + (System.currentTimeMillis() - a) + " мс");
    }

    public void method2() {
        HomeTask testOfSpeed = new HomeTask();
        Arrays.fill(arr, 1.0f);
        float[] tempArr1 = new float[HALF];
        float[] tempArr2 = new float[HALF];
        long startTime;
        long splitTime;
        long calculationTime;
        long finalTime;
        System.out.println("Второй метод начал работу.");
        startTime = System.currentTimeMillis();
        System.arraycopy(arr, 0, tempArr1, 0, HALF);
        System.arraycopy(arr, HALF, tempArr2, 0, HALF);
        splitTime = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            done1 = false;
            testOfSpeed.arrayCalc(tempArr1, 0);
            done2 = true;
            notifier();
        });
        Thread thread2 = new Thread(() -> {
            done1 = false;
            testOfSpeed.arrayCalc(tempArr1, HALF);
            done2 = true;
            notifier();
        });
        thread1.start();
        thread2.start();
        synchronized (this) {
            while (!(done1 && done2)) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        calculationTime = System.currentTimeMillis();
        System.arraycopy(tempArr1, 0, arr, 0, HALF);
        System.arraycopy(tempArr2, 0, arr, HALF, HALF);
        finalTime = System.currentTimeMillis();
        System.out.println("Второй метод закончил свою работу за " + (finalTime - startTime) + " мс.");
        System.out.println("На разделение массива на два потребовалось " + (splitTime - startTime) + " мс.");
        System.out.println("На вычисления потребовалось " + (calculationTime - splitTime) + " мс.");
        System.out.println("На возврат результата в массив потребовалось " + (finalTime - calculationTime) + " мс.");

    }


}