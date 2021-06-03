package Lesson4.homework4;


import java.util.Random;
import java.util.Scanner;

public class GameXOTry2 {
    static final int SIZE = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT__ = '_';

    static char[][] map;
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);


    // ____________Main________________________________________
    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            peopleGo();
            printMap();
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
            compGo();
            printMap();
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    // ______________________________________________________________
    // Инициализация карты игры.
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT__;
            }
        }
    }

    // Распечатывание карты игры.
    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Метод Ход чедовека.
    public static void peopleGo() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате Y X ");
            y = scanner.nextInt() - 1;
            x = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    // Ход компьютера.
    public static void compGo() {
        int x, y;
        do {
            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;

    }


    // Проверка, пустое ли поле для хода. И валидность ввода.
    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) return false;
        return map[y][x] == DOT__;
    }

    // Проверка на переполнение массива.
    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT__) ;
                return false;
            }

        }
        return true;
    }
}
