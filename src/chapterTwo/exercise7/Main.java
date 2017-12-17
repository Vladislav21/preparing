package chapterTwo.exercise7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> listt = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Какое количество слов хотите добавить?");
        n = scanner.nextInt();
        System.out.println("Введите слова: ");
        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            listt.add(word);
        }
        System.out.println("Полученные слова: ");
        System.out.println(listt);
    }
}
