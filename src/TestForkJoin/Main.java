package TestForkJoin;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        int[] elements = {2,5,1,6,45,23,32,3,145};
        ForkJoinPool pool = new ForkJoinPool();
        SortAction sortAction = new SortAction(elements,0,elements.length);
        pool.invoke(sortAction);
        System.out.println(Arrays.toString(elements));
    }
}
