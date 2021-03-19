package ru.geekbrains.lesson3;

public class NumberCounter {
    // 23498 = 26 (Сумма всех цифр числа)
    public static void main(String[] args) {
        System.out.println(count(123));
        System.out.println(count(24398));
    }

    public static int count(int n) {
        int c = 0;
        while (n != 0) {
            int b = n %= 10;
            c += b;
            n = n / 10;
        }
    return c;
    }
}
