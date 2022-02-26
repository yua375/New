package homeworks_4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы). */

        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int[][] array = new int[size][size];  // Создаём массив int размером в size

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(50);
                //              System.out.println(array[i][j]);
            }
        }

        //          System.out.print("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " "); // Выводим на экран, полученный массив
            }
            System.out.println();
        }
        // Считаем сумму четных элементов, стоящих на главной диагонали
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j && array[i][j] % 2 == 0) sum += array[i][j];

                System.out.println(sum);
            }
        }

        // Вывести нечетные элементы находящиеся под главной диагональю(включительно)
    }
}

