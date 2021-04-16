package ru.geekbrains.lesson14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class MainApp {

    private static final Logger LOGGER = LogManager.getLogger(MainApp.class.getName());

    public static void main(String[] args) {

        LOGGER.debug("Debug");
        LOGGER.info("Info");
        LOGGER.warn("Warn");
        LOGGER.error("Error");
        LOGGER.fatal("Fatal");
        LOGGER.info("String: {}.", "Hello, World");

        try {
            show();
        } catch (Exception e) {
            LOGGER.fatal(Arrays.toString(e.getStackTrace()));
            e.printStackTrace();
        }
    }

    private static void show() {
        MainApp app = new MainApp();

        System.out.println(Arrays.toString(app.task1(new int[]{3, 5, 6, 7, 4, 5, 7, 8})));
        System.out.print(app.task2(new int[]{3, 4, 6, 7, 1, 5, 7, 8}));
    }

    public int[] task1(int[] arr) {

        LOGGER.trace("Входные данные метода task1:", Arrays.toString(arr));
        int[] res;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                res = new int[arr.length - i - 1];
                System.arraycopy(arr, i + 1, res, 0, res.length);
                LOGGER.trace("Результат метода task1:" + Arrays.toString(res));
                return res;
            }
        }
        throw new RuntimeException("Не хватает цифры '4'");
    }

    public boolean task2(int[] arr) {

        LOGGER.trace("Входные данные метода task2", Arrays.toString(arr));
        return Arrays.stream(arr)
                .filter(el -> el == 1 || el == 4)
                .distinct()
                .count() == 2;
    }
}