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
        findWordWithDifferentSymbols(listt);
    }

    public static int countEqualSymbols(String s) {
        String word = s.toLowerCase();
        char[] str = word.toCharArray();
        int result = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = str.length - 1; j > i - 1; j--)
                if (str[i] == str[j]) {
                    result++;
                }
        }
        return result;
    }

    public static void findWordWithDifferentSymbols(List<String> list) {
        String result = null;
        for (String word : list) {
            if (countEqualSymbols(word) == word.length()) {
                result = word;
                System.out.println("Слово с разными символами:" + result);
            }else {
                System.out.println("Слово: "+ word +" не имеет всех разных символов");
            }
        }
    }
}
