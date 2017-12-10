package chapterTwo.exercise4;

import sun.awt.Symbol;

import java.util.ArrayList;
import java.util.Arrays;
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
        findWordWithMinDifferentSymbols(list);

    }

 /*   public static int opredelenieMaxPovtorBukv(String word) {
        char[] SoderjitSlovo = word.toCharArray();
        int k = 0; // промежуточная переменная для обнуления
        int[] massivIzKolichestvaBukvVSlove = new int[33];
        for (char i = 'а'; i < 1103; i++) {
            for (int x = 0; x < 33; x++) {
                for (int j = 0; j < SoderjitSlovo.length; j++) {
                    if (SoderjitSlovo[j] == i) {
                        k++;
                    }
                }
                massivIzKolichestvaBukvVSlove[x] = k;
                k = 0;
            }
        }

        for (int i = massivIzKolichestvaBukvVSlove.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (massivIzKolichestvaBukvVSlove[j] > massivIzKolichestvaBukvVSlove[j + 1]) {
                      int tmp = massivIzKolichestvaBukvVSlove[j];
                      massivIzKolichestvaBukvVSlove[j] = massivIzKolichestvaBukvVSlove[j+1];
                      massivIzKolichestvaBukvVSlove[j+1]=tmp;
                }
            }
        }
        int maxKolvoBukvvSlove = massivIzKolichestvaBukvVSlove[32];
        return maxKolvoBukvvSlove;
    }*/


    public static int countDifferentSymbolsInWord(String word) {
        int result = 0;
        char[] wordArray = word.toCharArray();
        for (int i = wordArray.length - 1; i > 0; i--) {
            if (wordArray[0] != wordArray[i]) {
                result++;
            }
        }
        return result;
    }

    public static void findWordWithMinDifferentSymbols(List<String> list) {
        String[] masiv = list.toArray(new String[list.size()]);
        String result = masiv[0];
        for (int i = 1; i < masiv.length; i++) {
            if (countDifferentSymbolsInWord(result) > countDifferentSymbolsInWord(masiv[i])) {
                result = masiv[i];
            }
        }
        System.out.println("Слово с максимально разными символами: " + result);
    }

}
