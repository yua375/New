package Lesson4; // Сортировка пузырьком

import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {

        int[] array = new int[]{2,3,1,4,0,-2};
        for (int i =0; i < array.length; i++) {
            for (int j = array.length -1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                        int buf = array[j];
                        array[j] = array[j - 1];
                        array [j - 1] = buf;
                }
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
