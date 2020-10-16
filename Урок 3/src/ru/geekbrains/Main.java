package ru.geekbrains;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*1.Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
 При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
 После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */
        String  enter0or1Str = "Введите 0 или 1";

        Scanner choiceNum = new Scanner(System.in);
        int num1 = 1;

        while (num1 == 1) {

            repeatGame(true);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");

            num1 = -1;

            while (num1 != 1 && num1 != 0)
            {
                if (choiceNum.hasNextInt()){
                    num1 = choiceNum.nextInt();
                    if (num1 != 1 && num1 != 0){
                        System.out.println(enter0or1Str);
                    }
                }else {
                    choiceNum.next();
                    System.out.println(enter0or1Str);
                }

            }
            if (num1 == 1) {
                System.out.println("Новая игра!");

            } else {
                System.out.println("Game over!");
            }
        }
    }

    //Метод repeatGame
    public static void repeatGame (Boolean debug) {
        Random rand = new Random();
        int hiddenNum = rand.nextInt(10);
        int numOfAttempts = 3;
        if (debug) System.out.println(hiddenNum);
        int i = 1;
        int userNum = 0;

        do {
            System.out.printf("Угадайте число от 0 до 9 (попытка %d из %d):\n", i, numOfAttempts);
            Scanner userScan = new Scanner(System.in);
            if (userScan.hasNextInt()) {
                userNum = userScan.nextInt();
                if (debug) System.out.println(userNum);

                if (hiddenNum == userNum) {
                    System.out.println("Поздравляем, вы угадали число!");
                } else {
                    if (i >= numOfAttempts) {
                        System.out.printf("Вы проиграли!\nБыло загадано число %d.\n", hiddenNum);
                    } else {
                        if (hiddenNum > userNum) {
                            System.out.println("Ваше число меньше загаданного. Попробуйте угадать еще раз!");
                        } else {
                            System.out.println("Ваше число , больше загаданного. Попробуйте угадать еще раз!");
                        }
                    }
                }
                i++;

            } else {
                System.out.println("Вы ввели некорректное значение!\nНеобходимо ввести целое число!");
            }

        } while (i < numOfAttempts + 1 && hiddenNum != userNum);
    }
}
