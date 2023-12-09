package oop_practice;

/**
 * Данный класс создан для практики в ООП
 * и основении основных принципов
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
        //Создание вызова контруктора с 2 параметрами
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
