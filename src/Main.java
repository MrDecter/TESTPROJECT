import other.goblin_game.*;
/**
 * 1. Практика в ООП
 *  1.1 Работа с классом Phone
 *  1.2 Работа с классом Person
 */
public class Main {
    public static void main(String[] args) {
        /*
                                                                                                    //1.1 Практика по Phone
        Phone phone1 = new Phone("89193555255", "Samsung", "30sm");
        System.out.println("На ваш номер: " + phone1.getNumber() + " поступил звонок!");
        phone1.recerev_call("Служба безопастности Сбербанка");
        Phone.send_message("Вашу карту заблокировали, просьба сообщите CVV код для разблокировки!");
         */

        /*
                                                                                                //1.2 Практика по Person
        Person Jack = new Person("Jack", "25");
        Person Vadim = new Person("Vadim", "28");
        Jack.talk();
        System.out.println("Извини " + Vadim.getFullName() + " но мне нужно идти в ту сторону");
        Jack.move();
        Vadim.talk();
        System.out.println("Хорошо, удачи " + Jack.getFullName() + "!");
         */


        Gamer Player1 = new Gamer();
        Player1.generate_gamer();
    }
}