package Homework8;
//        Создайте массив из 8 случайных целых чисел из интервала [1;50]
//        Выведите массив на консоль в строку.
//        Замените каждый элемент с нечетным индексом на ноль.
//        Снова выведете массив на консоль в отдельной строке.

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] randomNum = new int[8];
        Random random = new Random();

        for (int i = 0; i < 8; i++){
            randomNum[i] = random.nextInt(50)+1;
        }
        System.out.println(Arrays.toString(randomNum));

        for (int i = 1; i < 8; i+=2) {
                randomNum[i] = 0;
        }
        System.out.println(Arrays.toString(randomNum));
    }
}
