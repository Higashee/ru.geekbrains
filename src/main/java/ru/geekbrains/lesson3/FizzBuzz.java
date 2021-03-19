package ru.geekbrains.lesson3;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzbuzz(3);
        fizzbuzz(5);
        fizzbuzz(9);
        fizzbuzz(15);
        fizzbuzz(17);
    }

    public static void fizzbuzz(int a) {
        String res = "";
        if (a % 3 == 0) {
            res = "Fizz";

        }
        if (a % 5 ==0){
            res += "Buzz";
        }
        System.out.println(res);
    }
}