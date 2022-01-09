import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n");

        System.out.println(" Конструкторы со всеми параметрами" +
                " Создание параметров:\n");
        Date date = new Date();
        Time time = new Time();
        int kabinet;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print(" Введите кабинет: ");
            if (in.hasNext()) {
                kabinet = in.nextInt();
                break;
            }
            else {
                System.out.println(" Неверное значение");
                in.nextLine();
            }
        } while (true);
        Doctor medic = new Doctor();
        System.out.println("\n Объект");
        Talon one = new Talon(date, time, kabinet, medic);
        one.PrintInfo();
        System.out.println();

        System.out.println(" Конструкторы с одним параметром");
        one = new Talon(medic);
        System.out.println();
        one.PrintInfo();

        System.out.println("\n");

        System.out.println(" Конструкторы без параметров");
        one = new Talon();
        System.out.println();
        one.PrintInfo();

        System.out.println("\n");

        System.out.println(" Инициализация массива через конструктор с одним параметром" +
                " Создание параметра:");
        Doctor for_array = new Doctor();
        System.out.println();
        System.out.println(" Инициализация массива:");
        Talon[] array = new Talon[3];
        for (int number = 0; number < array.length; number++) {
            array[number] = new Talon(for_array);
            System.out.println();
        }
        System.out.println(" Печать массива:");
        for (int number = 0; number < array.length; number++)
            array[number].PrintInfo();

        in.nextLine();
    }
}
