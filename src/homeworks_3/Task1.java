package homeworks_3;

 public class Task1 {

    public static void main(String[] args) {

    /* 1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
     массива на экран сначала в строку, отделяя один элемент от другого пробелом,
     а затем в столбик (отделяя один элемент от другого началом новой строки).
     Перед  созданием массива подумайте, какого он будет размера.
     */

    int a = 2;
    int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
        array[i] = a;
        a += 2;

        System.out.println(array[i] + " ");
    }

    }
}