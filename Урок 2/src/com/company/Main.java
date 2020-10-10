package com.company;

public class Main {

    public static void main(String[] args) {

        /*Задание_1 Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

        System.out.println("Задание №1");

        int[] arrReplacement = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        arrPrint(arrReplacement, "Массив до замены:");

        for (int i = 0; i < arrReplacement.length; i++) {
            if (arrReplacement[i] == 0)
                arrReplacement[i] = 1;
            else
                arrReplacement[i] = 0;
        }
        arrPrint(arrReplacement, "\nМассив после замены:");


        /*Задание_2 Задать пустой целочисленный массив размером 8.
        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/

        System.out.println("\n\nЗадание №2");

        int[] arr8Cell = new int[8];

        for (int i = 0; i < arr8Cell.length; i++) {
            arr8Cell[i] = i * 3;
        }
        arrPrint(arr8Cell, "Инициализированный массив:");


        /*Задание_3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        пройти по нему циклом, и числа меньшие 6 умножить на 2;*/

        System.out.println("\n\nЗадание №3");

        int[] arrWithMultiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        arrPrint(arrWithMultiplication, "Массив до:");

        for (int i = 0; i < arrWithMultiplication.length; i++) {
            if (arrWithMultiplication[i] < 6) {
                arrWithMultiplication[i] = arrWithMultiplication[i] * 2;
            }
        }
        arrPrint(arrWithMultiplication, "\nМассив после:");


         /*Задание_4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/

        System.out.println("\n\nЗадание №4");

        int[][] arrSquare = new int[3][3];

        arrPrintSquare(arrSquare, "Массив до:");

        arrSquare[0][0] = 1;
        arrSquare[1][1] = 1;
        arrSquare[2][2] = 1;

        arrPrintSquare(arrSquare, "\nМассив после:");


        /*Задание_5 **Задать одномерный массив и найти в нем
        минимальный и максимальный элементы (без помощи интернета);*/

        System.out.println("\n\nЗадание №5");

        int[] arrMinMax = {1, 8, 3, 5, 16, 7};

        arrPrint(arrMinMax, "Элементы массива:");
        arrPrintMinMax(arrMinMax);

        /*Задание_6 ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        граница показана символами ||, эти символы в массив не входят.*/

        System.out.println("\n\nЗадание №6");

        int[] arrLimit = {7, 2, 3, 1, 4, 10, 5, 2};

        arrPrint(arrLimit, "Элементы массива:");
        System.out.println();
        System.out.printf("В массиве есть место, в котором сумма левой и правой части массива равны: %b", arrPrintLimit(arrLimit));
    }

    //Методы функций

    //Метод arrPrint
    public static void arrPrint(int[] arr, String message) {
        System.out.println(message);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d,", arr[i]);
        }
    }

    //Метод arrPrintSquare
    public static void arrPrintSquare(int[][] arrS, String message) {
        System.out.println(message);

        for (int i = 0; i < arrS.length; i++) {
            for (int j = 0; j < arrS[i].length; j++) {
                System.out.printf("%d,", arrS[i][j]);
            }
            System.out.print("\n");
        }
    }

    //Метод arrPrintMinMax
    public static void arrPrintMinMax(int[] arrMM) {
        int Min = arrMM[0];
        int Max = arrMM[0];
        for (int i = 0; i < arrMM.length; i++) {
            if (arrMM[i] < Min) {
                Min = arrMM[i];
            }
            if (arrMM[i] > Max) {
                Max = arrMM[i];
            }
        }
        System.out.printf("\nМинимальное значение %d", Min);
        System.out.printf("\nМаксимальное значение %d", Max);
    }

    //Метод arrPrintLimit
    public static boolean arrPrintLimit(int[] arrL) {

        for (int i = 0; i < arrL.length; i++) {
            int summLeft = 0;

            for (int j = i; j >= 0; j--) {
                summLeft = summLeft + arrL[j];
            }
            System.out.printf("Сумма слева:%d\n", summLeft);

            int summRight = 0;

            for (int h = i + 1; h < arrL.length; h++) {
                summRight = summRight + arrL[h];
            }
            System.out.printf("Сумма справа:%d\n", summRight);

            if (summLeft == summRight) {
                return (true);
            }
        }
        return (false);
    }
}

