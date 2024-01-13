package Lesson;

public class NumElemArray {

    public static void main(String[] args){

        int[] arrayX = {1321, 3, 54, -84, 22, -887, 74, 3, 5, 6, -9, 55555, 1, 2, 3, 4};

        int x = 3;
        int result = 0;

        for (int i = 0; i < arrayX.length; i++) {
            if (arrayX[i] == x){
                result++;
            }
        }
        System.out.println("Кол-во элемента: " + x + " в массиве = " + result);
    }
}
