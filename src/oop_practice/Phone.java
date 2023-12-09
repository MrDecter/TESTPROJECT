package oop_practice;

/**
 * Данный класс создан для практики в ООП
 * В представленном коде реализованные следующие принципы:
 * 1. Инкапсуляция: свойства и методы Phone объедены в одной лог. ед. - классе.
 * Доступ к свойствам реализован через методы (гетеры) а так же изменению (сеттеры)
 * Это обеспечивает скрытие реализации и защиту данных от несанкционированного доступа
 *
 * 2. Полиморфизм: В классе Phone определены методы с одинаковой сигнатурой,
 * но с разной реализацией. Это позволяет использовать один и тот же интерфейс для работы
 * с разными типами данных
 *
 * 3. Наследование: Класс Phone имеет конструктор с 3-мя параметрами,
 * который вызывает другой конструктор с 2-мя параметрами. Это позволяет создавать
 * производные классы и использовать наследование для повторного использования кода
 * и упрощения сопровождения
 *
 * 4. Абстракция: класс Phone определяет основные характеристики телефона,
 * но не определяет детали реализации этих характеристик. Это делает код более гибким
 * и упрощает его изменение и расшерение
 */
public class Phone {
    //Создание приватных переменных
    private String number;
    private String model;
    private String weight;

    //Установка геттеров и сеттеров
    public String getNumber() {return number;}
    public void setNumber(String number) {this.number = number;}

    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    public String getWeight() {return weight;}
    public void setWeight(String weight) {this.weight = weight;}


    //Создание контрукторов
    public Phone(){

    }
    public Phone(String number, String model, String weight){
        //Создание вызова конструктора с 2 параметрами
        this(number, model);
        this.weight = weight;
    }
    public Phone (String number, String model){
        this.number = number;
        this.model = model;
    }

    //Добавление перегруженного метода
    public void recerev_call (String name){
        System.out.println("Звонит: " + name);
    }
    public void recerev_call (String name, String phohe_number){
        System.out.println("Звонок от: " + name + "\nТелефон: " + phohe_number);
    }

    //Практика с аргументами переменной длинны
    public static void send_message(String... args){
        System.out.println("Сообщение: ");
        for (Object arg : args) {
            System.out.print(arg + " ");
        }
    }
}
