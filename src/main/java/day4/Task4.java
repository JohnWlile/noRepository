package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] massive = new int[100];
        Random random = new Random();
        for(int i = 0; i< massive.length; i++)
          massive[i]  = random.nextInt(10000);

        int maxSum = 0;
        int idx = 0;
        for(int k = 0; k < massive.length - 2; k++){
            int sumElem = 0;
            for(int j = k; j < k + 3; j++) {
                sumElem += massive[j];
            }
            if( sumElem > maxSum) {
                maxSum = sumElem;
               idx = k;
            }


        }
        System.out.println("Сумма тройки: "+maxSum);
        System.out.println("Индекс первого элемента тройки: "+idx);













    }
}
