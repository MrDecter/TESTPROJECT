package Lesson;

import java.util.Arrays;
/**
 * Пример использования методов с строками
 * */
public class StringMetods {
    public static void main(String[] args){
        String s1 = "Hello";
        System.out.println("0. Строка: "+ s1);
        System.out.println("1. Длина строки: "+ s1.length());
        System.out.println("2. Символ по индексу 2 : "+ s1.charAt(2));
        System.out.println("3. Массив без обертки: "+ s1.toCharArray());
        System.out.println("4. Массив с оберткой: "+ Arrays.toString(s1.toCharArray()));
        System.out.println("5. Сожерит ли строка символ e: "+ s1.contains("e"));
        System.out.println("6. Содержит ли строка символ E: "+ s1.contains("E"));
        System.out.println("7. Какой индекс у символа о: "+ s1.indexOf("o"));
        System.out.println("8. Какой индекс у символа O: "+ s1.indexOf("O"));
        System.out.println("9. Какой индекс у символа l: "+ s1.indexOf("l"));
        System.out.println("10. Какой обратный индекс у символа l: "+ s1.lastIndexOf("l"));
        System.out.println("11. Начинается ли строка с символов He: "+ s1.startsWith("He"));
        System.out.println("12. Заканчивается ли строка на символ о: "+ s1.endsWith("o"));
        System.out.println("13. Является ли строка пустой?: "+ s1.isEmpty());
        System.out.println("14. Приведение к верхнему регистру: "+ s1.toUpperCase());
        System.out.println("15. Приведение к нижнему регистру: "+ s1.toLowerCase());
        System.out.println("16. Повторение строки 3 раза: "+ s1.repeat(3));
        System.out.println("17. Замена символа о на F: "+ s1.replace("o","F"));
        System.out.println("18. Вывод строки с индекса 2 до 4: "+ s1.substring(2,4));
        System.out.println("19. Вызерать символ l в строке: "+ Arrays.toString(s1.split("l")));
        System.out.println("20. Удаление начальных и конечных пробелов: "+ s1.trim());
        System.out.println("21. Является ли строка пустой?: "+ s1.strip());
        System.out.println("----Создание новой строки----");
        String s2 = "1234567890";
        System.out.println("2.1 Новая строка: " + s2);
        System.out.println("2.2 Реверс строки: ");
        for (int i = s2.length() - 1; i >= 0; i--) {
            System.out.print("" + s2.charAt(i));
        }

    }
}
