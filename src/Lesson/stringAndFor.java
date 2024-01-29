package Lesson;

import java.util.Arrays;
/**
 * Функция строки
 * */
public class stringAndFor {

    public static void main(String[] args){

        char [] s1 = {'H','e','l','l','o'};
        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i]);
        }
        System.out.println("");
        System.out.println("---------------------------");

        String s2 = "Hello";
        for (int i = 0; i < s2.length(); i++) {
            System.out.print(s2.charAt(i));
        }
    }
}
