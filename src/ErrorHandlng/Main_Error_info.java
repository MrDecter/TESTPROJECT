package ErrorHandlng;

import java.io.IOException;
import java.util.logging.*;

/**
 * Исключения - это любая ошибка, которая возникает в ходе выполнения программы.
 * У всех исключений есть общий класс-предок Throwable.
 * Error - это критическая ошибка во время исполнения программы, связанная с работой
 * виртуальной машины Java.
 *
 * --Наиболее известные ошибки--
 * StackOverflowError - возникает, например, когда метод бесконечно вызывает сам себя
 * OutOfMemoryError - возникает, когда недостаточно памяти для создания новых объектов
 *
 * Exceptions - это собственно исключение, незапланированная ситуация.
 *
 * Все исключения делеятся на два типа: Проверяемые(checked) и непроверяемые(unchecked)
 * Их разница в том, что непроверяемые, компилятор не ожидает, и чаще всего они явл.
 * следствием ошибок программиста.
 *
 * Все ПРОВЕРЯЕМЫЕ исключения происходят от класса Exception
 * Все НЕПРОВЕРЯЕМЫЕ исключения происходят от класса RuntimeException
 *
 *
 * */
public class Main_Error_info {
    static final Logger logger = Logger.getLogger(Dog.class.getName());
    public static void main(String[] args) throws IOException {
                                                //Создание логера и отображение уровней
        logger.log(Level.FINE,"fine");
        logger.log(Level.INFO,"info");
        logger.log(Level.WARNING,"warning", new Throwable());

        Handler  consolehandler = new ConsoleHandler();
        Handler  Filehandler = new FileHandler();
        logger.setUseParentHandlers(false);     //Отключение родительского отображения
        logger.addHandler(Filehandler);         //Создание файла логирования
        logger.info("info");               //Пример иной записи

        Dog dog = new Dog("Мухтар");
        dog.putCollar();
        dog.putMuzzle();
                                                //Обработка и использование исключений try\catch
        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем снаряжение! Ошейник надет? " + dog.isCollarPutOn + "\r\n Поводок надет? "
                    + dog.isLeashPutOn + "\r\n Намордник надет? " + dog.isMuzzlePutOn);
        }
    }

                                            //Пример обработки ошибок
    public static class Dog {
        String name;
        boolean isCollarPutOn;
        boolean isLeashPutOn;
        boolean isMuzzlePutOn;

                                                //Имя собаки
        public Dog(String name) {
            this.name = name;
        }

                                                //Метод ошейника
        public void putCollar() {

            System.out.println("Ошейник надет!");
            this.isCollarPutOn = true;
        }

                                                //Метод поводка
        public void putLeash() {

            System.out.println("Поводок надет!");
            this.isLeashPutOn = true;
        }

                                                //Метод намордника
        public void putMuzzle() {
            System.out.println("Намордник надет!");
            this.isMuzzlePutOn = true;
        }

                                                //Указываем что в методе может возникнуть исключение DogIsNotReadyException.
        public void walk() throws DogIsNotReadyException {
            System.out.println("Собираемся на прогулку!");
            if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
                System.out.println("Ура, идем гулять! " + name + " очень рад!");
            } else {
                throw new DogIsNotReadyException("Собака " + name + " не готова к прогулке! Проверьте экипировку!");
            }
        }

    }
}
