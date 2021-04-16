package ru.geekbrains.lesson14;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class TaskParametrizedTest {

    private MainApp app;

    private int[] input;
    private int[] output;

    public TaskParametrizedTest(int[] input, int[] output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void init() {
        app = new MainApp();
    }

    @Test
    public void task1() {
        Assert.assertArrayEquals(output, app.task1(input));
    }

    @Parameterized.Parameters(name = "{index}: Array in: {0}, Array out: {1}")

    public static Iterable<Object[]> dataForTask1() {
        return Arrays.asList(new Object[][]{
                {new int[]{4, 4, 8, 10, 4, 1, 2, 1}, new int[]{1, 2, 1}},
                {new int[]{4, 2, 2, 4, 0}, new int[]{0}},
                {new int[]{1, 4, 4, 4, 10, 4, 8, 10, 8, 0}, new int[]{8, 10, 8, 0}},
        });
    }
}