package common.logging;

import java.io.*;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());


    public static void main(String[] args) throws IOException {
        int[] numbers = {11,22,34,47,51,62,73,85,96,107,111,122,132,141,152,166,171,181};
        for (int i = 0; i < (numbers.length/2); i++) {
            int a = numbers[i];
            int b = numbers[i+1];
            double v = actionOne(a, b);
            log.info(String.valueOf(v));
        }
    }
    private static double actionOne(int a, int b){
        a++;
        b++;
        return Math.sqrt((a+b)*2);
    }
}
