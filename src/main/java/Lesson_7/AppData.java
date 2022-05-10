package Lesson_7;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AppData {
    public static void main(String args[]) {

        String[] headers = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 123},
                {300, 400, 500}};

        File file = new File("test.csv");
        try (PrintWriter writer = new PrintWriter(file)) {

            for (int i = 0; i < headers.length; i++) {
                writer.print(headers[i]);
                writer.print(";");
            }

            writer.println();

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    writer.print(data[i][j]);
                    writer.print(";");
                }
                writer.println();
            }

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("test.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
            }
            System.out.println(records);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}