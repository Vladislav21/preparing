package chapterTwo.exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int n;
        System.out.println("Какой количество строк хотите ввести?");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку: ");
            String str = scanner.next();
            list.add(str);
        }
        System.out.println("Полученный список: ");
        System.out.println(list);
        findWordsWithEqualNumberOfVowelsAndConsonantsInLatin(list);

    }

    public static List<String> findWordsConsistLatinWord(List<String> list) {
        Pattern pattern = Pattern.compile("[a-z]+");
        List<String> result = new ArrayList<>();
        for (String word : list) {
            Matcher matcher = pattern.matcher(word.toLowerCase());
            if (matcher.matches()) {
                result.add(word);
            }
        }
        return result;
    }

    public static void findWordsWithEqualNumberOfVowelsAndConsonantsInLatin(List<String> list) {
        List<String> wordsInLatin = findWordsConsistLatinWord(list);
        System.out.println("Слова, содержащие только латинские символы: " + wordsInLatin + "\n" + "И их количество равно: " + wordsInLatin.size());
        int countVowels, countConsonants;
        System.out.println("Слова с равным числом гласных и согласных букв: ");
        for (String word : list) {
            countVowels = word.replaceAll("[^aeiou]", "").length();
            countConsonants = word.replaceAll("[aeiou]", "").length();
            if (countVowels == countConsonants) {
                System.out.println(word);
            }
        }
    }
}
