package chapterOne.exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Hello privet = new Hello();
        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ip);
        boolean flag = true;
        while (flag){
        System.out.println("Введите данные:");
        try {
            String data = bf.readLine();
            privet.sayHello();
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }}

    }
}