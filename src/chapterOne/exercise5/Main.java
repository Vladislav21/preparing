package chapterOne.exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println("Введенные числа: "+ firstNumber+" "+ secondNumber);
        int summ  = firstNumber+secondNumber;
        System.out.println("Сумма чисал: "+summ);
        int multiply = firstNumber*secondNumber;
        System.out.println("Произведение чисел: "+multiply);
    }
}
