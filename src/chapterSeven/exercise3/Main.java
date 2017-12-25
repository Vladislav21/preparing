package chapterSeven.exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String text1 = text.toLowerCase();

        String newText = text1.replaceAll("ра","ро");
        System.out.println(newText);


    }
}
