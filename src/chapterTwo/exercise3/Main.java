package chapterTwo.exercise3;

import java.util.*;

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
            addlist(str, list);
        }
        System.out.println("Полученный список: ");
        System.out.println(list);
        int average = getaverage(list);
        List<String> newlist = new ArrayList<>();
        for(String str:list){
            if (str.length()<average){
                newlist.add(str);
            }
        }
        System.out.println("Список, у котороый длина меньше средней:");
        System.out.println(newlist);
        List<String> newlist1 = new ArrayList<>();
        for(String str: list){
            if(str.length()>average){
                newlist1.add(str);
            }
        }
        System.out.println("Список, у котороый длина больше средней:");
        System.out.println(newlist1);
    }

    public static void addlist(String str, List<String> list) {
        list.add(str);
    }

    public static int getaverage(List<String> list) {
        int sum = 0;
        for (String str : list) {
            sum += str.length();
        }
        return sum / list.size();
    }
}
