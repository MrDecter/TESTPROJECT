package Lesson;

public class maxElemArray {

    public static void main(String[] args){

        int[] arrayX = {1321, 12, 54, -84, 22, -887, 74, 3, 5, 6, -9, 55555, 1, 2, 3, 4}; // Исходный массив

        int max = arrayX[0];

        for (int i = 0; i < arrayX.length; i++) {
            if(arrayX[i] > max){
                max = arrayX[i];
            }
        }
        System.out.println("Максимальное значение в массиве: " + max);
    }

}
