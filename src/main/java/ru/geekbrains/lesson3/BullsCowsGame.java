package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class BullsCowsGame {

    // 3850
    // 1230
    // cows 1, bulls = 1
    public static void main(String[] args) {
        BullsCowsGame game = new BullsCowsGame();
        game.play();
    }
    public void play(){
        int[] guessNum = generateNumber();
        Scanner sc = new Scanner(System.in);
        int step = 0;
        int bulls = 0;
        do {
            int cows = 0;
            bulls = 0;
            String playerNum = sc.nextLine();
            for (int i = 0; i < 4; i++) {
                if(guessNum[i] == playerNum.charAt(i) - '0') {
                    bulls++;
                } else if(playerNum.contains(String.valueOf(guessNum[i]))) {
                    cows++;
                }
                step++;
                System.out.printf("%d. Введено число %s, быков %d, коров %d\n", step, playerNum, bulls, cows);
            }

        } while(bulls != 4);
        System.out.println("Поздравляю!");

    }
    private int[] generateNumber() {
        int[] a = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            int i1 = rnd.nextInt(10);
            int i2 = rnd.nextInt(10);
            int c = a[i2];
            a[i2] = a[i1];
            a[i1] = c;
        }
        return new int[]{a[0], a[1], a[2],a[3]};

    }
}

