package common.Average;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] massiv = new int[10];
        for (int i = 0; i < 10; i++) {
            massiv[i] = i;
            System.out.println(massiv[i]);
        }
        System.out.println(Arrays.stream(massiv).average());
    }
}
