package chapterOne.exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password = "dkflbckfd211095";
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String end = "0";
        while (flag) {
            System.out.println("Введите пароль: ");
            String pass = scanner.next();
            if (pass.equals(end)) flag = false;
            else {
                if (pass.equals(password)) {
                    System.out.println("Пароль верен. Доступ разрешен");
                } else {
                    System.out.println("Пароль неверен. Доступ запрещен");
                }
            }
        }
    }
}
