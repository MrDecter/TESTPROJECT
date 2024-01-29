package Lesson;

import java.util.Arrays;
/**
 * Функуция поиска суммы чисел в массиве
 */
/
public class sumArrays {
    public static void main(String[] args){

        int[] arrayX = {1321, 12, 54, -84, 22, -887, 74, 3, 5, 6, -9, 0, 1, 2, 3, 4}; // Исходный массив
        int sum = 0;
        for (int i = 0; i < arrayX.length; i++) {
            sum = sum + arrayX[i];
        }
        System.out.println("Сумма массива = " + sum);
    }


}
