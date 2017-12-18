package chapterTwo.exercise8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько строк хотите написать? ");
        int n = scanner.nextInt();
        System.out.println("Вводите: ");
        for(int i =0;i<n;i++){
            String str = scanner.next();
            list.add(str);
        }
        System.out.println("Полученный список: ");
        System.out.println(list);
        findWordPalindrom(list);
    }

    public static int countEqualSymmetricSymbols(String s){
        String word = s.toLowerCase();
        int result = 0;
        char[] massiv = word.toCharArray();
        for (int i=0;i<(massiv.length+1)/2;i++){
            for (int j=massiv.length-1;j>(massiv.length-((massiv.length+1)/2))-1;j--){
                if(massiv[i]==massiv[j]){
                    result++;
                }
            }
        }
        return result;
    }

    public static void findWordPalindrom(List<String> list){
        String result = null;
        for(String s:list){
            if(countEqualSymmetricSymbols(s)==(s.length()+1)/2){
                result = s;
            }
        }
        System.out.println("Слово полиндром: "+result);
    }
}
