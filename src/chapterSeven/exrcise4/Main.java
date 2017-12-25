package chapterSeven.exrcise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст с длиной слов 5 знаков: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] massiv = str.toLowerCase().split(" ");
        for (String s:massiv){
            if(s.length()==5)
            System.out.print(s + " ");
        }
        int number = massiv.length - 1;
        System.out.println("Введите цифру от 0 до " + number);
        int result = scanner.nextInt();
        String subStr = massiv[result].substring(2, 4);
        System.out.println(subStr);
        for (String s:massiv){
            if (s.length()==5)
            s = subStr;
                System.out.print(s + " ");
            }
        }
    }

