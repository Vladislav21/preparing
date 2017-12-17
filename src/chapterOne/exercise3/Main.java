package chapterOne.exercise3;

public class Main {
    public static void main(String[] args) {
        args = new String[]{"Иван", "Сергей", "Влад" + "\n"};
        System.out.println("Без перехода на новую строку: ");
        for (int i = 0; i <= args.length - 1; i++)
            System.out.print(" " + args[i]);
        System.out.println("С переходои на новую строку: ");
        for (int i = 0; i <= args.length - 1; i++) {
            System.out.println(" " + args[i] + " ");
        }
    }
}
