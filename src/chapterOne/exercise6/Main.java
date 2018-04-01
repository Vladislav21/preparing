package chapterOne.exercise6;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee slave = new Employee("Хромов");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, Calendar.MAY, 2);
        setTasks(slave);
        System.out.println("Дата сдачи работы: " + calendar.getTime());
    }

    public static void setTasks(Employee slave) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Выберите задание, которое должен сделать ваш раб:" + "\n" +
                " 1 - Выкинуть мусор\n 2 - Сделать коффе\n");
        Scanner scanner = new Scanner(System.in);


        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Рабу: " + slave + " дано задание выкинуть мусор!\nДата принятия приказа: " + calendar.getTime());
                break;
            case 2:
                System.out.println("Рабу: " + slave + " дано задание сделать коффе!\nДата принятия приказа: " + calendar.getTime());
                break;
        }
    }
}//local DAta
