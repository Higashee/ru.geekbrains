package ru.geekbrains.lesson3;

import javafx.animation.Animation;

import java.awt.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task1 game = new Task1();
        game.play();
        int nextgame;
        do {
            System.out.println("Желаете сыграть ещё раз? :)\nВведите 1, если желаете и 2, если не желаете.");
            Scanner wantOrNo = new Scanner(System.in);
            nextgame = wantOrNo.nextInt();
            if (nextgame == 1) {
                game.play();
            } else if(nextgame == 2) {
                System.out.println("Хорошо, спасибо за игру, до скорых встреч! :)");
            }
            else if(nextgame != 2 && nextgame !=1){
                System.out.println("Пожалуйста, введите 1, если хотите ПРОДОЛЖИТЬ игру и 2, если желаете ЗАКОНЧИТЬ :)");
            }
        } while(nextgame != 2);
        }
    public void play(){
        int RightAnswer = GenerateNumber(0);
        int TryCount = 3;
        System.out.println("Добро пожаловать, угадайте число от 0 до 9.\nУ вас есть 3 попытки.");
        Scanner sc = new Scanner(System.in);
        do {
            int playerNum = sc.nextInt();
            if(playerNum == RightAnswer){
                System.out.println("Поздравляю! Вы отгадали число.");
                break;
            }
            else if(playerNum > 9 || playerNum < 0){
                System.out.println("Вы ввели неверное значение, число должно быть от 0 до 9.\nПопробуйте ещё раз :)");
            }
            else if(playerNum < RightAnswer){
                System.out.println("Неправильный ответ, загаданное число больше данного.\nУ вас осталось " + (TryCount - 1) + " попыток.");
                TryCount--;
            }
            else if(playerNum > RightAnswer){
                System.out.println("Неправильный ответ, загаданное число меньше данного. \nУ вас осталось " + (TryCount - 1) + " попыток");
                TryCount--;
            }

        } while(TryCount != 0);
            System.out.println("Правильным ответом было " + RightAnswer);

    }

    public static int GenerateNumber(int a){
        int answer = (int) (Math.random() * 10);
        a = answer;
        return a;
    }

}
