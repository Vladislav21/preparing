package chapterTwo.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Training {
    public static void main(String[] args) {
        String[] strings = {"Кошка", "Собака", "Терминатор", "Ор"};
        for (int i = strings.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (strings[j].length()>strings[j+1].length()){
                    String tmp = strings[j];
                    strings[j]=strings[j+1];
                    strings[j+1] = tmp;
                }
            }
        }
        List<String> list = Arrays.asList(strings);
        System.out.println(list);
    }
}
