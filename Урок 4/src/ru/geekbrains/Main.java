package ru.geekbrains;

import java.util.Random;
import java.util.Scanner;

public class Main {

    //Константы
    static char[][] map;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '_';
    static final int MAP_SIZE = 3;
    static final int DOTS_TO_WIN = 3;

    public static void main(String[] args) {
        initMap();                          //Инициализация поля
        printMap();                         //Первоначальный вывод пустого поля
        while (true) {
            makeHumanTurn();               // Ход человека
            printMap();                    //Вывод поля с установленными на текущий ход фишками
            if (hasBestWin(DOT_X)) {            //Проверка на победу
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {              //Проверка на ничью
                System.out.println("Ничья");
                break;
            }
            makeComputerTurn();            //Ход компьютера:
            printMap();                     //Вывод поля с установленными на текущий ход фишками
            if (hasBestWin(DOT_O)) {            //Проверка на победу
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) {              //Проверка на ничью
                System.out.println("Ничья");
                break;
            }
        }
    }

    //МЕТОДЫ

    //Инициализация поля
    static void initMap() {
        map = new char[MAP_SIZE][MAP_SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    //Вывод пустого поля
    static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Ход человека: ввод из консоли координат точки установки фишки
    static void makeHumanTurn() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Введите координаты постановки символа в формате: X˽Y)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            if (!isCellValid(x, y)) {
                System.out.println("Вы не можете занять эту точку! Повторите ввод.");
            }
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    // Ход компьютера: генерация компьютером координат точки установки фишки
    static void makeComputerTurn() {
        Random rand = new Random();
        int x;
        int y;
        do {
            x = rand.nextInt(MAP_SIZE);
            y = rand.nextInt(MAP_SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
        System.out.println("Компьютер занял фишкой точку " + (x + 1) + " " + (y + 1));
    }

    //Проверка хода: не поставил ли игрок свою фишку на занятое место
    static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= MAP_SIZE || y < 0 || y >= MAP_SIZE) {
            return false;
        } else {
            if (map[y][x] == DOT_EMPTY) {
                return true;
            } else {
                return false;
            }
        }
    }

    //Проверка на ничью
    static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    //Проверка на победу (заполнение 3 в ряд или в диагональ)
    static boolean hasBestWin(char sumb) {
        boolean resDLR = true;
        boolean resDRL = true;

        for (int i = 0; i < map.length; i++) {
            boolean resH = true;
            boolean resV = true;
            for (int j = 0; j < map[i].length; j++) {
                resH = resH & (map [i][j] == sumb);
                resV = resV & (map [j][i] == sumb);
            }
            if (resH || resV) return true;

            resDLR = resDLR & (map [i][i] == sumb);
            resDRL = resDRL & (map [(map[i].length-1)-i][i] == sumb);
            if (((i+1)==map[i].length) && (resDLR || resDRL)) return true;
        }
        return false;
    }
}