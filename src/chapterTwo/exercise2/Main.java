package chapterTwo.exercise2;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой количество строк хотите ввести?");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку:");
            String str = scanner.next();
            addstr(str, list);
        }
        System.out.println("Полученный список: ");
        System.out.println(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()) return 0;
                else if (o1.length()<o2.length()) return 1;
                else return  -1;
            }
        });
        System.out.println("Сортировка методом sort:");
        System.out.println(list);
        System.out.println("Сортировка пузырьковым методом:");
        String[] str = list.toArray(new String[list.size()]);
        for (int i = str.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (str[j].length() > str[j + 1].length()) {
                    String tmp = str[j];
                    str[j]=str[j+1];
                    str[j+1] = tmp;
                }
            }
        }
        List<String> listnew = Arrays.asList(str);
        ArrayList<String> arrayList = new ArrayList<>(listnew);
        System.out.println(arrayList);
    }

    public static void addstr(String str, List<String> list) {
        list.add(str);
    }
}
