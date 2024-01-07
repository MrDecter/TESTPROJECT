package other.goblin_game;
import java.util.Random;
import java.util.Scanner;

public class Gamer {
    String name;
    int power;
    int perception;
    int endurance;
    int charisma;
    int intelligence;
    int dexterity;
    int luck;
    public void generate_gamer(){
                                                //Создание объектов
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
                                                //Ввод имени
        System.out.println("Введите имя: ");
        this.name = scan.nextLine();
                                                //Генерация персонажа и вывод характеристик
        System.out.println("Создание персонажа...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.power = random.nextInt(9) + 1;
        this.perception = random.nextInt(9) + 1;
        this.endurance = random.nextInt(9) + 1;
        this.charisma = random.nextInt(9) + 1;
        this.intelligence = random.nextInt(9) + 1;
        this.dexterity = random.nextInt(9) + 1;
        this.luck = random.nextInt(9) + 1;

        System.out.println("\n\nПерсонаж: " + name );
        System.out.println("-ХАРАКТЕРИСТИКИ- " +
                "\nСила: " + power +
                "\nВосприятие: " + perception +
                "\nВыносливость: " + endurance +
                "\nХаризма: " + charisma +
                "\nИнтеллект: " + intelligence +
                "\nЛовкость: " + dexterity +
                "\nУдача: " + luck);
    }
}
