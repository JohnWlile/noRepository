package day4;                                                 //Заполнить двумерный массив (матрицу) случайными числами от 0 до 35.
                                                               // Размер матрицы задать m=10, n=4 (m - размерность по строкам, n - размерность по колонкам).
                                                                    //В консоль вывести индекс строки, сумма чисел в которой минимальна.
                                                                           // Если таких строк несколько, вывести индекс последней из них.


import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
       int[][] mass = new int[10][4];

        Random random = new Random();
        for(int i = 0; i< mass.length; i++){
            for(int q = 0; q< mass[i].length; q++) {
                mass[i][q] = random.nextInt(50);
            }
        }

        int minSum = 0;
        int minSumIdx = 0;
            for(int i = 0; i< mass.length; i++){
                int sum = 0;
               for(int q = 0; q< mass[i].length; q++) {
                   sum += mass[i][q];
               }
            if(sum < minSum)
                minSum = sum;
            minSumIdx = i;

            }

        System.out.println(minSumIdx);




    }}
