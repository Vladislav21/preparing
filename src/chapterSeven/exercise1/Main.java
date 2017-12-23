package chapterSeven.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char newChar = 'п';
        Scanner scanner = new Scanner(System.in);
        String[] text = {"Мальчик", " пришел", " к", " маме", " и", " спросил", " денег", " на", " хлеб"};
        for (String g:text){
            System.out.print(g);
        }
        System.out.println("\nКакую k-ю букву хотите заменить в словах текста?");
        int k = scanner.nextInt();
        scanner.close();
        char [] word;
        for (int i = 0; i < text.length; i++) {
            if(text[i].length() >= k){
                word = text[i].toCharArray();
                word[k-1] = newChar;
                text[i]  = String.copyValueOf(word);
            }
        }

        for (String s: text){
            System.out.print(s);
        }
    }
}
