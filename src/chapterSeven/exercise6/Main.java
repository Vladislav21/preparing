package chapterSeven.exercise6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String [] lines = text.toLowerCase().split(" ");
        System.out.println("Введите подстроку: ");
        String substr = scanner.nextLine().toLowerCase();
        scanner.close();
        for(String str: lines){
            StringBuffer bf = new StringBuffer(str);
            if (str.contains(substr)){
                bf.insert(str.length()-1,"кактус");

            }
            System.out.print(bf+" ");
        }

    }
}
