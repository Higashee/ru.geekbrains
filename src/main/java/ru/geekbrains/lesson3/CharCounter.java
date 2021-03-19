package ru.geekbrains.lesson3;

public class CharCounter {
    //"abchjkii kllb"
    //a - 1, b - 2 ... z = 0
    public static void main(String[] args) {
        int[] abcs = count("abc");
        for (char i = 0; i < abcs.length; i++) {
            if (abcs[i] != 0) {
                System.out.printf("%d встретилось %d раз\n", i, abcs[i]);
            }
        }

    }

    public static int[] count(String s) {
        int[] c = new int[127];
        char[] chars = s.toCharArray();
        for (char ch : chars) { // for-each
            c[ch]++;

        }
        return c;
    }
}



