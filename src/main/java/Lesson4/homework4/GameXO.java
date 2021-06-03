package Lesson4.homework4;

import java.util.Scanner;

public class GameXO {
    private static final char X = 'X';
    private static final char O = 'O';
    private static final char DEFAULT = '_';
    private static final char DELIMITER = '|';
    //  |x|_|_|
    //  |x|o|_|
    //  |o|_|_|
    private static final char[][] MAP = new char[3][3];

    private static void fillMap() {
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                MAP[i][j] = DEFAULT;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                System.out.print(DELIMITER + "" + MAP[i][j]);
            }
            System.out.println(DELIMITER);
        }
    }

    public static void game() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Делайте ваш ход");
            int x = in.nextInt(), y = in.nextInt();
            if (validInput(x, y)) {
                MAP[x][y] = X;
                if (isWin(X)) {
                    System.out.println("Вы победили!");
                }
                movePc();
                if (isWin(O)) {
                    System.out.println("вы проиграли!");
                    return;
                }
            }
            printMap();
        }
    }

    private static void movePc() {
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                if (validInput(i, j)) {
                    MAP[i][j] = O;
                    return;
                }
            }

        }
    }

    public static boolean isWin(char x) {
        return MAP[0][0] == MAP[1][1]
                && MAP[1][1] == MAP[2][2]
                && MAP[2][2] == x;

    }

    public static boolean validInput(int x, int y) {
        boolean inMap = x >= 0 && y >= 0 && x < MAP.length && y < MAP.length;
        return inMap && MAP[x][y] == DEFAULT;
    }

    public static void main(String[] args) {
        System.out.println(" Вы в игре 'Крестики нолики'");
        System.out.println("На каждом ходе вы вводите два числа: Номер строки и номер столбца");
        fillMap();
        printMap();
        game();
    }
}
