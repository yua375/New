package homeworks_3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        /* Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
         */


        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
        System.out.println("===============");
        for (int i = 0; i < 15; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");


            }
        }
    } }
