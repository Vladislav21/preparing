package chapterTwo.exercise6;

import java.util.*;

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
        searchWordInOrder(listt);
    }

    public static int transferCharToCode(char a) {
        int i;
        i = Character.valueOf(a);
        return i;
    }

    public static String sortWordinCode(String word) {
        char[] chars = word.toCharArray();
        String result;
        for (int i = chars.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (transferCharToCode(chars[j]) < transferCharToCode(chars[j + 1])) {
                    char tmp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = tmp;
                }
            }
        }
        result = new String(chars);
        return result;
    }

    public static void searchWordInOrder(List<String> list) {
        String newword;
        for (String word : list) {
            newword=word.toLowerCase();
            if (newword.equals(sortWordinCode(newword)))
                System.out.println(newword);
            else {
                System.out.println("У слова: "+newword+" символы не идут в порядке возрастания их кодов");
            }
        }
    }
}

