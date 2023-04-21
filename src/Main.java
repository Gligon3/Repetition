import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        readLogfile("ideaold.log");

    }
        public static ArrayList<String> readLogfile(String filePath) {
            ArrayList<String> loglines = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    loglines.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return loglines;

        }
    }
