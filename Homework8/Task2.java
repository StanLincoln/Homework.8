package Homework8;
//        Создайте массив из 5 случайных целых чисел из интервала [10;99]
//        Выведите его на консоль в строку.
//        Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] randomNum = new int[5];
        Random random = new Random();

        for (int i = 0; i < 5; i++){
            randomNum[i] = random.nextInt(99)+10;
        }
        System.out.println(Arrays.toString(randomNum));

        boolean isIncreasing = true;
        for (int i = 1; i < 5; i++) {
            if (randomNum[i] <= randomNum[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) System.out.println("Массив является строго возрастающей последовательностью.");
        else System.out.println("Массив не является строго возрастающей последовательностью.");
    }
}
