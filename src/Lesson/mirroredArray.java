package Lesson;

import java.util.Arrays;

public class mirroredArray {
    public static void main(String[] args){

        int[] arrayX = {1321, 3, 54, -84, 22, -887, 74, 3, 5, 6, -9, 55555, 1, 2, 3, 4};
        System.out.println("Начальный массив: " + Arrays.toString(arrayX));
        for (int i = 0; i < arrayX.length / 2; i++) {
            int temp = arrayX[i] ;
            arrayX[i] = arrayX[arrayX.length - 1 - i];
            arrayX[arrayX.length - 1 - i] = temp;
        }
        System.out.println("Зеркальный массив: " + Arrays.toString(arrayX));
    }
}
