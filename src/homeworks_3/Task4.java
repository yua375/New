package homeworks_3;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
/*
          Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
        массив на экран в строку. Замените каждый элемент с нечётным индексом на
        ноль. Снова выведете массив на экран на отдельной строке.
*/
        int[] array = new int[20];
        Random random = new Random();
        for(int i=0;i<array.length;i++){
            array[i] = random.nextInt(21);
            System.out.println(array[i]);
        }
        System.out.println("===========================");

        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0)array[i]=0;
            System.out.println(array[i] +"");
        }
    }
}
