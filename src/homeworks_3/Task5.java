package homeworks_3;

public class Task5 {
    public static void main(String[] args) {

        /* Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
выведите массивы на экран в двух отдельных строках. Посчитайте среднее
арифметическое элементов каждого массива и сообщите, для какого из массивов
это значение оказалось больше (либо сообщите, что их средние арифметические равны).
         */

        //Создадим переменные в которых будет храниться среднее арифмитическое
        double sumMas1=0,sumMas2=0;
        //Создадим из заполним первый массив. Выведем на экран значения его переменных.
        int[] Mas1 = new int[5];
        for(int i=0;i<Mas1.length;i++){
            Mas1[i]=(int)(Math.random()*16);
            System.out.print(Mas1[i] +" ");
            //Посчитаем и сохраним соеднее арифметическое первого массива
            sumMas1+=(double)Mas1[i]/Mas1.length;
        }
        System.out.println(" ");
        //Аналогично первому, создадим и выведем на экран второй массив
        int[] Mas2=new int[5];
        for(int i=0;i<Mas2.length;i++){
            Mas2[i] =(int)(Math.random()*16);
            System.out.print(Mas2[i] +" ");
            sumMas2+=(double)Mas2[i]/Mas2.length;
        }
        System.out.println(" ");
        //Сравним и выведем по условию средеарифметическое какого массива больше
        if(sumMas1==sumMas2)System.out.println("Средние арифметические значения двух массивов равны");
        else {if(sumMas1>sumMas2)
            System.out.println("Среднее арифметическое значение первого массива больше и равно ");
        else System.out.println("Среднее арифметическое значение второго массива больше и равно ");
        }
    }
}
