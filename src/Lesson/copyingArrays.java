package Lesson;

import java.util.Arrays;
//Копирование массива
public class copyingArrays {
    public static void main(String[] args){

        int[] arrayX = {1321, 12, 54, 84, 22, 887, 74, 3, 5, 6, 9, 0, 1, 2, 3, 4}; // Исходный массив
        int[] arrayY = new int[arrayX.length];                                     // Целевой массив
        System.out.println(Arrays.toString(arrayX));                               // Проверка значенй
        System.out.println(Arrays.toString(arrayY));

        /***
         * Этот метод принадлежит классу java.lang.System .
         * Он копирует содержимое подмассива указанной длины из данного исходного массива в другой массив,
         * называемый целевым массивом. Исходный массив называется src, а целевой массив — dest .
         * Количество элементов задается аргументом len .
         *
         * Структура: public static void arraycopy(Object src, int srcIndex, Object dest, int destIndex, int len)
         *
         * src : это исходный массив.
         * srcIndex : это начальный индекс исходного массива.
         * dest : это массив назначения.
         * destIndex : это начальный индекс целевого массива.
         * len : это количество элементов, которые необходимо скопировать из исходного массива в целевой массив.
          */
        System.arraycopy(arrayX, 0, arrayY, 0, arrayX.length);
        System.out.println(Arrays.toString(arrayY));
    }
}
