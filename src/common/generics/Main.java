package common.generics;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? super Integer> list1 = Arrays.asList(0, 2, 3, 5);
        List<Integer> list3 = Arrays.asList(1, 45, 52, 2);
        List<String> list2 = Arrays.asList("Партизна", "Матвей");
        int a = 2;
        String b = "";
        String c = "Ананас ";
        Test test = new Test();
        Test1<Integer> test1 = new Test1<>(2);
        Test2 test2 = new Test2();


        try {
            test.compute(list1);
            test.compute(list2);
            System.out.println("test1: " + test1.getParam());
            System.out.println("test2: " + test2.sum(list3));
            Test3.compute(a);
            Test3.compute(b);
            System.out.println(Test3.compute1(c));
            System.out.println(Test3.compute1(a));
        } catch (Exception e) {
            System.out.println("Ошибка");
        }

    }
}
