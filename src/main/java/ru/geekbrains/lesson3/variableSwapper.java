package ru.geekbrains.lesson3;

public class variableSwapper {
    public static void main(String[] args) {
        swap2(3, 4);
    }

    public static void swap1(int a, int b) {
        System.out.printf("a = %d, b = %d;", a, b);
        int c = a;
        a=b;
        b=a;

        System.out.printf("a = %d, b = %d;\n", a, b);
    }
    public static void swap2(int a, int b) {
        System.out.printf("a = %d, b = %d;", a, b);
        a += b;
        b = a - b;
        a -= b;

        System.out.printf("a = %d, b = %d;\n", a, b);
    }
    public static void swap3(int a, int b) {
        System.out.printf("a = %d, b = %d;", a, b);
        a ^= b;
        b ^= a;
        a ^= b;

        System.out.printf("a = %d, b = %d;\n", a, b);
    }
}
//VariableSwapper

