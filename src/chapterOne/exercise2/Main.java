package chapterOne.exercise2;

public class Main {
    public static void main(String[] args) {
        args = new String[]{"Петя", "Вася", "Леонид"};
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("Данные args " + "[" + i + "]:" + " " + args[i]);
        }
    }
}
