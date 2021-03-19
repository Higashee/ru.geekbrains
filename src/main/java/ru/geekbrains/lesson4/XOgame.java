package ru.geekbrains.lesson4;
import java.util.Random;
import java.util.Scanner;
public class XOgame {
    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил ИИ");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра окончена");
    }

        //К данному решению пришёл не совсем сам, благодаря Анне из нашей группы, полностью его разобрал, посмотрел в отладчике и много раз протестировал, каких-либо ошибок не выявил :)
    public static boolean checkWin(char symb) {
        int countDiagonal1 = 0;
        int countDiagonal2 = 0;
        for (int i = 0; i < SIZE; i++) {
            int countLine = 0;
            int countRow = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb)
                    countLine ++;
                if (map[j][i] == symb)
                    countRow ++;
            }
            if (countLine == DOTS_TO_WIN ){
                return  true;}
            if (countRow  == DOTS_TO_WIN){
                return  true;
            }
            if (map[i][i] == symb)
                countDiagonal1++;
            if (map[i][map[i].length-i-1] == symb)
                countDiagonal2++;
        }
        if (countDiagonal1 == DOTS_TO_WIN) {
            return  true;
        }
        return countDiagonal2 == DOTS_TO_WIN;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("ИИ походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Пожалуйста, введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
