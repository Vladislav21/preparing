package chapterTwo.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println("Первая строка: " + str1);
        System.out.println("Вторая строка: " + str2);
        if (str1.length() > str2.length()) {
            System.out.println("Первая строка больше второй\n" +
                    "Длина первой строки: " + str1.length() + "\n" +
                    "Длина второй строки: " + str2.length()
            );
        } else {
            System.out.println("Вторая строка больше второй\n" +
                    "Длина первой строки: " + str1.length() + "\n" +
                    "Длина второй строки: " + str2.length());
        }
    }
}
