package Lesson;

import java.util.Arrays;
/**
 * Функция поиска числового элемента в массиве
 * */
public class elementSearch {
    public static void main(String[] args){

        int[] array = {1321, 12, 54, 84, 22, 887, 74, 3, 5, 6, 9, 0, 1, 2, 3, 4};
        int x = 84;
        int xIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == x){
                xIndex = i;
            }

            System.out.println(i);
        }

        System.out.println("xIndex - " + xIndex);

    }
}
