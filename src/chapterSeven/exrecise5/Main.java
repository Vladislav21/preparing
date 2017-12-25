package chapterSeven.exrecise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Введите после какого символа будет подстановка подстроки: ");
        int k = scanner.nextInt();
        scanner.close();
        String[] massiv = text.toLowerCase().split(" ");
        String substr = "кар";
        for(String s : massiv){
            StringBuffer sb = new StringBuffer(s);
            sb.insert(k,substr);
            System.out.print(sb + " ");
        }
    }
}
