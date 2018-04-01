package common.InputData;

import java.io.*;
import java.util.*;

public class Spectra {

    private static List<Point> points = new ArrayList<>();
    private static List<String> list = new ArrayList<>();
    private static final String pathToFile = "C:\\Users\\Владислав\\IdeaProjects\\Mikhel\\preparing\\test.txt";
    private static int check = 9;
    private static char checkChar = (char) check;
 /*   private static int secondCheck = 32;
    private static char secondCheckChar = (char) secondCheck;*/

    private static int countBeforeCheckSymbol(String str) {
        int count = 0;
        char[] lineChar = str.toCharArray();
        for (char symbol : lineChar) {
            if (symbol != checkChar) {
                count++;
            }
            if (symbol == checkChar) {
                break;
            }
        }
        return count;
    }

    private static int countAfterCheckSymbol(String str) {
        int count = 0;
        count = str.indexOf(checkChar);
        return count;
    }

    public static void main(String[] args) {
        try {
            Point point;
            BufferedReader bf = new BufferedReader(new FileReader(pathToFile));
            String line;
            while ((line = bf.readLine()) != null) {
                int count = countBeforeCheckSymbol(line);
                int count2 = countAfterCheckSymbol(line);
                char[] lineChar = line.toCharArray();
                char[] firstNumber = new char[count];
                char[] secondNumber = new char[line.length() - count2];
                for (int i = 0; i < count; i++) {
                    firstNumber[i] = lineChar[i];
                }
                for (int i = count2; i < line.length(); i++) {
                    secondNumber[i - count2] = lineChar[i];
                }

                String firstNumberToString = new String(firstNumber);
                String secondNumberToString = new String(secondNumber);
                list.add(firstNumberToString);
                list.add(secondNumberToString);
            }
            bf.close();
            for (int i = 0; i < list.size(); i++) {
                point = new Point();
                point.setX(Double.valueOf(list.get(i)));
                i++;
                point.setY(Double.valueOf(list.get(i)));
                points.add(point);
            }
            System.out.println(points.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






