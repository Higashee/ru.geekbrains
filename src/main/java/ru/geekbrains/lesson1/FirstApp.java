package ru.geekbrains.lesson1;

import java.time.LocalDate;
import java.util.Scanner;

public class FirstApp {
        public static void main(String[] args) {
//2. Все типы переменных и их инициализация.
            byte byteType = 10;
            int intType = 10;
            short shortType = 10;
            long longType = 100;
            char charType = 'A';
            float floatType = 2.55f;
            double doubleType = 122.123;
            boolean booleanType = false;

            System.out.println(calculation(1.55f, 3.22f, 4.7f, 2.2f));
            System.out.println(task10bound20(5, 9));
            positiveOrNegative(-9);
            System.out.println(isNegative(50));
            greetings("Сергей");

        }
//3.Вывести в консоль значение данного выражения.
        public static float calculation(float a, float b, float c, float d){
            return a * (b + (c / d));
        }
//4.Сложить два числа, если они в границах от 10 до 20(включительно) - дать ответ "true" иначе - "false"
//Так и не понял, как позволить пользователю ввести свои числа для данного метода и метода вообще.
        public static boolean task10bound20(int a, int b){
            if (10 <= a + b && 20 >= a + b ) {
                return true;
            }else
                return false;
        }
//5.Метод, определяющий знак числа.
        public static void positiveOrNegative(int a){
            if(a >= 0){
                System.out.println("Положительное");

            }else
                System.out.println("Отрицательное");

        }
//6.Метод, выводящий false, если число положительное и true, если отрицательное.
        public static boolean isNegative(int a){
            if(a >= 0){
                return false;
            } else {
                return true;
            }
        }
//7.Метод, приветствующий человека.
        public static void greetings(String name){
            System.out.println("Привет, " + name + "!");
        }
//8.Метод, определяющий, високосный-ли год. Не смог разобраться, не совсем понимаю, как использовать деление с модулем(%), потому сдаю только 7 задач.


    }


