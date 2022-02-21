package homeworks_3;

public class Task2 {


    public static void main(String[] args) {

        /* Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
         строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
         порядке (99 97 95 93 … 7 5 3 1)
         */


        int a=0;
        for(int i=1;i<=99;i++){
            if(i%2!=0)a++;
        }

        int[] Array = new int[a];
        for(int i=1,b=0;i<=99;i++){
            if(i%2!=0){
                Array[b]=i;
                System.out.print(Array[b]+" ");
                b++;
            }
        }

        System.out.println(" ");
        for(int i=Array.length-1;i>=0;i--){
            System.out.println(Array[i]);
        }
    }
}