package common.InputData;

//C:\Users\Владислав\IdeaProjects\Mikhel\preparing\testFile.txt

import java.io.*;
import java.util.*;

public class Spectra {


    private static List<Double> waveLength = new ArrayList<>();
    private static List<Double> intensity = new ArrayList<>();
    private static List<String> list = new ArrayList<>();
    private static final String pathToFile = "C:\\Users\\Владислав\\IdeaProjects\\Mikhel\\preparing\\test.txt";


    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File(pathToFile));
            while (in.hasNextLine()) {
                list.add(in.next());
            }
            for (int i = 0; i < list.size(); i++) {
                waveLength.add(Double.valueOf(list.get(i)));
                i++;
                intensity.add(Double.valueOf(list.get(i)));
            }
            System.out.println(waveLength.toString() + "\n" + intensity.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


