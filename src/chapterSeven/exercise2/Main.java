package chapterSeven.exercise2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String text1 = text.toLowerCase();

        //преобразуем стринг в массив чаров
        char[] massivText = text1.toCharArray();

        for (int i = 0; i < massivText.length; i++) {
            System.out.print(massivText[i] + "   ");
        }


        System.out.println("\n");


        for (char symbol : massivText) {
            int i = alphabet.lastIndexOf(symbol);
            i++;
            System.out.print(i + "  ");
        }
    }
}
