package common.generics;

public class Test3 {

    private static int transformation(int element){
        return (int) Math.sqrt((element*8));
    }

    public static <T> void compute(T element) {
        String str = (element instanceof String) ? "Hello" : "Bye";
        System.out.println(str);
    }

    public static  <T> T compute1(T element) {
        T t = null;
        if (element instanceof String){
           t = (T) (element+"Hello");
        }
        if (element instanceof Integer){
            t = (T) (Integer.valueOf(transformation((Integer) element)));
        }
        return t;
    }
}
