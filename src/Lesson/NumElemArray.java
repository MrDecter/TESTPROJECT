package Lesson;

/**
 * Функция поиска кол-ва элемента х в массиве
 * */
public class NumElemArray {

    public static void main(String[] args){

        int[] arrayX = {1321, 3, 54, -84, 22, -887, 74, 3, 5, 6, -9, 55555, 1, 2, 3, 4};

        int x = 3;
        int result = 0;

        for (int j : arrayX) {
            if (j == x) {
                result++;
            }
        }
        System.out.println("Кол-во элемента: " + x + " в массиве = " + result);
    }
}
