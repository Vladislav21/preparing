package common.strings;

public class Main {
    public static void main(String[] args) {
        String str1 = new String();
        str1 = "Гусь";
        System.out.println(str1);
        StringBuffer str = new StringBuffer(str1);
        str.delete(1,2);
        System.out.println(str);
    }
}
