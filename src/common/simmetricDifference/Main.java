package common.simmetricDifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static <T> Collection<T> symetricDifference(Collection<T> a, Collection<T> b) {
        Collection<T> intersection = new ArrayList<>(a);
        intersection.retainAll(b);
        Collection<T> result = new ArrayList<>(a);
        result.addAll(b);
        result.removeAll(intersection);
        return result;
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
        List<String> b = new ArrayList<>(Arrays.asList("3", "4", "5", "6", "7"));
        Collection<String> c = symetricDifference(a, b);
        System.out.println("Collection a: " + Arrays.toString(a.toArray()));
        System.out.println("Collection b: " + Arrays.toString(b.toArray()));
        System.out.println("Collection c: " + Arrays.toString(c.toArray()));
    }
}
