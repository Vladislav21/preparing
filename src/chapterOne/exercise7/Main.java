package chapterOne.exercise7;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите получить готовый список(1) или создать свой(2)?");
        int data = scanner.nextInt();
        if (data == 1) {
            list.add(14);
            list.add(25);
            list.add(11);
            list.add(3);
            list.add(46);
            list.add(0);
            list.add(-23);
            list.add(144);
            list.add(4);
            list.add(8);
            list.add(9);
        } else {
            System.out.println("Введите с консоли 11 целых чисел для помещения их в массив: ");
            while (list.size() <= 10) {
                int i = scanner.nextInt();
                list.add(i);
            }
        }
        System.out.println(list);
        System.out.println("Проверка на четность(1) или нечетность(2): ");
        int choice = scanner.nextInt();
        checkParity(list, choice);
        System.out.println("Проверка на MAX(1) и MIN(2): ");
        int choice1 = scanner.nextInt();
        checkMaxOrMin(list, choice1);
        System.out.println("Проверка на деление на 3(1) и на деление на 9(2): ");
        int choice2 = scanner.nextInt();
        checkParityOn3Or9(list, choice2);
        System.out.println("Проверка на деление на 5 и 7: ");
        checkParityOn5And7(list);
        System.out.println("Расположение по убыванию: ");
        descendingOrder(list);
    }

    public static void checkParity(List<Integer> list, int i) {
        List<Integer> newlist1 = new ArrayList<>();
        List<Integer> newlist2 = new ArrayList<>();
        for (Integer num : list) {
            if (num % 2 == 0) {
                newlist1.add(num);
            } else {
                newlist2.add(num);
            }
        }
        if (i == 1)
            System.out.println(newlist1);
        if (i == 2)
            System.out.println(newlist2);
    }

    public static void checkMaxOrMin(List<Integer> list, int i) {
        if (i == 1) {
            int max = list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();
            System.out.println(max);
        }
        if (i == 2) {
            int min = list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMin();
            System.out.println(min);
        }
    }

    public static void checkParityOn3Or9(List<Integer> list, int i) {
        if (i == 1) {
            List<Integer> numbers = list.stream().filter(numb -> numb % 3 == 0).collect(Collectors.toList());
            System.out.println(numbers);
        }
        if (i == 2) {
            List<Integer> numbers = list.stream().filter(numb -> numb % 9 == 0).collect(Collectors.toList());
            System.out.println(numbers);
        }
    }

    public static void checkParityOn5And7(List<Integer> list) {
        List<Integer> listnew = new ArrayList<>();
        List<Integer> numbers1 = list.stream().filter(numb -> numb % 5 == 0).filter(numb -> numb != 0).collect(Collectors.toList());
        List<Integer> numbers2 = list.stream().filter(numb -> numb % 7 == 0).collect(Collectors.toList());
        listnew.addAll(numbers1);
        listnew.addAll(numbers2);
        System.out.println(listnew); //убрать нули
    }

    public static void descendingOrder(List<Integer> list) {

        List<Integer> listnew = list.stream().sorted(((o1, o2) -> -o1.compareTo(o2))).collect(Collectors.toList());
        System.out.println(listnew);
    }
}
