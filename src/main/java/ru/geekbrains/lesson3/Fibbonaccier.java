package ru.geekbrains.lesson3;

public class Fibbonaccier {
    //1, 1, 2, 3, 5, 8, 13...
    public static void main(String[] args) {
        System.out.println(fib3(7));
        System.out.println(fib3(100));

    }

    public static long fib1(int n) {
        if (n < 3) {
            return 1;
        }
        return fib1(n - 1) + fib1(n - 2); // n ^ n
    }

    public static long fib2(int n) {
        if (n < 3) {
            return 1;
        }
        long previous = 1, next = 1, sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = previous + next;
            previous = next;
            next = sum;
        }
        return sum;
    }

    public static long fib3(int n) {
        return fib3(n, 0, 1);
    }

    public static long fib3(int n, long a, long b) {
        if (n == 0) {
            return a;

        }
        if (n == 1) {
            return b;
        }
        return fib3(n - 1, b, a + b);


    }
}
