package common.staticBlock;

import java.util.LinkedList;
import java.util.List;

class Foo {
    static List<Character> abc;
    static {
        abc = new LinkedList<Character>();
        for (char c = 'A'; c <= 'Z'; ++c) {
            abc.add( c );
        }
    }
}