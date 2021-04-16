package ru.geekbrains.lesson14;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.applet.Main;

public class TestApp {

    private MainApp app;

    @Before
    public void init() {
        app = new MainApp();
    }

    @Test
    public void task1Val1() {
        Assert.assertArrayEquals(new int[]{1, 2, 1}, app.task1(new int[]{4, 4, 8, 10, 4, 1, 2, 1}));
    }

    @Test
    public void task1Val2() {
        Assert.assertArrayEquals(new int[]{0}, app.task1(new int[]{4, 2, 2, 4, 0}));
    }

    @Test
    public void task1Val3() {
        Assert.assertArrayEquals(new int[]{8, 10, 8, 0}, app.task1(new int[]{4, 4, 4, 4, 10, 4, 8, 10, 8, 0}));
    }

    @Test
    public void task2Val1() {
        Assert.assertEquals(true, app.task2(new int[]{1, 4, 3, 1, 4, 3, 5, 6}));
    }

    @Test
    public void task2Val2() {
        Assert.assertEquals(false, app.task2(new int[]{4, 3, 5, 6, 0}));
    }

    @Test
    public void task2Val3() {
        Assert.assertEquals(false, app.task2(new int[]{1, 0, 2, 3, 1}));
    }

    @Test
    public void task2Val4() {
        Assert.assertEquals(false, app.task2(new int[]{}));
    }

    @Test
    public void task1AssertThrowException() {
        Assert.assertThrows(RuntimeException.class, () -> app.task1(new int[]{1, 4, 7, 6, 1, 10, 15, 20}));
    }

}