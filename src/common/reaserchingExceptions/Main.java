package common.reaserchingExceptions;
import java.io.*;
import java.util.logging.Logger;

public class Main implements Serializable {

    private static final Logger logger = Logger.getLogger(Main.class.getSimpleName());

    public static void main(String[] args){
        String FILE_NAME = "testData.txt";
        String str = "Hello World\n";
        FileWriter fw = null;
        BufferedWriter bf = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fw = new FileWriter(FILE_NAME, true);
            bf = new BufferedWriter(fw);
            fr = new FileReader(FILE_NAME);
            br = new BufferedReader(fr);
            bf.write(str);
            bf.flush();
            System.out.println(br.readLine());
        } catch (IOException e) {
            logger.warning(e.getMessage());
        } finally {
            try {
                if (fw != null & bf != null & fr != null & br != null) {
                    fw.close();
                    bf.close();
                    fr.close();
                    br.close();
                    System.out.println("I closed your streams");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
