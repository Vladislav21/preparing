package common.valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("((()()()(([][][][]");
        list.add("()[]");
        list.add("[()]");
        list.add(")()()({}");
        for (String s : list) {
            System.out.println(isValid(s));
        }
    }

    public static boolean isValid(String s) {
        char[] str = s.toCharArray();
        Stack stack = new Stack();
        char check;
        for (char c : str) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    check = (char) stack.pop();
                    if(c==')'&& check ==')'){
                        return false;
                    }
                    if(c=='}'&& check =='}'){
                        return false;
                    }
                    if(c==']'&& check ==']'){
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
/*    public static boolean isValid(String s) {
        char[] str = s.toCharArray();
        Stack stack = new Stack();
        char check;
        for (char c: str) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    check = (char) stack.pop();
                    if (c == '}' && check != '{') {
                        return false;
                    } else if (c == ']' && check != '[') {
                        return false;
                    } else if (c == ')' && check != '(') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }

        return true;
    }*/

}
