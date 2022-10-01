package dirty;

import java.io.*;
import java.util.Base64;

public class EncodingModule {
    public void encodeFromFileToFile() throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(
                    new FileReader("src/main/java/dirty/fileToBeEncrypted.txt"));
            writer = new BufferedWriter(
                    new FileWriter("fileEncrypted.txt"));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                writer.append(encodedLine);
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }

    public void encodeFromFileToDatabase() throws IOException {
        BufferedReader reader = null;
        StringBuilder inputString1 = new StringBuilder();

        try {
            reader = new BufferedReader(
                    new FileReader("src/main/java/dirty/fileToBeEncrypted.txt"));

            String aLine;
            while ((aLine = reader.readLine()) != null) {

                inputString1.append(aLine);
            }
        } finally {

            if (reader != null) {
                reader.close();
            }
        }

        String inputString = inputString1.toString();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
        System.out.println(database);
    }
}